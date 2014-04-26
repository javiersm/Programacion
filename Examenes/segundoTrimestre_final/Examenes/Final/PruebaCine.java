package Examenes.Final;
import java.util.Scanner;


public class PruebaCine {

	
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String input="";
		Cine cine = new Cine("Cinesa", 4);
		Pelicula[] enCartelera;
		
		
		String[] opciones = { "Crear Pelicula", "Borrar Pelicula", "Ver Peliculas", "Salir" };
		Menu menu = new Menu(opciones, 4);
		do{
			int elegido =  menu.show();
			System.out.println("Has elegido el: " + elegido);
			switch(elegido)
			{
				case 1:
					System.out.println("Introduce el nombre de la pelicula");
					input = teclado.next();
					cine.setPelicula(new Pelicula(input));
					//System.out.println("Pelicula creada!");
					break;
				case 2:
					System.out.println("Introduce el nombre de la pelicula que quieres borrar");
					input = teclado.next();
					cine.delPelicula(input);
					break;
				
				case 3:
					System.out.println("******* en cartelera *************");
					enCartelera = cine.getPeliculas();
					for(int i=0;i<enCartelera.length;i++)
					{
						if(enCartelera[i] != null)
							System.out.println(enCartelera[i].getNombre());
					}
					break;
					
				case 4:
					System.out.println("Gracias por utilizar nuestro servicio! Hasta Pronto");
					System.exit(0);
					break;
				
				default: System.err.println("Te has equivocado de opcion"); break;
			}
		}while(true);
	}

}
