
import java.util.Scanner;


public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double tempSala =  0.0;
		double histeresis = 0.0;
		double tempActual = 0.0;
		boolean termoestato = false;
		
		System.out.println("¿A que temperatura quieres estar?:");
		tempSala = (double)teclado.nextFloat();
		System.out.println("¿Con que histeresis trabajamos?");
		histeresis = (double)teclado.nextFloat();
		
	
		
		while(true){
			
			System.out.println("\nTemperatura Actual?:");
			tempActual = teclado.nextDouble();
			
			if((tempActual >= (tempSala + histeresis) && (termoestato == true))){
				termoestato = false;
			
			}else if(tempActual <= (tempSala - histeresis) && (termoestato == false)){
				termoestato = true;
			}
			
			if(termoestato == true){
				System.out.println("encendido");
			}else{
				System.out.println("apagado");
			}			
		}
		

	}

}
