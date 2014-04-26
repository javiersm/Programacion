package vectores_y_matrices;

import java.util.Arrays;

public class SortingAlgorithm {

	public static void main(String[] args) {
		
		int[] numeros = {3,6,3,76,89,5,2,6,7,4,20,50,200,58,030,28,99,201,02,38};
		
		System.out.print("Array Original: ");
		System.out.println(Arrays.toString(numeros));
		
		
		
		int[] ordenado = Arrays.copyOf(numeros, numeros.length); // copio el origanl a otro array
		Arrays.sort(ordenado); //ordeno el array
		System.out.print("\nArray Ordenado: ");
		System.out.println(Arrays.toString(ordenado));
	
		
		
		//BUSQUEDA 
		if(Arrays.binarySearch(ordenado, 76)>=0) //SI ESTA EL NUMERO: devuelve la posicion del elemento
				System.out.println("76 está");
		else if(Arrays.binarySearch(ordenado, 76)==-1)
		{
				//SI NO ESTA DEVUELVE UN NUMERO NEGATIVO
		}
		
		

	}
	
	

}
