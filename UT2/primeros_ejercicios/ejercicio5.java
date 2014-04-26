package primeros_ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		//Crea un programa que pida el tamaño de un archivo (Mbytes)
		//y la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.
		Scanner teclado = new Scanner(System.in);
		
		float tamañoArchivo = 0;
		float velocidadLinea = 0;
		System.out.println("Introduce el tamaño de un archivo en Mbytes: ");
		tamañoArchivo = teclado.nextFloat();
		System.out.println("\nIntroduce la velocidad de la linea en Mbps: ");
		velocidadLinea = teclado.nextFloat();
		
		tamañoArchivo = tamañoArchivo * 1024 * 1024 * 8; //= tamaño * Math.pow(2,20) * 8
		velocidadLinea = velocidadLinea * 1000000;
		
		
		
		System.out.println("Datos: " + tamañoArchivo + " Mbits");
		System.out.println("\nVelocidad: " + velocidadLinea + " Mbps");
		System.out.println("\nTiempo para transmitir: " + (tamañoArchivo / velocidadLinea) + " segundos.");

	}

}
