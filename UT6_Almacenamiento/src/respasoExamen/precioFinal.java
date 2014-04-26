package respasoExamen;

import java.util.Scanner;

/** Escribir un metodo llamado precioFinal que dado un precio y una
 *  cantidad devuelva el precio final resultado de aplicar el descuento
 *  del 2% si la cantidad es mayor que 6 y 4% si es mayor que 12.
 *  Si al metodo se le pasan como parámetros números no válidos, devolverá la
 *  excepcion IllegalArgumentException.
 *  Escribir tambien el codigo que pruebe que funciona correctamente y también que devuelve la excepción si
 *  los valores passados no son correctos.
 *  
 * 	@author JS
 *
 */

public class precioFinal {

	public static double precioFinal(double precio, int cantidad) throws IllegalArgumentException
	{
		double costeTotal = 0;
		if(precio<=0 || cantidad<=0)
		{
			throw new IllegalArgumentException();
		}
		
		//Si la cantidad es mayor q 6 haz descuento del 2%
		if(cantidad > 6 && cantidad<=12)
		{
			System.out.println("Descuento del 2%");
			costeTotal = ((precio * cantidad) - (precio*cantidad*2)/100);
		} //si cantidad es > 12 descuenta el 4%
		else if(cantidad > 12)
		{
			System.out.println("Descuento del 4%");
			costeTotal = (precio * cantidad) - (precio*cantidad*4)/100;
		}
		else{
			costeTotal = precio * cantidad;
		}
		return costeTotal;
	}
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		double precio = teclado.nextDouble();
		System.out.println("Introduce la cantidad: ");
		int cantidad = teclado.nextInt();
		try
		{
			System.out.println(precioFinal(precio,cantidad));
		}catch(IllegalArgumentException e ){
			System.err.println("Error. ");
			e.printStackTrace();
		}
		
	}

}
