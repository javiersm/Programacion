package BUCLES;
import java.util.Scanner;


public class buclesAnidadosEjemplo1 {

	public static void main(String[] args) {



		int linea,multiplicacion;
		
		
		for(int numero=1; numero<=10; numero++)
		{
			linea=1;
			multiplicacion = numero;
			for(int j=0; j<20; j++) System.out.print("-");
			System.out.printf("\nTabla del %3d \n", numero);
		    while (linea<=10) {	
			   System.out.println(numero + " x " + linea + " = " + (multiplicacion));
			   linea++;
			   multiplicacion+=numero; //multiplicacion=multiplicacion+numero;
		    }
		}

	}

}
