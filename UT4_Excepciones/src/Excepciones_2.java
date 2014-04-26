

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Excepciones_2 {


	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		int dividendo = 0, divisor = 0;
		
		try{
			
			dividendo =teclado.nextInt();
			divisor = teclado.nextInt();
			
		}catch(ArithmeticException e){
			System.out.println("Error, division por 0");
		
		}
		catch(InputMismatchException e){
			System.out.println("Error, no es un numero");
		}
		finally{
			teclado.close();
			System.out.println("Has luego, esto se mostrara siempre");
		}

	}

}
