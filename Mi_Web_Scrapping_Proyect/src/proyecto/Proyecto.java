package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;


import org.apache.commons.lang3.StringEscapeUtils;
import org.htmlcleaner.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;
import org.xml.sax.SAXException;


public class Proyecto {

	   private static Document abrirSitio(String ruta){
			try {
				// Creamos una instancia de HtmlCleaner y le pedimos que parsee la página
				TagNode tagNode;
				HtmlCleaner cleaner=new HtmlCleaner();
				
				CleanerProperties props = cleaner.getProperties();
				 
				props.setCharset("UTF-8");
				props.setTranslateSpecialEntities(false);
				props.setRecognizeUnicodeChars(true);
				props.setTransResCharsToNCR(false);
				
				URL url=new URL(ruta);
				HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
				httpcon.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:29.0) Gecko/20100101 Firefox/29.0");
				tagNode=cleaner.clean(httpcon.getInputStream(),"UTF-8");

				//for(TagNode s:tagNode.getAllElements(true))
				//System.out.println(s.getText());
				
				// Para trabajar con DOM, necesitamos serializarlo y generar el arbol DOM
				Document document = new DomSerializer(props).createDOM(tagNode);
				
		      	return document;				
				
			} catch (IOException | ParserConfigurationException e) {
				System.out.println("No se ha podido leer HTML");
				e.printStackTrace();
			    return null;
			}
	   }
	   
	   private static Document abrirArchivo(String ruta){
				try {
					// Creamos una instancia de HtmlCleaner y le pedimos que parsee la página
					TagNode tagNode;
					HtmlCleaner cleaner=new HtmlCleaner();
					tagNode=cleaner.clean(new File(ruta));

					// Para trabajar con DOM, necesitamos serializarlo y generar el arbol DOM
					Document document = new DomSerializer(new CleanerProperties()).createDOM(tagNode);
					
			      	return document;				
					
				} catch (IOException | ParserConfigurationException e) {
				    return null;
				}
	   }
	   
	   private static boolean guardarArchivoUsandoXSLT(Document doc, String rutaXsl, String ruta) throws UnsupportedEncodingException, FileNotFoundException{
			try {
				
		        File xsltFile = new File(rutaXsl);

		        // JAXP lee utilizando una instancia Source
		        Source xsltSource = new StreamSource(xsltFile);
		        Source xmlSource = new DOMSource(doc);
		        Result htmlResult = new StreamResult(ruta);

		        // Transformer soporta procesado XSLT
		        TransformerFactory transFact = TransformerFactory.newInstance();
		        Transformer trans = transFact.newTransformer(xsltSource);

		        
		        // Aplicar XSLT y generar html
		        trans.transform(xmlSource, htmlResult);
		    	
		    	return true;
			
			   } catch (TransformerException | TransformerFactoryConfigurationError e) {
				  e.printStackTrace(); 
			      return false;
			   }
	   }
	   
	   /** Aqui le paso un Documento  y una consulta en XPath para que la ejecute y me devuelva un NODO. 
	    * 
	    * @param doc
	    * @param xpath
	    * @return Nodos, me devuelve los nodos(Nodelist).
	    */
	   private static NodeList evaluarXPath(Document doc, String xpath){
					XPathFactory xpFactory = XPathFactory.newInstance();
					XPath xPath = xpFactory.newXPath();
					NodeList nodos;
					try {
						 nodos = (NodeList) xPath.evaluate(
								xpath, doc, XPathConstants.NODESET);
					} catch (XPathExpressionException e) {
						
						nodos=null;
					}
							
				    return nodos;
	   }
	
	   

	   private static String limpiarEntidades(String origen)
	   {
          return StringEscapeUtils.unescapeHtml4(origen);
	   }
	   
	   
	   
	   public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, InterruptedException{
		   String archivoPrecioXsl="archivos/htmlproyecto/indexPrecio.xsl"; 
		   String archivoResultado="archivos/htmlproyecto/Resultado3.html";
		  
		   
		   
		   
		   /**
		    *  web GENBETA.COM
		    */
		   Document docGenBeta =  abrirSitio("http://www.genbeta.com/"); 
		   		   
		   NodeList nodo1Titulo=evaluarXPath(docGenBeta,"//*[@class='section section-articles']//h2/a/text()");
		   NodeList nodo1URL = evaluarXPath(docGenBeta,"//*[@class='section section-articles']//div[@class='article-links']/div[1]/a/@href");
		   NodeList nodo1Cuerpo=evaluarXPath(docGenBeta,"//*[@class='section section-articles']//div[@class='article-summary']");
		   NodeList nodo1Imagen=evaluarXPath(docGenBeta,"//*[@class='section section-articles']//div[@class='figure']/a/img/@src");
		   NodeList nodo1Reserva= null;
		
		   
		   Document docXML=null;
		   try {
			   DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			   DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			   docXML = docBuilder.newDocument();
		   } catch (ParserConfigurationException e) {
			   e.printStackTrace();
		   }
		   
		   Element raiz = (Element)docXML.createElement("noticias"); 
		   docXML.appendChild(raiz);
			    
		   //System.out.println("x aki pasa y tiene "+ nodo1Titulo.getLength()+ " titulares");
		   for(int i=0;i<nodo1Titulo.getLength();i++)
		   {   
			   Node pagina1 = docXML.createElement("noticia");
			   
			   if(nodo1Titulo.item(i)!= null){
				   Node titulo = docXML.createElement("titulo");
				   titulo.setTextContent(limpiarEntidades(nodo1Titulo.item(i).getTextContent()));
				   pagina1.appendChild(titulo);
			   }
			   
			   //URL.setTextContent(nodo1Otros.item(i).getTextContent());
			   if(nodo1Imagen.item(i)!= null){
				   Node imagen = docXML.createElement("imagen");
				   imagen.setTextContent(limpiarEntidades(nodo1Imagen.item(i).getTextContent()));
				   System.out.println(nodo1Imagen.item(i).getTextContent());
				   pagina1.appendChild(imagen);
			   }
			   if(nodo1Cuerpo.item(i)!= null){
				   Node cuerpo = docXML.createElement("cuerpo");
				   cuerpo.setTextContent(limpiarEntidades(nodo1Cuerpo.item(i).getTextContent()));
				   pagina1.appendChild(cuerpo);
			   }  
	
			   
			   //String numero = limpiarEntidades(nodo1Cuerpo.item(i).getTextContent()).trim();
			   if(nodo1URL.item(i)!= null){
				   Node URL = docXML.createElement("URL");
				   URL.setTextContent("http://www.genbeta.com"+limpiarEntidades(nodo1URL.item(i).getTextContent()));
				 //URL.setTextContent(numero.substring(0, numero.length()-1));
				   pagina1.appendChild(URL);
			   }
			   
			   if(nodo1Reserva == null){
				   Node reserva = docXML.createElement("reserva");
				   reserva.setTextContent("genBeta");
				   pagina1.appendChild(reserva);
			   }
		
			   raiz.appendChild(pagina1);
		   }
		   
		   
		   /**		GENBETADEV.COM
		    * 
		    * Aquí abro otro sitio web. En este caso caso declaro otras variables pero podria
		    * haber reutilizado las de la página anterior.
		    */
		   System.out.println("\n");
		   Document docGenBetaDev =  abrirSitio("http://www.genbetadev.com/"); 
		  
		   NodeList nodo2Titulo=evaluarXPath(docGenBetaDev,"//*[@class='section section-articles']//h2/a/text()");
		   NodeList nodo2URL = evaluarXPath(docGenBetaDev,"//*[@class='section section-articles']//div[@class='article-links']/div[1]/a/@href");
		   NodeList nodo2Cuerpo=evaluarXPath(docGenBetaDev,"//*[@class='section section-articles']//div[@class='article-summary']");
		   NodeList nodo2Imagen=evaluarXPath(docGenBetaDev,"//*[@class='section section-articles']//div[@class='figure']/a/img/@src");
		   NodeList nodo2Reserva= null;
		   
		   for(int i=0;i<nodo2Titulo.getLength();i++)
		   {   
			   Node pagina2 = docXML.createElement("noticia");
			   
			   if(nodo2Titulo.item(i)!= null){
				   Node titulo2 = docXML.createElement("titulo");
				   titulo2.setTextContent(limpiarEntidades(nodo2Titulo.item(i).getTextContent()));
				   pagina2.appendChild(titulo2);
			   }
			   
			   //URL.setTextContent(nodo1Otros.item(i).getTextContent());
			   if(nodo2Imagen.item(i)!= null){
				   Node imagen2 = docXML.createElement("imagen");
				   imagen2.setTextContent(limpiarEntidades(nodo2Imagen.item(i).getTextContent()));
				   System.out.println(nodo2Imagen.item(i).getTextContent());
				   pagina2.appendChild(imagen2);
			   }
			   
			   if(nodo2Cuerpo.item(i)!= null){
				   Node cuerpo2 = docXML.createElement("cuerpo");
				   cuerpo2.setTextContent(limpiarEntidades(nodo2Cuerpo.item(i).getTextContent()));
				   pagina2.appendChild(cuerpo2);
			   }  
			   
			   //String numero = limpiarEntidades(nodo1Cuerpo.item(i).getTextContent()).trim();
			   if(nodo2URL.item(i)!= null){
				   Node URL2 = docXML.createElement("URL");
				   URL2.setTextContent("http://www.genbetadev.com"+limpiarEntidades(nodo2URL.item(i).getTextContent()));
				 //URL.setTextContent(numero.substring(0, numero.length()-1));
				   pagina2.appendChild(URL2);
			   }
			   
			   if(nodo2Reserva  == null){
				   Node reserva2 = docXML.createElement("reserva");
				   reserva2.setTextContent("genBetaDev");
				   pagina2.appendChild(reserva2);
			   }
		
			   raiz.appendChild(pagina2);
		   }
		   
		   
		   
		   /**
		    *    XATAKA.COM
		    */
		   System.out.println("\n");
		   Document docXakata =  abrirSitio("http://www.xataka.com/"); 
		  
		   NodeList nodo3Titulo=evaluarXPath(docXakata,"//*[@class='section section-articles']//h2/a/text()");
		   NodeList nodo3URL = evaluarXPath(docXakata,"//*[@class='section section-articles']//div[@class='article-links']/div[1]/a/@href");
		   NodeList nodo3Cuerpo=evaluarXPath(docXakata,"//*[@class='section section-articles']//div[@class='article-summary']");
		   NodeList nodo3Imagen=evaluarXPath(docXakata,"//*[@class='section section-articles']//div[@class='figure']/a/img/@src");
		   NodeList nodo3Reserva= null;
		   
		   for(int i=0;i<nodo3Titulo.getLength();i++)
		   {   
			   Node pagina3 = docXML.createElement("noticia");
			   
			   if(nodo3Titulo.item(i)!= null){
				   Node titulo3 = docXML.createElement("titulo");
				   titulo3.setTextContent(limpiarEntidades(nodo3Titulo.item(i).getTextContent()));
				   pagina3.appendChild(titulo3);
			   }
			   
			   //URL.setTextContent(nodo1Otros.item(i).getTextContent());
			   if(nodo3Imagen.item(i)!= null){
				   Node imagen3 = docXML.createElement("imagen");
				   imagen3.setTextContent(limpiarEntidades(nodo3Imagen.item(i).getTextContent()));
				   System.out.println(nodo3Imagen.item(i).getTextContent());
				   pagina3.appendChild(imagen3);
			   }
			   
			   if(nodo3Cuerpo.item(i)!= null){
				   Node cuerpo3 = docXML.createElement("cuerpo");
				   cuerpo3.setTextContent(limpiarEntidades(nodo3Cuerpo.item(i).getTextContent()));
				   pagina3.appendChild(cuerpo3);
			   }  
			   
			   //String numero = limpiarEntidades(nodo1Cuerpo.item(i).getTextContent()).trim();
			   if(nodo3URL.item(i)!= null){
				   Node URL3 = docXML.createElement("URL");
				   URL3.setTextContent("http://www.xataka.com"+limpiarEntidades(nodo3URL.item(i).getTextContent()));
				 //URL.setTextContent(numero.substring(0, numero.length()-1));
				   pagina3.appendChild(URL3);
			   }
			   
			   if(nodo3Reserva == null){
				   Node reserva3 = docXML.createElement("reserva");
				   reserva3.setTextContent("Xataka");
				   pagina3.appendChild(reserva3);
			   }
		
			   raiz.appendChild(pagina3);
		   }
		   

		   
		   
		   /**
		    *    APPLE ESFERA.COM
		    */
		   System.out.println("\n");
		   Document docAppleSfera =  abrirSitio("http://www.applesfera.com/"); 
		  
		   NodeList nodo4Titulo=evaluarXPath(docAppleSfera,"//*[@class='section section-articles']//h2/a/text()");
		   NodeList nodo4URL = evaluarXPath(docAppleSfera,"//*[@class='section section-articles']//div[@class='article-links']/div[1]/a/@href");
		   NodeList nodo4Cuerpo=evaluarXPath(docAppleSfera,"//*[@class='section section-articles']//div[@class='article-summary']");
		   NodeList nodo4Imagen=evaluarXPath(docAppleSfera,"//*[@class='section section-articles']//div[@class='figure']/a/img/@src");
		   NodeList nodo4Reserva= null;
		   
		   for(int i=0;i<nodo4Titulo.getLength();i++)
		   {   
			   Node pagina4 = docXML.createElement("noticia");
			   
			   if(nodo4Titulo.item(i)!= null){
				   Node titulo4 = docXML.createElement("titulo");
				   titulo4.setTextContent(limpiarEntidades(nodo4Titulo.item(i).getTextContent()));
				   pagina4.appendChild(titulo4);
			   }
			   
			   //URL.setTextContent(nodo1Otros.item(i).getTextContent());
			   if(nodo4Imagen.item(i)!= null){
				   Node imagen4 = docXML.createElement("imagen");
				   imagen4.setTextContent(limpiarEntidades(nodo4Imagen.item(i).getTextContent()));
				   System.out.println(nodo4Imagen.item(i).getTextContent());
				   pagina4.appendChild(imagen4);
			   }
			   
			   if(nodo4Cuerpo.item(i)!= null){
				   Node cuerpo4 = docXML.createElement("cuerpo");
				   cuerpo4.setTextContent(limpiarEntidades(nodo4Cuerpo.item(i).getTextContent()));
				   pagina4.appendChild(cuerpo4);
			   }  
			   
			   //String numero = limpiarEntidades(nodo1Cuerpo.item(i).getTextContent()).trim();
			   if(nodo4URL.item(i)!= null){
				   Node URL4 = docXML.createElement("URL");
				   URL4.setTextContent("http://www.applesfera.com/"+limpiarEntidades(nodo4URL.item(i).getTextContent()));
				 //URL.setTextContent(numero.substring(0, numero.length()-1));
				   pagina4.appendChild(URL4);
			   }
			   
			   if(nodo4Reserva == null){
				   Node reserva4 = docXML.createElement("reserva");
				   reserva4.setTextContent("AppleEsfera");
				   pagina4.appendChild(reserva4);
			   }
		
			   raiz.appendChild(pagina4);
		   }

		   
		   
		   
		   guardarArchivoUsandoXSLT(docXML,archivoPrecioXsl,archivoResultado);
		   System.out.println("finalizado......");   
	   }
}