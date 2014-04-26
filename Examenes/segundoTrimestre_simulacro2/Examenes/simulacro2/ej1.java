package Examenes.simulacro2;

import java.util.Scanner;

public class ej1 {

	
	public static String generarClave() throws ClaveNoSegura
	{
		char[] input;
		Scanner teclado= new Scanner(System.in);
		do
		{
			System.out.println("Introduce una clave: (minimo 6 caracteres)");
			input = teclado.next().toCharArray();
			if(input.length<6)
			{
				throw new ClaveNoSegura();
			}else{
				System.out.println("Clave Correcta");
				return input.toString();
			}
		}while(true);
		 
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		try{
			generarClave();
		}catch(ClaveNoSegura cns){
			cns.getMessage();
			System.out.println(cns.toString());
			System.out.println(cns.getStackTrace());
			System.err.println("ERROR."+ cns.getMessage());
		}

	}

}
