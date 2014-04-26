package FOR;
import java.util.Scanner;


public class ejercicioFOR4 {

	public static void main(String[] args) {
		// Escribe un programa que pida tantos números como el usuario del programa indique al principio. 
		// El programa mostrará al final la media y si se ha insertado un número par.
		
		System.out.println("Introduce la cantidad de numeros que el programa te va a pedir:");
		Scanner teclado = new Scanner(System.in);
				
		boolean pares = false;
		int acumulador=0;
		int n=0;
		int cantidadNumeros = teclado.nextInt();
		
		for (int i= cantidadNumeros; i>0; i--)
		{
			System.out.printf("Introduce el numero[%d]: ", i);
			n = teclado.nextInt();
			acumulador = acumulador + n;
			
			if(n%2==0) pares = true;
		}
		System.out.println("Acumulador total: " + acumulador );
		System.out.println("La media de todos los numeros es:" + (double)(acumulador/cantidadNumeros));
		
		
	
		
		

	}

}
