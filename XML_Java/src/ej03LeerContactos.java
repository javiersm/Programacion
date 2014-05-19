import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/** Clase que lee los contactos de una agenda.xml
 * 
 * @author JS
 *
 */
public class ej03LeerContactos {

	
	public static void main(String[] args) {
	
		Document doc = ej01HolaXML.AbrirXML("archivos/agenda.xml");
		Element raiz = doc.getDocumentElement();
		NodeList hijos = raiz.getChildNodes();
		
		
		for(int i=0;i<hijos.getLength();i++)
		{
			//asigno a un elemento el la instancia del hijo para procesarla
			Node elemento = hijos.item(i);
				
			
			if(elemento.getNodeType() == Node.ELEMENT_NODE)
			{
				System.out.println(elemento.getChildNodes().item(1).getTextContent()); //cojo el segundo elemento. PORQUE EL primer elemento es texto en blanco por los espacios entre <contacto> y <contacto>

			}
		
		}

		
	}

}
