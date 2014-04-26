package encriptar;

public class desencriptar {
	
	
	/** Programa que desencripta la cadena que generamos en el programa de encriptación
	 * 
	 * @param args
	 */
	
	public static char[] desencriptar(char[] vectorEncript)
	{
		String str = "";
		char[] vector = vectorEncript;
		
		//imprime el array
		for(int i=0; i<vector.length;i++)
			System.out.print(vector[i]);
		
		
		vector[vector.length-1] -= 3+4;
		//System.out.println("\nImprime: " + vector[vector.length-1]);
		
		for(int i=vector.length-2; i>=0; i--){
			vector[i] -= vector[i+1];
			vector[i] -= 3;
		}
		
		
		/*
		System.out.println("*********");
		vector[vector.length-2] -= vector[vector.length-1];
		vector[vector.length-2] -= 3;
		System.out.println(vector[vector.length-2]);
		*/
		
		
		return vector;
	}
	

	public static void main(String[] args) {
		
		char[] pr = {'Ú','Þ','Ð','h'};
		
		pr = desencriptar(pr);
		System.out.println("\n\nPINTA DES-ENCRIPTACION:"); System.out.print("\t\t");
		for(int i=0; i<pr.length; i++) 
			System.out.print(pr[i]);

	}

}
