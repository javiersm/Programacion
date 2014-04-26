package FOR;
import java.util.Scanner;


public class ejercicioFOR5 {

	
	
	public static void main(String[] args) {
		//Escribe un programa que pida dos números con el fin de visualizar la suma de todos los números que hay entre ambos números (incluidos dichos números). 
		//Si el primer número que inserte el usuaruio es mayor que el segundo,
		//se volverán a pedir otros dos números hasta que el primer número insertado sea menor o igual que el segundo.

		
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


