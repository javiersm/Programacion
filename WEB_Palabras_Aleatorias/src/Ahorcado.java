import java.util.ArrayList;
import java.util.Scanner;


public class Ahorcado {

	private static ArrayList<Character> palabra = new ArrayList<Character>();
	private static ArrayList<Character> palabraGuiones = new ArrayList<Character>();

	//private static String palabraActual = "";
	private static int intentosRestantes = 6;
	private static boolean hasGanado = false;
	private static Scanner teclado = new Scanner(System.in);
	
	
	private static void pintaPalabra(){
		System.out.println();
		for(Character c: palabra)
			System.out.print(" _");
	}
	
	private static void pintaPalabraGuiones(){
		System.out.println();
		for(Character c: palabraGuiones)
			System.out.print(c +" ");
	}
	
	
	public static String soloCaracteresNormales(String palabra) {
			// Cadena de caracteres original a sustituir.
			String original = "áàäéèëíìïóòöúùuÁÀÄÉÈËÍÌÏÓÒÖÚÙÜçÇ";
			// Cadena de caracteres ASCII que reemplazarán los originales.
			String ascii = "aaaeeeiiiooouuuAAAEEEIIIOOOUUUcC";
			String output = palabra;
			for (int i=0; i<original.length(); i++) {
			// Reemplazamos los caracteres especiales.
			output = output.replace(original.charAt(i), ascii.charAt(i));
			}
			return output;
	}
	
	
	
	private static void getNewPalabra(){
		String palabraActual = Palabras.palabra(); //coge una palabra nueva
		palabraActual = palabraActual.toLowerCase();
		palabraActual = soloCaracteresNormales(palabraActual);
		
		char[] chars = palabraActual.toCharArray();		
		for(Character c: chars){
			System.out.print(" " + c);
			palabra.add(c);
			palabraGuiones.add('_');
		}
		pintaPalabra();
	}
	
	

	
	/** Aqui hago la comprobación de los aciertos.
	 *  Le paso una letra y va mirando si existe en el array.
	 * 
	 * @param letra
	 */
	private static void compruebaAciertos(Character letra)
	{
		boolean hasAcertado = false;
		int aciertos = 0;
		
		for(int i=0; i<palabra.size();i++){
			if(palabra.contains(letra)){
				palabraGuiones.set(i, letra);
				aciertos++;
				hasAcertado = true;
			}
		}		
		
		if(!hasAcertado){
			intentosRestantes--;
			System.out.println("La letra " + letra +" no está.");
		}else{
			System.out.println("contiene "+ aciertos + " letras de : " + letra );
		}
		
		pintaPalabraGuiones();
	}
	
	
	



	public static void main(String[] args) 
	{	
		System.out.println("* * * Ahorcado version 1.0 * * *\n");
		char letra = ' ';
		
		do{
			getNewPalabra();
			do{
				System.out.println("Introduce una letra: ");
				letra = teclado.next().charAt(0);
				compruebaAciertos(letra);
			}while(intentosRestantes>0 && !hasGanado);
			
		}while(intentosRestantes>0 && !hasGanado);
		
		
		System.out.println("FIN");
		
		
	}
	
}



