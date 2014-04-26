

/*     *** CRIBA DE ERATOSTENES *** 
La criba de Erat�stenes es un algoritmo que permite hallar todos los n�meros primos menores que un n�mero natural dado n. 
Se forma una tabla con todos los n�meros naturales comprendidos entre 2 y n, y se van tachando los n�meros que no son primos 
de la siguiente manera: Comenzando por el 2, se tachan todos sus m�ltiplos; comenzando de nuevo, 
cuando se encuentra un n�mero entero que no ha sido tachado, ese n�mero es declarado primo, 
y se procede a tachar todos sus m�ltiplos, as� sucesivamente. 
El proceso termina cuando el cuadrado del mayor n�mero confirmado como primo es mayor que n.
*/


public class cribaEratostenes {

	public static void imprimeEratostenes(int n){
		
		if(n<=1) return;
		
		boolean[] A; 
		A = new boolean[n+1];
		for(int i=0; i<n; i++) A[i]=true; //creo un array con n elementos y los pongo todos a true;
		
		for(int i=2; i<Math.sqrt(n); i++){
			if(A[i]==true){
				for(int j=i*i; j<=n; j+=i){
					A[j]=false;
				}
			}
		}
		
		//Quiero que imprima los numeros NO primos
		for(int i=2; i<n; i++){
			if(!A[i])
				System.out.println(i + " ");
		}
	}
	
/* EJERCICIO DE CLASE
 * Escribe un programa que implemente el algoritmo de la criba de Erat�stenes. 
 * El c�culo de la criba se har� en un m�todo, que imprimir� cada uno de los n�meros no primos encontrados. 
 * El pseudoc�digo en la p�gina en ingl�s es m�s claro.
 */
	
	public static void main(String[] args) {

		imprimeEratostenes(20);
		// 2,3,5,7,11,13,
	}

}
