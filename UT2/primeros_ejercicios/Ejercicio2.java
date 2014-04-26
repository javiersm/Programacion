package primeros_ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Escribir un programa que pregunte al usuario dos números y 
	    //luego muestre la suma, el producto y la media de los dos números.
		int numero1;
		int numero2;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Escribe el primer numero: ");
		numero1 = Integer.parseInt(br.readLine());
		System.out.println("\nEscribe el segundo numero: ");
		numero2 = Integer.parseInt(br.readLine());
		
		System.out.println("\nLa suma de los dos numeros es: " + (numero1 + numero2));
		System.out.println("\nEl producto de los dos numeros es: " + (numero1 * numero2));
		System.out.println("\nLa media de los dos numeros es: " + ((numero1 + numero2)/2));
		
	}

}
