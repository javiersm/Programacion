import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/** COGE LA TEMPERATURA DE LA PAGINA METEOROLOGICA AEMET
 * 
 * 
 * 
 * @author JS
 *
 */
public class ej06Temperatura {

	public static void main(String[] args) {
		
	Document doc = ej01HolaXML.AbrirXML("http://www.aemet.es/xml/municipios/localidad_45023.xml");

	XPathFactory xpFactory = XPathFactory.newInstance();
	XPath xPath = xpFactory.newXPath();
	
	String consulta = "/root/prediccion/dia[1]/temperatura/maxima/text()";
	String consulta2 = "/root/prediccion/dia[1]/temperatura/minima/text()";
	String maxima = null, minima = null;
	
	try {
		maxima = (String) xPath.evaluate(consulta, doc, XPathConstants.STRING);
		minima = (String) xPath.evaluate(consulta2, doc, XPathConstants.STRING);
	} catch (XPathExpressionException e) {
		System.out.println("ERROR EN EL XPATH");
		e.printStackTrace();
	}
	
	if(maxima != null){
		System.out.println("La temperatura maxima esperada para mañana en Burguillos es: " + maxima +" grados");
		System.out.println("La temperatura minima esperada para mañana en Burguillos es: " + minima +" grados");
	}
	}

}
