import java.util.Scanner;


public class AnyoBisiesto {

	public static void main(String[] args) {
		// Un a�o es bisiesto si es divisible entre 4, excepto el �ltimo de cada siglo (aquel divisible por 100), 
		//salvo que este �ltimo sea divisible por 400 http://es.wikipedia.org/wiki/A�o_bisiesto.
		//Haz un programa que pida un a�o y muestre un mensaje de si es o no bisiesto.

		
		System.out.println("Introduce un a�o: ");
		Scanner teclado = new Scanner(System.in);
		int a�o = teclado.nextInt();
		
		if (a�o%4 == 0 && a�o%100 != 0 && a�o%400 == 0)
		{
			System.out.printf("El a�o %d es bisiesto", a�o);
		}
		else
		{
			System.out.printf("El a�o %d no es bisiesto", a�o);
		}
		
		
	}

}