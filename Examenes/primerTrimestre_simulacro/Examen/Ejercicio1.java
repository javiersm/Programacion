package Examen;


import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
	int cantidadNumeros;				
	int positivos = 0;
	int negativos = 0;
	double media = 0;
	Scanner teclado = new Scanner(System.in);
	
		

	System.out.println("¿Cuantos numeros vas a introducir? ");
	cantidadNumeros = teclado.nextInt();
	int numeros[] = new int[cantidadNumeros];
	
	for(int i=0; i<cantidadNumeros; i++){
		System.out.println("Introduce el numero " + i);
		numeros[i]= teclado.nextInt();
	}
	
	for(int i=0; i<cantidadNumeros; i++){
		if(numeros[i] > 0){
			positivos++;
		}else if (numeros[i] < 0){
			negativos++;
		}
	}
	
	System.out.printf("\nPositivo: %d: ", positivos);
	System.out.printf("\nNegativos: %d", negativos);
	
	for(int i=0; i<cantidadNumeros; i++){
		media += (double)numeros[i]; 
		
	}
	media = media / cantidadNumeros;
	System.out.print("\nMedia: " + media);

	}

}
