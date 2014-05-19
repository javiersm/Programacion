

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ej01HolaXML {

	/** LIBRERIA QUE USO PARA PROCESAR EL XML.
	 * 
	 * JAXP: http://docs.oracle.com/javase/tutorial/jaxp/
	 * 
	 * ADEMÁS: hace falta un parser, ese parser se encarga de coger las web y convertirlas 
	 * 		   a objetos de memoria para luego procesarlos.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	
	
	
	public static Document AbrirXML(String archivo){
		
		Document doc = null;
		try {
			//creo una factoria del tipo document builder. Se trata de una clase que se encarga de crear
			//los objetos que necesite.
			DocumentBuilderFactory dbFactory = 
					DocumentBuilderFactory.newInstance();
			
			//crear Document Builder
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(archivo);
		} catch (ParserConfigurationException e) {
			System.out.println("No se pudo contruir DocumentBuilder");
			e.printStackTrace();
		} catch (SAXException e) {
			System.out.println("Error en el doucmento XML");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("No se puede abrir " + archivo);
			e.printStackTrace();
		}
		
		/*
		//Imprimir propiedades documento
		System.out.println("Documento leido");
		System.out.println("\tArchivo: " + doc.getDocumentURI());
		System.out.println("\tCodificacion: " + doc.getXmlEncoding());
		System.out.println("\tVersion: " + doc.getXmlVersion());
		//selecciono el elemento raiz
		System.out.println("\tRaiz: " + doc.getDocumentElement());
		//selecciono dentro del elemento raiz lo que desee
		System.out.println("\tRaiz: " + doc.getDocumentElement().getNodeName());
		*/
		return doc;
}
	
	
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		
	}

}
