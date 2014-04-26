

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Excepciones_3 {

	//Modifica el ejercicio1 para que si el usuario introduce algo q no es un numero,
	//vaya a pedir el dividendo y divisor
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double d;
		boolean error = false;
	
		do
		{	
			try{
				System.out.println("introduce un numero: ");
				d = teclado.nextDouble(); //sino se introduce un numero saldra un error
				error = false;
			}
			catch(InputMismatchException e){ //se produce un error mientras no se introduzca un numero
				System.out.println("Error: " + e.getMessage());
				error = true;
				teclado.nextLine();
			}
		}while(error);

		System.out.println("Fin");
	}

}
