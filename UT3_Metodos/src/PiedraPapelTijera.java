
import java.util.Random;
import java.util.Scanner;


public class PiedraPapelTijera {

	
	public enum Game {
		GANASTE,
		PERDISTE,
		EMPATE
	}
	static Game resultado;
	
	private final static int PIEDRA = 1;
	private final static int PAPEL = 2;
	private final static int TIJERA = 3;
	
	// CREARE EL JUEGO PIEDRA PAPEL Y TIJERA
	public static void main(String[] args) throws InterruptedException {
				
		System.out.println("Elige un numero para jugar:  1.PIEDRA  2.PAPEL 3.TIJERA");
		Scanner teclado = new Scanner(System.in);
		int mitirada = 0; //almaceno el valor de mi tirada
		mitirada = teclado.nextInt();
		
		
		if (mitirada > 3 || mitirada < 0){
			System.out.println("ERROR. Seleccion un numero de tirada valido. \n\nExit();");
			Thread.sleep(5000);
		}
		else
		{
			// VAMOS A JUGAR !!
			int eleccionMaquina = (int) (1 + Math.random() * 3);  //Selecciona un numero aleatorio del 1 al 3
						
			if (mitirada == eleccionMaquina){
				// empate
				resultado = Game.EMPATE;
			}else if ((mitirada == PIEDRA && eleccionMaquina == PAPEL) || (mitirada == PAPEL && eleccionMaquina == TIJERA) || ( mitirada == TIJERA && eleccionMaquina == PIEDRA)){
				//gana la maquina
				resultado = Game.PERDISTE;
			}else if ((mitirada == PIEDRA && eleccionMaquina == TIJERA) || (mitirada == PAPEL && eleccionMaquina == PIEDRA) || (mitirada == TIJERA && eleccionMaquina == PAPEL)){
				// He ganado
				resultado = Game.GANASTE;}
						
			System.out.printf("Tu eleccion : %s , eleccion de la maquina: %s ", mitirada, eleccionMaquina);
			switch(resultado)
			{
				case GANASTE:
					System.out.println("\n\nHAS GANADO !");
					break;
				case PERDISTE:
					System.out.println("\n\nHAS PERDIDO");
					break;
				case EMPATE:
					System.out.println("\n\nEMPATE");
					break;
				default:
					System.out.println("DEFAULT");
					break;
			}
		}
	}

}
