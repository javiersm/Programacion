package Examenes.simulacro1;

import java.util.Scanner;

/**(3 pts) 	Crea la clase Numero que permite llevar la cuenta de
			los números dados en la cola de la charcutería. La clase
			almacenará el número que se está atendiendo (sale en el
			marcador) y el último número que se ha dado (el que se ha
			impreso). La clase tendrá los métodos:
			darNumero(): da el siguiente número (lo imprime por
			pantalla).
			atender(): muestra el número del cliente que tiene ir al
			mostrador
			mostrarCola(): muestra el número de clientes haciendo cola
			e imprime la lista de sus números.
			Crea un menú para poder cogeer/dar números y ver la cola.
 * 
 * @author JS
 *
 */


/**
 * Charcuteria Numeros
 */
public class simulacro_3 {

	private static int numeroActual = 0;
	private static int numeroAtendiendo = 0;
	
	
	public static int darNumero()
	{
		numeroActual++;
		System.out.println("Tu numero: "+ numeroActual);
		return numeroActual;
	}
	
	public static int atender()
	{
		if (numeroAtendiendo < numeroActual)
		{
			numeroAtendiendo++;
			System.out.println("Atendiendo a: "+ numeroAtendiendo);
		}else{
			System.err.println("No se puede atender mas numeros que los que hay en cola!!");
		}
		
		return numeroAtendiendo;
	}
	
	public static int mostrarCola()
	{
		System.out.println("Quedan por atender: " + (numeroActual - numeroAtendiendo));
		for(int i=numeroAtendiendo;i<=numeroActual;i++)
			System.out.println(i);
		return numeroActual - numeroAtendiendo;
	}
	
	public static int menu()
	{
		int eleccion = 0;
		Scanner teclado = new Scanner(System.in);
		do
		{
			System.out.println("**** MENU *****");
			System.out.println("1. Coger Numero");
			System.out.println("2. Atender");
			System.out.println("3. ver Cola");
			System.out.println("4. Salir");
			eleccion = teclado.nextInt();
		}while(eleccion<0 && eleccion>4);
		return eleccion;
	}
	
	public static void main(String[] args) {
		
		
		do
		{
			int eleccion = menu();
			switch(eleccion)
			{
				case 1: darNumero();
					break;
				case 2: atender();
					break;
				case 3: mostrarCola();
					break;
				case 4: System.exit(0);
					break;
						
			}
			
			
		}while(true);
		
		
	}

}
