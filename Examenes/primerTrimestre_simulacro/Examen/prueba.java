package Examen;


import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] palabras = new String[10];

		for(int i=0; i<palabras.length; i++){
			
			palabras[i] = teclado.next();
		}
		for(int i=0; i<palabras.length; i++){
			
			System.out.println(palabras[i]);
		}
	}

}
