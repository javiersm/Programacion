

import java.util.InputMismatchException;
import java.util.Scanner;

public class lanzarExcepciones {

	static Scanner teclado;
	
	
	public static float leerFloat() throws NumeroNegativo{
		float numero=0;
		
		try{
			numero = teclado.nextFloat();
			if(numero<0) 
				throw new NumeroNegativo(); //excepcion que e creado yo en otra clase
		}
		catch(NullPointerException e){
			System.out.println("Error. Scanner no inicializado");
			throw e; //AUNQUE AQUI LA HE TRATADO. LANZO LA EXCEPCION PARA QUE EL MAIN SE ENTERE Y LA PUEDA TRATAR EN MAIN TAMBIEN;
		}
		catch(InputMismatchException e){
			System.out.println("Error. No es un float");
			throw e; //si introduzco un float la lanzo de nuevo
		}
		catch(NumeroNegativo e){
			System.out.println("Error.");
		}
				
		return numero;	
	}
	
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		float numero = 0;
		boolean continuar = false;
		
		try{
			do{
				try{
					numero = leerFloat();
					
				}
				catch(NumeroNegativo e){
					continuar = false;
				}
				System.out.println(numero);	
			}while(continuar);
		}
		catch(NullPointerException e){
			System.out.println("No se pudo terminar el programa"+e.getMessage());
		}
		catch(InputMismatchException e){
			System.out.println("No se pudo terminar el programa correctamente" + e.getMessage());
		}
		

	}

}
