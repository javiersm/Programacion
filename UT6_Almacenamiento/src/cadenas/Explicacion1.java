package cadenas;

public class Explicacion1 {

	public static void main(String[] args) {
		String cadena="cadena";
		
		cadena = new String("Otra cadena");
		
		cadena += "hola cadena";
		
		if(cadena.equals("otra cadena hola cadena")){
			System.out.println("cadenas iguales");
		}
		
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena);
		
		String nombre1="Angel", nombre2="Alberto";
		
		
		System.out.println(nombre1.compareTo(nombre2));
		
		System.out.println(nombre2.compareTo(nombre1));

		
		String numeroCadena = String.valueOf(0.7f);
		System.out.println(numeroCadena);
		
		
		float f= Float.valueOf("2.45");
		
		System.out.println(cadena.substring(12, 16));
		
	}

}
