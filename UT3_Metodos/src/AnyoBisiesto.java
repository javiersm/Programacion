import java.util.Scanner;


public class AnyoBisiesto {

	public static void main(String[] args) {
		// Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo (aquel divisible por 100), 
		//salvo que este último sea divisible por 400 http://es.wikipedia.org/wiki/Año_bisiesto.
		//Haz un programa que pida un año y muestre un mensaje de si es o no bisiesto.

		
		System.out.println("Introduce un año: ");
		Scanner teclado = new Scanner(System.in);
		int año = teclado.nextInt();
		
		if (año%4 == 0 && año%100 != 0 && año%400 == 0)
		{
			System.out.printf("El año %d es bisiesto", año);
		}
		else
		{
			System.out.printf("El año %d no es bisiesto", año);
		}
		
		
	}

}
