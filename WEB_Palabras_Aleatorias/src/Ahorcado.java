import java.util.ArrayList;
import java.util.Scanner;


public class Ahorcado {

	private static ArrayList<Character> palabraGuiones = new ArrayList<Character>();
	private static ArrayList<Character> letrasUsadas = new ArrayList<Character>();
	private static ArrayList<Character> palabra = new ArrayList<Character>();
	
	private static String palabraActual = "";
	private static int intentosRestantes = 6;
	private static boolean hasGanado = false;
	private static Scanner teclado = new Scanner(System.in);
	
	
	private static void pintaPalabra(){
		System.out.println();
		for(Character c: palabra)
			System.out.print(" _");
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
		palabraActual = Palabras.palabra(); //coge una palabra nueva
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
	
	
	private static void introduceLetra(){
		System.out.println("Introduce una letra: ");
		letrasUsadas.add(teclado.next().charAt(0));
		
		//compruebo si las letras de la palabra estan todas en el arraylist de letras usadas
	}
	
	private static void compruebaAciertos(){
		int aciertos = 0;
		for(int i=0; i<letrasUsadas.size();i++){
			if(palabra.contains(letrasUsadas.get(i))){
				System.out.println("contiene la: " + letrasUsadas.get(i));
				aciertos++;
			}
		}
		System.out.println("has acertado " + aciertos + " letras");
		if(aciertos == palabra.size()){
			System.out.println(" ***/** /* /* /  HASSSS GANADOOOOOO  /* /* / /* */ */ ");
			hasGanado=true;
		}			
	}
	
	
	



	public static void main(String[] args) {
		
		System.out.println("* * * Ahorcado version 1.0 * * *\n");
		do{
			getNewPalabra();
			do{
				introduceLetra();
				compruebaAciertos();
				intentosRestantes--;
			}while(intentosRestantes>0 && !hasGanado);
			
		}while(intentosRestantes>0 && !hasGanado);
		
		
		
	}

}
