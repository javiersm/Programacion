package primeros_ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		//Crea un programa que pida el tama�o de un archivo (Mbytes)
		//y la velocidad de una l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.
		Scanner teclado = new Scanner(System.in);
		
		float tama�oArchivo = 0;
		float velocidadLinea = 0;
		System.out.println("Introduce el tama�o de un archivo en Mbytes: ");
		tama�oArchivo = teclado.nextFloat();
		System.out.println("\nIntroduce la velocidad de la linea en Mbps: ");
		velocidadLinea = teclado.nextFloat();
		
		tama�oArchivo = tama�oArchivo * 1024 * 1024 * 8; //= tama�o * Math.pow(2,20) * 8
		velocidadLinea = velocidadLinea * 1000000;
		
		
		
		System.out.println("Datos: " + tama�oArchivo + " Mbits");
		System.out.println("\nVelocidad: " + velocidadLinea + " Mbps");
		System.out.println("\nTiempo para transmitir: " + (tama�oArchivo / velocidadLinea) + " segundos.");

	}

}
