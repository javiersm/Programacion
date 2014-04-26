

/*     *** CRIBA DE ERATOSTENES *** 
La criba de Eratóstenes es un algoritmo que permite hallar todos los números primos menores que un número natural dado n. 
Se forma una tabla con todos los números naturales comprendidos entre 2 y n, y se van tachando los números que no son primos 
de la siguiente manera: Comenzando por el 2, se tachan todos sus múltiplos; comenzando de nuevo, 
cuando se encuentra un número entero que no ha sido tachado, ese número es declarado primo, 
y se procede a tachar todos sus múltiplos, así sucesivamente. 
El proceso termina cuando el cuadrado del mayor número confirmado como primo es mayor que n.
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
 * Escribe un programa que implemente el algoritmo de la criba de Eratóstenes. 
 * El cáculo de la criba se hará en un método, que imprimirá cada uno de los números no primos encontrados. 
 * El pseudocódigo en la página en inglés es más claro.
 */
	
	public static void main(String[] args) {

		imprimeEratostenes(20);
		// 2,3,5,7,11,13,
	}

}
