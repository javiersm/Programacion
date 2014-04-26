package Arrays;
import java.util.Scanner;


public class NumerosArraySentidoInverso {

	public static void main(String[] args) {
		// Pedir un array que pida 10 numeros y luegos los imprima al reves
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numerosArray = new int[10];
		
		System.out.println("Introduce los numeros del Array[]: ");
		for(int i=0; i < numerosArray.length; i++){
			numerosArray[i] = teclado.nextInt(); 
		}
		
		System.out.println("El array que has introducido es:");
		for (int numeros : numerosArray)
			System.out.printf("%2d",numerosArray[numeros]);
			
		
		System.out.println("\nImprime el array al reves");
		for(int i=numerosArray.length; i > 0;  i--)
		{
			System.out.printf("%2d", numerosArray[i-1]);
		}
 
	}

}
