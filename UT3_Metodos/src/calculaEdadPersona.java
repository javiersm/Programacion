

import java.util.Scanner;

public class calculaEdadPersona {

	/*
	 * Creando un m�todo que calcule los a�os que hay entre dos fechas, calcule la edad de una persona pidiendole la fecha actual y la de su nacimiento.
	 * El m�todo tendr� la forma: public static int a�osEntre(int dia, int mes, int a�o, int dia_final, int mes_final, int a�o_final)
	 */
	
	public static int getEdad(int a�o, int a�oActual){
		int edad = 0;
		
		return edad;
	}
	
	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
        System.out.println("A�o de nacimiento YY");
        int a�o = teclado.nextInt();
        
        System.out.println("A�o actual YY");
        int a�oActual = teclado.nextInt();
        
        System.out.println(getEdad(a�o,a�oActual));
        
        
	}

}
