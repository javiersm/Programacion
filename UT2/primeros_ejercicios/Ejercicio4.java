package primeros_ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas, 
		//sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)
		
		
		float peso = 0.0f; //la "f" que e puesto despues de poner .0 es para decirle que es un float, sino asumirá que es un double 
		final float onzas = 35.2739619f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu peso en kilogramos: ");
		peso = teclado.nextFloat();
		System.out.println("\n Tu peso en Onzas es: " + (peso * onzas) + " onzas.");
		
		teclado.close(); //libera el recurso
		
		
		
		
		
		
		
		
	}

}
