

import java.util.Scanner;

public class numerosAleatorios {

	
	public static int getNumAleatorio(int min, int max){
		int random = 0;
		random = (int) (Math.random() * ((max - min) + 1)) + min;
		return random;
	}
	
	
	
	public static void main(String[] args) {
		int min, max;
		
		/*
		System.out.println("Introduce un numero MIN y MAX     [Devolvera un num aleatorio entre esos valores]");
		Scanner teclado = new Scanner(System.in);
		min = teclado.nextInt();
		max = teclado.nextInt();
		System.out.println("[Aleatorio]: "+ numeroAleatorio(min,max));
		*/
		int minimo = -10;
		int maximo = 10;
		int repeticiones = 100000;
		int fallos = 0;
		
		for(int i=0; i<repeticiones; i++){
			int aleatorio = getNumAleatorio(minimo,maximo);
			System.out.printf("%8d", aleatorio);
			if(i%20 == 0)  System.out.println();
			
			if (aleatorio<minimo || aleatorio>maximo){
				System.out.print("\ngetNumAleatorio se ha ido de rango!!");
				fallos++;
			}				
		}
		if(fallos > 0)
			System.out.println(Integer.toString(fallos) + " fallos en "+ repeticiones + " repeticiones." );
		
		
	}
	

}
