

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Excepciones_1 {

	public Excepciones_1() {
		
	}

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		int dividendo = 0, divisor = 0;
		
		try{
			
			dividendo =teclado.nextInt();
			divisor = teclado.nextInt();
			
		}catch(NoSuchElementException|IllegalArgumentException e){
			System.out.println("Error, no es un numero entero");
			System.exit(0);
		}
		
		
		
		try{
			System.out.println("Resultado: " + (dividendo/divisor));
		}
		catch(ArithmeticException e){
			System.out.println("Error. division por cero");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error inesperado");
			System.out.println(e.getMessage());
			
		}
		System.out.println("Adios");
		

	}

}
