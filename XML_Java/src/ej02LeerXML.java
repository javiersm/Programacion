import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ej02LeerXML {


	
	
	public static void main(String[] args) {
		
		Document doc = ej01HolaXML.AbrirXML("archivos/libros.xml");
		
		Element raiz = doc.getDocumentElement();
		
		NodeList hijos = raiz.getChildNodes();
		
		//CUIDADO !!! SÍ entre nodo y nodo hay espacios en blanco devuelve elementos
		//por los espacios que hay entre nodos piensa que contiene texto
		for(int i=0;i<hijos.getLength();i++){
			Node elemento = hijos.item(i);
			
			
			if(elemento.getNodeType() == Node.TEXT_NODE){
				//solo selecciona los que son texto
			}
			
			
			if(elemento.getNodeType() == Node.ELEMENT_NODE){
				//solo selecciona los elemeentos que son nodos. HACE LO MISMO QUE EL DE ABAJO
			}
			
			//de esta manera hago que no me salgan los espacios en blanco. HACE LO MISMO QUE EL DE ARRIBA
			//PERO ESTA VERSION ES MAS COMO JAVA.
			if(elemento instanceof Element){
				System.out.println("Elemento:" + elemento.getNodeName());
			}else if(elemento.getNodeType() == Node.TEXT_NODE){
				System.out.println("Texto: " + elemento.getTextContent());
			}
		}

	}

}
