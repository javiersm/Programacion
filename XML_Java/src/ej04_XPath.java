import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class ej04_XPath {

	/** BUSCAR LA LISTA DE AUTORES MEDIANTE XPATH
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Document doc = ej01HolaXML.AbrirXML("archivos/libros.xml");

		XPathFactory xpFactory = XPathFactory.newInstance();
		XPath xPath = xpFactory.newXPath();
		
		String consulta = "/biblioteca/libro[1]/titulo/text()";
		Node elLibro;
		String nombre = "";
		
		//*************** DEVOLVIENDO TEXTO DIRECTAMENTE ********************
		try {
			nombre = (String) xPath.evaluate(consulta, doc, XPathConstants.STRING);
		} catch (XPathExpressionException e) {
			System.out.println("ERROR EN EL XPATH");
			e.printStackTrace();
		}
		System.out.println(nombre);
		
		
		
		//******************* OBTENER UN NODO *******************************
		consulta = "biblioteca/libro[1]/titulo";
		Node titulo = null;
		try {
			titulo = (Node) xPath.evaluate(consulta, doc, XPathConstants.NODE);
		} catch (XPathExpressionException e) {
			System.out.println("ERROR EN EL XPATH");
			e.printStackTrace();
		}
		System.out.println(titulo.getNodeName() + ": " + titulo.getTextContent());
		
		
		//****************** GET ELEMENT BY TAG NAME
		//doc.getElementsByTagName();
		
	}

}
