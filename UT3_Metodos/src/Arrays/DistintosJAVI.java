package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DistintosJAVI {

	public static void main(String[] args) {
		// INTRODUCE NUMEROS MAXIMO 10
		// Dime cuantos numeros distintos existen:
		
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] numerosDistintos = new int[10]; //en este array SOLO guardo los numeros introducidos
		int numIntroducido = 0;
		int numDistintos = 0;
		int totalNumeros = 0;
		
		System.out.println("Introduce numeros [max:10]: ");
		int i = 0;
		do{
			System.out.println("Introduce numero: ");
			numeros[i] = teclado.nextInt();
			numIntroducido = numeros[i];
			i++;
			totalNumeros++;
		}while((i < numeros.length) && (numIntroducido != 0));
		
		
		
		System.out.println("*** IMPRIME ARRAY ***");
		for( i=0; i<numeros.length; i++){
			System.out.print(" " + numeros[i]);
		}
		
		boolean repeated = false; 
		for(i=0; i<totalNumeros; i++){
			repeated = false;
			for(int j=0; j<totalNumeros; j++){
				if((numeros[i] == numeros[j]) && (i != j))
						repeated = true;				
			}
			if(repeated == false){
				numDistintos++;
				numerosDistintos[i] = numeros[i];
			}else if(repeated == true){
				boolean introduce= false;
				for(int k=0; k< totalNumeros; k++){
				introduce = false;
					if((numeros[i] != numerosDistintos[k]) && (i != k)){ //REVISA SI YA HEMOS INTROODUCIDO numero[i] en el array, sino lo introduzco
						introduce = true;
					}
				}
				if (introduce == true){
					numerosDistintos[i] = numeros[i];	
					numDistintos++;					
				}		
			}
			
		}
		
		System.out.println("\tnumeros distintos:" + numDistintos);
		System.out.println("*** IMPRIME ARRAY DISTINTOS ***");
		for( i=0; i<numerosDistintos.length; i++){
			System.out.print(" " + numerosDistintos[i]);
		}	
	}
		

}
