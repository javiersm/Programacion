package vectores_y_Matrices_Arrays2d;

import java.util.Scanner;

/**Ejercicio 5. 
 * Escribe un programa que pida 8 notas. 
 * El programa debe visualizar cuál es la nota más alta, 
 * luego la siguiente, y así sucesivamente. 
 * Si hay alguna nota repetida, se visualizará solo una vez.
 * 
 */
public class Ej5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		boolean continuar= false;
		int notas[] = new int[8];
		int notasRecogidas= 0;
		int tmp=0;
		
		System.out.println("Introduce 8 notas(numericas 0-10): ");
		do{
			for(int i=0; i<notas.length;)
			{
				System.out.println("Nota"+(i+1)+": ");
				tmp = teclado.nextInt();
				if(tmp>=0 && tmp<=10)
				{
					notas[notasRecogidas]=tmp;
					notasRecogidas++;
					i++;
				}
				else{
					System.err.println("Nota incorrecta. Vuelve a introducir la nota");
				}
			}
		}while(notasRecogidas<8);
		
		//int[] notas={2,1,3,2,5,8,9,10};
		for(int i=0; i<notas.length; i++)
		{
			System.out.println("Notas"+(i+1)+": "+ notas[i]);
		}
		
		int[] notasOrdenadas = new int[11];
		//Ordenar notas de mayor a menor y representar solo 1 de cada
		for(int i=0; i<notas.length; i++)
		{
			if(notasOrdenadas[notas[i]] == 0)
			{
				notasOrdenadas[notas[i]]++;
			}
			
		}
		
		System.out.println("\nNOTAS ORDENADAS");
		for(int i=notasOrdenadas.length-1; i>=0; i--)
		{
			if(notasOrdenadas[i]==1)
				System.out.println(i);
		}
		
	
		
	}

}
