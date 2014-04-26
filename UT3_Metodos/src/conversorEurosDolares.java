

import java.util.Scanner;

public class conversorEurosDolares {

	/*
	 * Escribir un método que convierta de euros a dólares. 
	 * Recibirá un número decimal correspondiente a la cantidad en euros y devolverá
	 * la cantidad correspondiente en dolares.
	 * Escribir el código en el main necesario para probarlo.
	 */
	
	public static double convierteEuroDolares(double euros){
		double cambio = 0;
		double dolarValue = 1.3775;
		if (euros > 0)
			cambio = euros * dolarValue;
		return cambio;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros a convertir a dolares");
		double eur = teclado.nextDouble();
		System.out.println("\nEsto son: " + convierteEuroDolares(eur) + "dolares.");

	}

}
