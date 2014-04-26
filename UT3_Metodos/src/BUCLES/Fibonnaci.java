package BUCLES;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		//Crea una colecci�n con los primeros X n�meros de la serie de Fibonacci, 
		//donde X es un n�mero que pedir�s al usuario. 
		//Despu�s pregunta n�meros y di si est� en esa serie o no. 
		//El programa terminar� cuando el usuario introduzca un 0.
		
		int[] fibonacci =  new int[50];
		Scanner teclado = new Scanner(System.in);
		int numComienzo = 0;
		
		
		System.out.println("Introduce por qu� numero quieres que empiece la serie Fibonnaci");
		numComienzo = teclado.nextInt();
		if(numComienzo == 0)
		{
			System.out.println("no es correcto. debe ser mayor que 0");
		}else{
			fibonacci[0] = 0;
			fibonacci[1] = numComienzo;
			for(int i=1; i<fibonacci.length-1; i++){
				fibonacci[i+1] = fibonacci[i] + fibonacci[i-1];
			}
		}
		
		System.out.println("Sucesion Fibonacci:");
		for(int i=0; i<fibonacci.length; i++){
			System.out.print(" " + fibonacci[i]);
			if(i%20 == 0)
				System.out.println();
		}
		
		int numIntroducido = 0;
		
		do{
			System.out.println("\n\nIntroduce un numero para saber si esta en la sucesion: ");
			numIntroducido = teclado.nextInt();
			if(numIntroducido != 0){
				boolean encontrado = false;
				for(int i=0; i<fibonacci.length; i++){
					if(fibonacci[i] == numIntroducido){
						encontrado = true;
					}
				}
				if(encontrado){
					System.out.print("\tCorrecto! se encuentra en la serie");
				}else{
					System.out.print("\tNo se encuentra en la serie");
				}
					
			}
			
		}while(numIntroducido != 0);
		
		System.out.println("FIN PROGRAMA");
		
	}

}
