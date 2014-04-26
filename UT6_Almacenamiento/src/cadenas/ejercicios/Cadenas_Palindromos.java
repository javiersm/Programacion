package cadenas.ejercicios;

import java.util.Scanner;


/** Clase que comprueba si dos cadenas son palindromas
 * 
 * @author JS
 *
 */

public class Cadenas_Palindromos {
	/*
	private String cadena1="Alli ves Sevilla";
	private String cadena2="Ami me mima";
	private String cadena3="";
	*/
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una cadena para comprobar si es palindroma: ");
		String cadena = "alli ves sevilla";//= teclado.next();
		//System.out.println(cadena); 
		
		StringBuffer cadenabuffer = new StringBuffer(cadena);
		
		
		//borrar espacios en blanco que contenga la cadena
		boolean hayEspacios = true;
		do
		{
			if(cadenabuffer.indexOf(" ") != -1)
			{
				cadenabuffer.delete(cadenabuffer.indexOf(" "), cadenabuffer.indexOf(" ")+1);
				hayEspacios = true;
			}else{
				hayEspacios = false;
			}
			
		}while(hayEspacios);
		System.out.println("cadena sin espacios: " + cadenabuffer);
		
		
		
		
		//creo otra cadena igual pero al reves
		StringBuffer cadenaAlReves = new StringBuffer(cadenabuffer);
		cadenaAlReves.reverse();
		System.out.println("cadena del reves:    " + cadenaAlReves);
		
		
		//comparo cada posicion del string para saber si son palindromos
		boolean esPalindromo = true;
		for(int i=0; i<cadenabuffer.length();i++)
		{
			if(cadenabuffer.charAt(i) != cadenaAlReves.charAt(i))
			{
				//System.out.println("CADENA DISTINTAS");
				esPalindromo = false;
			}
		}
		
		
		//muestro la solucion final
		if(esPalindromo)
		{
			System.out.println("\nSON PALINDROMOS.");
		}else{
			System.out.println("\nNO SON PALINDROMOS.");
		}
		

		
		
		

	}

}
