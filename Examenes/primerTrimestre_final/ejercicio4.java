
import java.util.Scanner;


public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] menu = new String[40];
		int elementosMenu = 0;
		String palabra = "";
		
		
		int i = 0;
		System.out.println("Bienvenido a Menu Generator.");
		System.out.println("Comenzaremos recopilando opciones (escribe * para terminar)");
		do{
			System.out.println("Dame una opcion:");
			palabra = teclado.next();
			if(!palabra.equals("*")){
				menu[i] = palabra;
				elementosMenu++;
				i++;
			}
			
		}while(!palabra.equals("*"));
		
		//añado la palabra salir al menu
		menu[i] = "Salir";
		elementosMenu++;
		
		
		
		
		boolean encontrado = true;
		do{
			encontrado = false;
			System.out.println("\n** Menú **");
			System.out.println("**********");
			for(i=0; i<elementosMenu; i++){
				System.out.println((i+1)+"." + menu[i]);
			}
			System.out.println("Option elegida:");
			palabra = teclado.next().toLowerCase();
			
			
			for(i=0; i<elementosMenu; i++){
				if(palabra.equals(menu[i].toLowerCase())){
					System.out.println("Ha elegido option: " + (i+1));
					encontrado = true;
				}
			}
			if(encontrado == false)
				System.out.println("No existe esa option");
			
		}while(!palabra.equals("salir"));
		
		System.out.println("Ta luego");
		

	}

}
