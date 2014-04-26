

import java.util.Scanner;

public class Edad {

	
	
	public static int añosEntre(int dia, int mes, int año, int dia_final, int mes_final, int año_final)
	{
		int dif_años;
		
		dif_años= año_final-año-1;
		
		if(mes_final>mes || (mes_final==mes && dia_final>=dia)){
			dif_años++;
		}
		return dif_años;
	}
	
	
	public static void main(String[] args) {
			/*
			//PRUEBAS
			System.out.println("Uno: " + añosEntre(1,1,2013,10,1,2014));
			System.out.println("Cero: " + añosEntre(11,1,2013,10,1,2014));
			System.out.println("Uno: " + añosEntre(10,1,2013,10,1,2014));
			System.out.println("Cero: " + añosEntre(10,7,2013,10,1,2014));
			System.out.println("Siete: " + añosEntre(8,4,2006,10,1,2014));
			*/
		
			Scanner teclado = new Scanner(System.in);
			
			while(true)
			{
				//pedir fecha nacimiento
				System.out.println("Fecha de nacimiento (dd mm aaaa): ");
				int dia_nac=teclado.nextInt();
				int mes_nac=teclado.nextInt();
				int año_nac=teclado.nextInt();
				
				//pedir fecha nacimiento
				System.out.println("Fecha actual (dd mm aaaa): ");
				int dia_actual=teclado.nextInt();
				int mes_actual=teclado.nextInt();
				int año_actual=teclado.nextInt();
				
				System.out.println("Tienes: " + añosEntre(dia_nac, mes_nac, año_nac, dia_actual, mes_actual, año_actual) + "años");
				
			}
			
			
			
	}

}
