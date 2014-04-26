package Examenes.Final;
import java.util.Arrays;


public class examen1 {

	
	public static int[] numerosRepetidos(int[] v)
	{
		int[] vectorRepetidos = Arrays.copyOf(v, v.length);
		Arrays.sort(vectorRepetidos);
		
		int[] aux = new int[vectorRepetidos.length];
		int auxindice=0;
		
		int totalRepetidos=0;
		//AQUI MIRO CUANTOS NUMEROS REPETIDOS HAY
		int numeroActual=vectorRepetidos[0];
		for(int i=0; i<vectorRepetidos.length-1; i++){
				for(int j=i+1; j<vectorRepetidos.length;j++)
				{
					if(vectorRepetidos[i] == vectorRepetidos[j]){
						if(auxindice==0)
						{
							//System.out.println(vectorRepetidos[i]);
							aux[auxindice]=vectorRepetidos[i];
							auxindice++;
							totalRepetidos++;
						}else if(aux[auxindice-1] != vectorRepetidos[i] && auxindice>0){
							//System.out.println(vectorRepetidos[i]);
							aux[auxindice]=vectorRepetidos[i];
							auxindice++;
							totalRepetidos++;
						}
					}		
				}
		}

		//LUEGO CREO UN ARRAY FINAL CON LA CANTIDAD DE NUMEROS REPETIDOS Y LO RELLENO
		System.out.println("Repetidos: "+ totalRepetidos);
		int[] vectorFinal = new int[totalRepetidos];
		int vfinalindice=0;
		//Relleno el array final con los valores repetidos
		for(int i=0; i<vectorRepetidos.length-1; i++){
			for(int j=i+1; j<vectorRepetidos.length;j++)
			{
				if(vectorRepetidos[i] == vectorRepetidos[j]){
					if(auxindice==0){
						aux[auxindice]=vectorRepetidos[i];
						auxindice++;
						totalRepetidos++;
						vectorFinal[vfinalindice]=vectorRepetidos[i];
						vfinalindice++;
					}else if(aux[auxindice-1] != vectorRepetidos[i] && auxindice>0){
						aux[auxindice]=vectorRepetidos[i];
						auxindice++;
						totalRepetidos++;
						vectorFinal[vfinalindice]=vectorRepetidos[i];
						vfinalindice++;
					}
				}		
			}
		}
		
		return vectorFinal;//vectorSinRepe;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] vectorRepetidos = {1,2,3,4,5,2,7,3,2};
		System.out.println("ArrayOriginal:" + Arrays.toString(vectorRepetidos));
		
		
		int[] vectorFinal;
		vectorFinal = numerosRepetidos(vectorRepetidos);
		System.out.println("ArrayRepetidos" + Arrays.toString(vectorFinal));
	}

}
