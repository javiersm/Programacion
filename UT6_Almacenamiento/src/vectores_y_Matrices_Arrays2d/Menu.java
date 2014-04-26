package vectores_y_Matrices_Arrays2d;

import java.util.Scanner;

public class Menu {

	private String[] opciones;
	private int num_opciones;
	private int currentOption = 0;
	private final int MAX_OPCIONES = 20;

	
	public Menu() {
		opciones = new String[MAX_OPCIONES];
	}

	public Menu(String[] opciones, int num_opciones) {
		this.opciones = new String[MAX_OPCIONES];
		for (int i = 0; i < num_opciones; i++)
			this.opciones[i] = opciones[i];
		
		this.num_opciones = num_opciones;
	}

	
	public void añadirOpcion(String nuevaOpcion) {
		if (num_opciones < MAX_OPCIONES) {
			this.opciones[num_opciones] = nuevaOpcion;
			num_opciones++;
		}
	}

	private void paintMenu() {
		System.out.println("\n******* MENU ****************");
		System.out.println("*****************************");
		for (int i = 0; i < num_opciones; i++)
			System.out.println((i + 1) + ". " + opciones[i]);
	}
	
	private boolean validate(int number){
		boolean verified = false;
		if(number >0 && number <= num_opciones)
		{
			verified = true;
		}else{
			System.err.println("ERROR. OpcionIncorrecta. ");
			verified = false;
		}
		return verified;
	}

	
	public int show() {
		Scanner scn = new Scanner(System.in);
		do
		{
			paintMenu();
			System.out.print("*********************"); System.out.print(" Opción:");
			currentOption = scn.nextInt();
		}while(!validate(currentOption)); //valida que la opcion esté dentro de las posibles
		return currentOption;
	}

	
	
	public int getCurrentOption(){
		return currentOption;
	}
	
	public int getOpcionesCount(){
		return num_opciones;
	}
	
	

	public static void main(String[] args) {

		/* para pruebas
		String[] opciones = { "Imprime", "Dibujar_Cuadrado", "setPixel_Char", "Salir" };
		Menu menu = new Menu(opciones, 4);
				
		do{
			int elegido =  menu.show();
			System.out.println("Has elegido el: " + elegido);
		}while(true);
		
		*/
	}
}
