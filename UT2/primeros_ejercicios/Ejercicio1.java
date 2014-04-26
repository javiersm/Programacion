package primeros_ejercicios;


import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		System.out.println("¿Cuál es tu nombre?\n");
		nombre = teclado.nextLine();
		System.out.println("Hola " + nombre + " !");
		
		teclado.close();
	}

}	
