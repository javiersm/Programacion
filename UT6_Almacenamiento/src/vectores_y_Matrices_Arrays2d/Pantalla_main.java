package vectores_y_Matrices_Arrays2d;

import java.util.Scanner;

public class Pantalla_main {

	
	//public enum  Opciones {INV,IMPRIME, CUADRADO, SET_PIXEL, SALIR};
	//private static Opciones op; //una variable Opciones
	
	public static void main(String[] args) 
	{
		
		//Instancio una pantalla
		Pantalla pantalla = new Pantalla(); 
		pantalla.Pantalla(10, 10);
		pantalla.paint();
		
		//Creo el menu
		Menu menu;
		String[] options = { "Imprime", "Cuadrado", "setPixel_Char", "Salir" };
		menu = new Menu(options, 4);
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		//op = Opciones.IMPRIME;
		//System.out.println("imprime");
		//System.out.println(op);
				
		do{		
				/*		
			switch(menu.show())
			{
				case 1: pantalla.paint();
					return;
				
				case 2: pantalla.drawRectangle();
					System.out.println();
					return;
				
				case 3: 
					System.out.println("\nCada Pixel se representa ahora con: "); 
					System.out.print(pantalla.getPaintingChar());
					System.out.println("Introduce un nuevo caracter para dibujar: ");
					char c = teclado.next().charAt(0);
					pantalla.setPaintingChar(c);
					return;
				
				case 4: System.out.println("\nHasta Luego"); System.exit(0);
					return;
					
				default:
					return;
			}
				*/
			

		}while(true);
		
	}
	
	
	
}
