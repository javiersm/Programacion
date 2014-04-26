import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class HolaMundo2 {

public static void main(String[] args) {

	 JSONObject objeto = new JSONObject();
	
	 objeto.put("nombre", "Programaci�n");
	 objeto.put("alumnos", 26);
	 objeto.put("profesor", "Angel");
	 
	 System.out.println(objeto);
	 
	 JSONArray modulos = new JSONArray();
	
	 modulos.add(objeto);
	
	objeto = new JSONObject();
	
	 objeto.put("nombre", "BBDD");
	objeto.put("alumnos", 26);
	 objeto.put("profesor", "Fernando");
	 
	 modulos.add(objeto);
	 
	 System.out.println(modulos);
	
	 System.out.print("El profesor de Programaci�n es: " );
	 for(int i=0; i<modulos.size();i++){
		 JSONObject modulo;
		 modulo = (JSONObject)modulos.get(i);
		 if(((String)modulo.get("nombre")).equals("Programaci�n")){
			 System.out.print((String)modulo.get("profesor"));
		 }
	 }
 
 }

}