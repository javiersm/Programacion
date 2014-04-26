package encriptar;

import java.util.Scanner;

public class encriptar {

	/**Ejercicio 5 
	
	Realiza un programa que encripte una cadena de caracteres (solo podemos usar caracteres en min�sculas o n�meros). La enciptaci�n consiste en:

    Dada una cadena de caracteres, en la cadena encriptada cada car�cter ser� igual a �l mismo m�s el car�cter que se encuentra a continuaci�n. 
    Si nos encontramos en el �ltimo valor le sumaremos 4.
    Una vez realizada la operaci�n anterior sumaremos 3 a cada car�cter obteniendo finalmente la cadena encriptada definitiva.

Puedes utilizar los m�todos de cadenas toCharArray y el constructor String(char[] value) para convertir/crear una cadena a/partiendo de un array de caracteres.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String cadena;
		boolean validacion = false;
		
		
		System.out.println("Introduce una cadena: (puede contener numeros/minusculas)");
		cadena = teclado.nextLine();
		
		//comprobar si se ha introducido mayusculas y numeros unicamente
		
		cadena.toLowerCase();
		//System.out.println(cadena);
		for(int i=0; i<cadena.length();i++)
		{
			if (! ((Character.isDigit(cadena.charAt(i))) || (Character.isLowerCase(cadena.charAt(i)))) )
			{
				System.out.println(i + "no es un caracter o una cadena en minuscula");
				System.err.println("Error. No es un caracter");
				System.exit(0);
			}
		}
			
		
		char[] vector = cadena.toCharArray();
		
		
		for(int i=0; i<vector.length-1; i++)
			vector[i] += vector[i+1]+3; 
		
		vector[vector.length-1] += 3+4;
		
				
		
		//*********** pintar array
	
		System.out.println("PINTA ENCRIPTACION:"); System.out.print("\t\t");
		for(int i=0; i<vector.length; i++) 
			System.out.print(vector[i]);
		/*
		System.out.println("pinta");
		cadena = vector.toString();
		for(int i=0; i<cadena.length(); i++) 
			System.out.println(cadena.charAt(i));
		*/
		
		vector = desencriptar.desencriptar(vector);
		System.out.println("\n\nPINTA DES-ENCRIPTACION:"); System.out.print("\t\t");
		for(int i=0; i<vector.length; i++) 
			System.out.print(vector[i]);

	}

}
