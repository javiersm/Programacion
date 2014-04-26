package Examen;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		
		String[] versos = new String[40];
		Scanner teclado = new Scanner(System.in);
		String tecladoInput= "";
		int numeroFrases;
		System.out.println("BIENVENIDO A HAIKU GENERATOR");
		System.out.println("\nComenzaremos recopilando versos (escribe * para terminar)");
		boolean otroHaiku = true;
		
		numeroFrases = 0;
		do{
			System.out.println("Escribe una frase: ");
			tecladoInput = teclado.next();
			if (tecladoInput.equals("*"))
			{
				System.out.println("has pulsado *");
				otroHaiku = false;
				break;
			}
							
			do
			{
				System.out.println("Introduce otra frase: ");
				tecladoInput = teclado.next();
				if(numeroFrases >= 3){
					do{
						System.out.println("Otro Haiku? S/N: ");
						tecladoInput = teclado.next();
					}while(tecladoInput != "s" || tecladoInput != "n" || tecladoInput !="*");
				}
				numeroFrases++;
			}while(numeroFrases < 3);
				
			if (tecladoInput.toLowerCase().equals("n")){
				otroHaiku = false;
				break;
			}
		
			
		}while((tecladoInput != "*") || (otroHaiku == false));

		System.out.println("FIN PROGRAMA");
	}

}
