import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/* NO FUNCIONA
public class HolaMundo {

	public static void main(String[] args) {
		
		JSONObject objeto = new JSONObject();
		//creo un Json array
		JSONArray modulos = new JSONArray();
		
		objeto.put("nombre", "programacion");
		objeto.put("alumnos", 26);
		objeto.put("profesor", "Angel");
		modulos.add(objeto);
		
		
		objeto = new JSONObject();		
		objeto.put("nombre", "BBDD");
		objeto.put("alumnos", 27);
		objeto.put("profesor", "Fernando");
		modulos.add(objeto);
		
		
		//System.out.println(objeto);
		System.out.println(modulos);
		
		
		
		System.out.print("El profesor de Programación es: " );
		 for(int i=0; i<modulos.size();i++){
			 JSONObject modulo;
			 modulo = (JSONObject)modulos.get(i);
			 if(((String)modulo.get("nombre")).equals("Programación")){
				 System.out.print((String)modulo.get("profesor"));
			 }
		 }
		
	}

}
*/