package primeros_ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Escribe programas que:
    	1. Calculen el perímetro y área de un rectángulo dada su base y su altura.
    	2. Calculen el perímetro y área de un círculo dado su radio.
    	3. Calculen el volumen de una esfera dado su radio.
    	4. Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
    	5. Dados los catetos de un triángulo rectángulo, calcular su hipotenusa. */
		
		float largo = 0;
		float altura = 0;
		float radio = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println( "1. Calculen el perímetro y área de un rectángulo dada su base y su altura.\n" +
							"2. Calculen el perímetro y área de un círculo dado su radio.\n" +
							"3. Calculen el volumen de una esfera dado su radio.\n" +
							"4. Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.\n" +
							"5. Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.\n");
		System.out.println("Selecciona el codigo de operación que deseas realizar: ");
		int numeroOperacion = 0;
		numeroOperacion = teclado.nextInt();
		while(numeroOperacion < 0 || numeroOperacion > 5)
		{
			System.out.println("\nNumero incorrecto!");
			numeroOperacion = 0;
			System.out.println("   Selecciona uno valido:");
			numeroOperacion = teclado.nextInt();
			
		}
		//numeroOperacion = teclado.nextInt();
		//System.out.println("Has elegido el numero de operacion: " + numeroOperacion);
		
		switch (numeroOperacion){
		
			case 1: System.out.println("Has elegido el numero de operacion: " + numeroOperacion);
					System.out.println("\nIntroduce el largo en cm: ");
					largo = teclado.nextFloat();
					System.out.println("\nIntroduce el alto (cm): ");
					altura = teclado.nextFloat();
					System.out.println("\nEl perímetro del rectangulo es: " + Float.toString((2 * altura)+(2*largo)) + " cm");
					System.out.println("\nEl área del rectangulo es: " + Float.toString((altura*largo)) + " cm2");
					break;
					
			case 2: System.out.println("Has elegido el numero de operacion: " + numeroOperacion);
					System.out.println("Introduce el radio del circulo (cm): ");
					radio = teclado.nextFloat();
					System.out.println("\nEll perímetro del circulo es: " + Float.toString((float) (2*Math.PI*radio)) + " cm");
					System.out.println("\nEl area del circulo es:" + Float.toString((float) (2*Math.PI*(radio*radio))) + " cm2");
					break;
			
			case 3: System.out.println("Has elegido el numero de operacion: " + numeroOperacion);
					//"3. Calculen el volumen de una esfera dado su radio.\n" +
					System.out.println("Introduce el radio de la esfera (cm): ");
					radio = teclado.nextFloat();
					float resultado;
					resultado =(4.0f/3.0f) * Math.PI * Math.pow(radio, 3);
					System.out.println("\nEl volumen de una esfera es: " + Math.round(resultado * 100) / 100.00  + " cm3");
					break;
			
			case 4: System.out.println("Has elegido el numero de operacion: " + numeroOperacion);
					//"4. Calculen el área de un rectángulo (alineado con los ejes x e y)
					//dadas sus coordenadas x1,x2,y1,y2.\n"
					float x1 = 0, y1=0, x2=0, y2=0;
					float xValorAbsoluto, yValorAbsoluto;
					System.out.println("Introduce X1: ");
					x1 = teclado.nextFloat();
					System.out.println("Introduce X2: ");
					x2 = teclado.nextFloat();
					xValorAbsoluto = Math.abs(x1 - x2);
					System.out.println("El valor absoluto de X1: " + xValorAbsoluto);
					System.out.println("Introduce Y1: ");
					y1 = teclado.nextFloat();
					System.out.println("Introduce Y2: ");
					y2 = teclado.nextFloat();
					yValorAbsoluto = Math.abs(y1 - y2);
					System.out.println("El valor absoluto de Y1: " + yValorAbsoluto);
					System.out.println("El área del rectangulo es: " + Float.toString(yValorAbsoluto * xValorAbsoluto) );
					break;
			
			case 5: System.out.println("Has elegido el numero de operacion: " + numeroOperacion);
					//"5. Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.\n");
					double c1=0, c2=0, h=0;
					System.out.println("Introduce el cateto 1: ");
					c1 = teclado.nextFloat();
					System.out.println("Introduce el cateto2: ");
					c2 = teclado.nextFloat();
					h = Math.sqrt( (c1*c1) + (c2*c2) );
					System.out.println("La hipotenusa seria de: " + h);
					break;
			
			default: System.out.println("\nCodigo operacion incorrecto, vuelve a introducir un numero");
					 numeroOperacion = 0;
					 break;
			
		}
		
		teclado.close();
		
	
		
		
	}

}
