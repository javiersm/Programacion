package vectores_y_Matrices_Arrays2d;

import java.util.Scanner;

/**Ejercicio 4. 
 * Escribe un método que se encargue de crear y cargar un vector 
 * con números decimales (con datos que se insertan por el teclado). 
 * El método devolverá dicho vector.
 * 
 * @author JS
 *
 */
public class Ej4 {
	
	
	public static int[] crearArray(){
		int tamaño=0;
		int indice=0;
		int[] vector;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el tamaño del Array que quieres crear: ");
		vector = new int[tamaño=teclado.nextInt()];
		
		for(int i=0; i<vector.length;i++)
		{
			System.out.println("Introduce el valor ["+(i+1)+"]: ");
			vector[i]=teclado.nextInt();
		}
		
		return vector;
	}
	
	
	
	
	

	public static void main(String[] args) {
			
		int[] vector = crearArray();
		
		for(int vc:vector)
			System.out.print(vc);	
		

	}

}
