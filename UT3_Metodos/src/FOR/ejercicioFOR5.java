package FOR;
import java.util.Scanner;


public class ejercicioFOR5 {

	
	
	public static void main(String[] args) {
		//Escribe un programa que pida dos n�meros con el fin de visualizar la suma de todos los n�meros que hay entre ambos n�meros (incluidos dichos n�meros). 
		//Si el primer n�mero que inserte el usuaruio es mayor que el segundo,
		//se volver�n a pedir otros dos n�meros hasta que el primer n�mero insertado sea menor o igual que el segundo.

		
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		do
		{
			System.out.println("Introduce el numero1: ");
			numero1 = teclado.nextInt();
			System.out.println("Introduce el numero2: ");
			numero2 = teclado.nextInt();
			if (numero1 > numero2){
				System.out.println("El numero2 tiene que ser mayor que el numero1");
			}	
		}while (numero1 > numero2);
		
		System.out.printf("Numero1: %2d  Numero2: %2d", numero1, numero2);
		
		int total = 0;
		for (int i=numero1; i<=numero2; i++)
		{
			total = total + i;
		}
		
		System.out.println("\nLa suma de todos los numeros es: " + total);
		
		
		
		
	}
	
}


