/**
 * SACAR DE UNA WEB QUE GENERA PALABRAS ALEATORIAS -
 * http://www.palabrasque.com/palabra-aleatoria.php LA PALABRA QUE GENERA.
 * 
 * 
 * PARA ELLO TENEMOS QUE UTLILIZAR .JAR QUE HE DESCARGADO DE LA URL: -
 * http://htmlcleaner.sourceforge.net/download.php lo que hace este .jar es
 * coger una pagina web y la convierte entera a xml para luego procesarla. s
 * 
 * @author JS
 * 
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

public class E06Palabras {

public static void main(String[] args) throws IOException, XPatherException {
String urlPalabraAleatoria = "http://www.palabrasque.com/palabra-aleatoria.php";

// Clean Builder
CleanerProperties props = new CleanerProperties();
// set some properties to non-default values
props.setTranslateSpecialEntities(true);
props.setTransResCharsToNCR(true);
props.setOmitComments(true);

URL url=new URL(urlPalabraAleatoria);
HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
TagNode tagNode = new HtmlCleaner(props).clean(
httpcon.getInputStream()
);

// guardar una copia
new PrettyXmlSerializer(props).writeToFile(
tagNode, "archivos/palabra.xml", "utf-8");

tagNode.evaluateXPath("/html/body/center/font[1]/font/strong/text()");

}

}