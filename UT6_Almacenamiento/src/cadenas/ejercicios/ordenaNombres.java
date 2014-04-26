package cadenas.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/** Clase que pide un numero de nombres y luego los muestra por orden alfabetico
 * 
 * @author JS
 *
 */
public class ordenaNombres {

	private static String[] nombres = {"zara","federico","pablo","daniel", "jorge", "ana", "silvia","raimundo"};
	private static String[] nombresCopy;

	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//System.out.println("¿Cuántos nombres quieres introducir?");
		//nombres = new int[teclado.nextInt()];
		
		
		
		
		String aux = "";
		boolean notOrdered = true;
		do
		{
			notOrdered = false;
			for(int i=0; i<nombres.length-1;i++)
			{
				
				if(nombres[i].compareToIgnoreCase(nombres[i+1]) > 0)
				{
					notOrdered = true;
					aux = nombres[i+1];
					nombres[i+1] = nombres[i];
					nombres[i] = aux;
					System.out.println( nombres[i] +"-"+ nombres[i+1]);
					/*
					System.out.println("\n***********");
					for(int j=0; j<nombres.length;j++)
						System.out.println(nombres[j]);
					System.out.println("**************");*/
					
				}
				else if(nombres[i].compareToIgnoreCase(nombres[i+1]) < 0)
				{
					System.out.println("<0" +nombres[i] +"-"+ nombres[i+1]);
				}
					
				
			}
		
		}while(notOrdered);
		
		
		
		
		System.out.println("\n** ORDENADO **");
		for(int i=0; i<nombres.length;i++)
			System.out.println(nombres[i]);
		
		//System.out.println(nombres[0].compareToIgnoreCase("Daniel"));
		
	}

}
