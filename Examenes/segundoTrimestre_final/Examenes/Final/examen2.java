package Examenes.Final;
import java.util.InputMismatchException;
import java.util.Scanner;


public class examen2 {

	private static double x1=0;
	private static double x2=0;
	private static double y1=0;
	private static double y2=0;
	private static double numero = 0;
	
	public static double distancia(double x1, double y1, double x2, double y2)
	{
		System.out.println(" x1: " + x1+" y1: " + y1+" x2: " + x2+" y2: " + y2);
		System.out.println("La distancia entre los numeros es:");
		
		System.out.println(Math.pow((x1-x2),2));
		System.out.println(Math.pow((y1-y2),2));
		double resultado = Math.sqrt( (Math.pow((x1-x2),2) + Math.pow((y1-y2),2)) );
		return resultado;
	}

	public static double introducePunto(String nombre) throws InputMismatchException
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el punto "+nombre+": ");
		numero = teclado.nextDouble();
		if(Double.isNaN(numero))
		{
			throw new InputMismatchException();
		}
		else{
			return numero;
		}
			
	}
	
	
	public static void main(String[] args) {
		
		boolean error=false;
		//leer punto x1
		do{
			error=false;
			try
			{
				x1 = introducePunto("x1");
			}catch(Exception e)
			{
				System.out.println("Numero introducido erroneo.");
				error=true;
			}
		}while(error);
		
		do{
			error=false;
			try
			{
				y1 = introducePunto("y1");
			}catch(Exception e)
			{
				System.out.println("Numero introducido erroneo.");
				error=true;
			}
		}while(error);

		do{
			error=false;
			try
			{
				x2 = introducePunto("x2");
			}catch(Exception e)
			{
				System.out.println("Numero introducido erroneo.");
				error=true;
			}
		}while(error);
		
		do{
			error=false;
			try
			{
				y2 = introducePunto("y2");
			}catch(Exception e)
			{
				System.out.println("Numero introducido erroneo.");
				error=true;
			}
		}while(error);
	
		
		
		System.out.println("La distancia es de: "+ distancia(x1,y1,x2,y2));
	}

}
