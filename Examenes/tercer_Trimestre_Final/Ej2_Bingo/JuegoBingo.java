package Ej2_Bingo;

public class JuegoBingo {

	
	
	/** Prueba
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Bingo bingo = new Bingo();
		
		Carton carton1 = new Carton();
		Carton carton2 = new Carton();
		Carton carton3 = new Carton();
		
		int bola = 0;
		int numerosSacados =0;
		do{
			
			bola = bingo.saca();
			numerosSacados++;
			System.out.println(numerosSacados);
			carton1.marca(bola);
			carton2.marca(bola);
			carton3.marca(bola);
			
		}while(!carton1.esBingo() && !carton2.esBingo() && !carton3.esBingo());
		
		
		if(carton1.esBingo()){
			System.out.println("HA GANADO EL CARTON 1");
		}
		if(carton2.esBingo()){
			System.out.println("HA GANADO EL CARTON 2");
		}
		if(carton3.esBingo()){
			System.out.println("HA GANADO EL CARTON 3");
		}
		
		System.out.println("\n"+carton1);
		System.out.println("\n"+carton2);
		System.out.println("\n"+carton3);
		
		
	}

}
