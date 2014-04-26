package ejerciciosprofundizacion;

import java.util.Random;

/**
  Ejercicio 3. Realiza una clase Finanzas que convierta d�lares a euros y viceversa. 
  Codifica los m�todos dolaresToEuros y eurosToDolares. 
  Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y d�lares. 
 
La clase tiene que tener:
    Un constructor finanzas que establecer� el cambio D�lar-Euro en 1.36.
    Un constructor finanzas(double), el cual permitir� configurar el cambio D�lar-Euro.

 */


public class Finanzas {

	private static double valor1EuroDolar = 1.36995;
	private static double valor1DolarEnEuro = 0.729954;
	
	
	
	public static double dolarTOeuro(double dolares )
	{
		double euros = dolares * valor1DolarEnEuro;
		return euros;
	}
	
	
	
	public static double euroTOdollar(double euros)
	{
		double dolar = euros * valor1EuroDolar; 		
		
		return dolar;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("1euro = " + euroTOdollar(1) + "dolares");
		
		System.out.println("1dolar = " + dolarTOeuro(1) + "euro");
		
	

	}

	
	
}
