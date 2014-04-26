package respasoExamen;

import java.util.Arrays;
import java.util.Scanner;

/** Crear la clase ArrayOrdenado. ArrayOrdenado almacena un array de números enteros que siempre está ordenado. La clase tendrá:
		- Un constructor, al que le pasamos un array de enteros que se almacenará internamente.
		- Un constructor, al que le pasamos un valor y crea un ArrayOrdenado de ese tamaño.
		- getElemento(int x) devuelve el valor del elemento en la posición x.
		- setElemento(int x, int elto) cambia el elemento en la posición x por el elemento elto. Obviamente, como es un array ordenado, si el número tiene otro orden se colocará automáticamente en otra posición.
		- toString()
 * 
 * @author JS
 *
 */
public class ArrayOrdenado {

	private int[] array;
	private int indice;
	private Scanner teclado = new Scanner(System.in);

	public ArrayOrdenado(int[] array)
	{
		this.array = array;
		ordenaArray(this.array);
	}
	
	public ArrayOrdenado(int tamaño)
	{
		this.array = new int[tamaño];
		for(int i=0; i<array.length-1;i++)
		{
			System.out.println("Introduce el valor de array " + (i+1) +": " );
			array[i] = teclado.nextInt();
		}
		ordenaArray(array);
	}
	
	public int getElemento(int index)
	{
		int valor= 0;
		
		return valor;
	}
	
	
	public void ordenaArray(int[] array)
	{
		Arrays.sort(array);
	}
	
	
	
	@Override
	public String toString() {
		return "ArrayOrdenado [array=" + Arrays.toString(array)+"]";
	}

	public static void main(String[] args) {
		int[] miArray = {10,25,30,5,45,99,2,12,0,2};
		ArrayOrdenado arrayOrdenado = new ArrayOrdenado(miArray);
		
		System.out.println("\n"+arrayOrdenado.toString());
		
	}

}
