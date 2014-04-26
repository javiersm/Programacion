

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones_4 {

	//Modifica el ejercicio 3 para que si el usuario tiene más de 5 errores 
	//muestre el mensaje "Demasiados fallos. Vuelve a intentarlo otro día".
	
    public static void main(String[] args) {
        int dividendo=0,divisor=0;
        Scanner teclado=new Scanner(System.in);
        
        boolean hayError = false;
        int contadorErrores = 0;
        
        
        do{
        		if(contadorErrores==5){
        			System.out.println("\n\nDEMASIADOS FALLOS. Vuelve a intentarlo otro dia");
        			break;
        		}
        	
                try{
                        System.out.print("Introduce un numero: ");
                        dividendo=teclado.nextInt();
                        divisor=teclado.nextInt();
                        hayError = false;
                        System.out.println("Resultado: " + (dividendo/divisor));
                       
                }
                catch (InputMismatchException|ArithmeticException e){ //detecta q hemos introducido un caracter q no coincido cn la variable ó un cero
                        teclado.nextLine(); //limpiar buffer para no volver a generar excepción
                        System.out.println("ERROR. El numero introducido no es un numero o es 0." + e.getMessage() );
                        contadorErrores++;
                        hayError = true;
                }
         
        }while(hayError && contadorErrores<=5);

        System.out.println("FIN");
        teclado.close();
        

}

}

