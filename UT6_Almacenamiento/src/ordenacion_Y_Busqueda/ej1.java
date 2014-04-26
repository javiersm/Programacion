package ordenacion_Y_Busqueda;

/**
 * Ejercicio 1. 
 * Escribe un programa que genere los seis números aleatorios de la lotería primitiva. 
 * No puede haber números repetidos.
 * @author JS
 *
 */

public class ej1 {

	
	//devuelve un numero (comprendido entre 0 y numerosMax)
	public static int devuelveNumero(int numerosMax){
		int num = (int)(Math.random()*numerosMax);
		return num;
	}
	
	public static void main(String[] args) {
		
		int numerosMax = 49;
		int[] numeros = new int[6];
		
		
		for(int i=0; i<numeros.length; )
		{
			
			int n = devuelveNumero(numerosMax);
			
			boolean duplicado = false;
			//compruebo si el numero que he recibido lo tengo ya en el array
			for(int j=0; j<numeros.length-1;j++)
			{
				if(n == numeros[j])
				{
					//System.out.println( n + "duplicado");
					duplicado = true;
				}
			}
			
			if(!duplicado) //sino esta en el array lo introduzco 
			{
				numeros[i]= n;
				i++;
			}
			
		}
		
		System.out.println("Numeros de la Loteria");
		for(int i=0;i<numeros.length;i++)
			System.out.print("\t"+numeros[i]);
	}

}









