

import java.util.Scanner;

public class calculaEdadPersona {

	/*
	 * Creando un método que calcule los años que hay entre dos fechas, calcule la edad de una persona pidiendole la fecha actual y la de su nacimiento.
	 * El método tendrá la forma: public static int añosEntre(int dia, int mes, int año, int dia_final, int mes_final, int año_final)
	 */
	
	public static int getEdad(int año, int añoActual){
		int edad = 0;
		
		return edad;
	}
	
	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
        System.out.println("Año de nacimiento YY");
        int año = teclado.nextInt();
        
        System.out.println("Año actual YY");
        int añoActual = teclado.nextInt();
        
        System.out.println(getEdad(año,añoActual));
        
        
	}

}
