package cadenas;

/**
 * StringBuilder = clase que contiene otros metodos de cadenas avanzados (Se usa con procesamiento de un solo hilo)
 * 
 * StringBuffer = clase igual que la anterior (Se usa con multi-thread)
 * 
 * 
 */


public class Expl_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder cadena = new StringBuilder("Javier");
		
		cadena.append(" Santana");
		System.out.println(cadena);
		
		
		cadena.insert(12, "Mejias");
		System.out.println(cadena);
		
		//borra desde M hasta el final de la cadena
		cadena.delete(cadena.indexOf("M"), cadena.length());
		System.out.println(cadena);
		

	}

}
