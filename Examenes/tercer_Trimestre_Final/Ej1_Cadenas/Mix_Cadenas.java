package Ej1_Cadenas;

public class Mix_Cadenas {

	
	public static String Mix(String cadena1, String cadena2){
		System.out.println("Cadena1: " + cadena1);
		System.out.println("Cadena2: " + cadena2);
		StringBuilder strFinal = new StringBuilder();
		
		int i=0;
		int j=0;
		boolean terminado = false;
		
		do
		{
			if(i<=cadena1.length()-1){
				strFinal.append(cadena1.charAt(i));
				i++;
				if(i<=cadena1.length()-1){
					strFinal.append(cadena1.charAt(i));
					i++;	
				}
			}
			
			if(j<=cadena2.length()-1){
				strFinal.append(cadena2.charAt(j));
				j++;
				if(j<=cadena2.length()-1){
					strFinal.append(cadena2.charAt(j));
					j++;
				}
			}
			
			if((i>=cadena1.length()-1) && (j>=cadena2.length()-1))
				terminado=true;
		}while(!terminado);
		
		System.out.println(strFinal);
		return strFinal.toString();
	}
	
	
	public static void main(String[] args) {
		String cad1 = "111111111";
		String cad2 = "33333333333";
		Mix_Cadenas.Mix(cad1, cad2);
		
		System.out.println();
		cad1 = "holaestoesunaprueba";
		cad2 = "ESTOTAMBIENESUNAPRUEBA";
		Mix_Cadenas.Mix(cad1, cad2);
		
	}

}
