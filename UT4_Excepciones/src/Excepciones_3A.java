

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones_3A {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		double divisor = 0, dividendo =0;
		double resultado=0;
		boolean error = false;
	
		do
		{	
			try{
				System.out.println("PROGRAMA DIVISOR DE DOS NUMEROS CON EXCEPCIONES \n");
				System.out.println("introduce dos numeros para hacer una division: ");
				dividendo = teclado.nextDouble(); //sino se introduce un numero saldra un error
				divisor = teclado.nextDouble();
				resultado = dividendo/divisor;
				error = false;
			}
			catch(ArithmeticException|InputMismatchException e){ //se produce un error mientras no se introduzca un numero
				System.out.println("Error: " + e.getMessage());
				error = true;
				teclado.nextLine();
			}
			finally{
				if(error == false){
					teclado.close();
					System.out.println("El resultado es: " + resultado);	
					System.out.println("Se han registrado y/o procesado las excepciones");
				}
			}
		}while(error);

		System.out.println("Fin");
	

	}

}



	
