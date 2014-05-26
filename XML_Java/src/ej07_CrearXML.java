import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


/** EJEMPLO SOBRE COMO CREAR EL XML. COPIO EL EJEMPLO DEL ej01 y lo modifico
 * 
 * @author JS
 *
 */
public class ej07_CrearXML {

	
	public static void guardarArchivo(Document doc, String ruta) throws TransformerFactoryConfigurationError, UnsupportedEncodingException, FileNotFoundException, TransformerException{
		Transformer transformer;
		
		transformer = TransformerFactory.newInstance().newTransformer();
		
		BufferedWriter f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ruta),"UTF-8"));
		
		Result output = new StreamResult(f);
		Source input = new DOMSource(doc);
		
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.METHOD, "html");
		
		transformer.transform(input, output);
		
	
	}
	
	
	public static void main(String[] args) throws ParserConfigurationException {
	
			Document doc = null;
			DocumentBuilderFactory dbFactory = 
					DocumentBuilderFactory.newInstance();
			
			//crear Document Builder
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			doc = dBuilder.newDocument();
			
			//asi se crean nodos de XML
			Element raiz = doc.createElement("peliculas");
			doc.appendChild(raiz);
			
			try {
				guardarArchivo(doc, "archivos/creado.xml");
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
	}

}
