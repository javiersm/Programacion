package vectores_y_Matrices_Arrays2d;

import java.util.Scanner;


/**Ejercicio 6. 
 * Escribe un programa que obtenga la letra del DNI. 
 * El procedimiento para obtener la letra consiste en dividir el número del DNI por 23. La parte entera del resultado obtenido se multiplica por 23. 
 * Seguidamente, al DNI original se le resta el último resultado obtenido. 
 * Como resultado final de esta última operación dará un número que estará siempre comprendido entre 0 y 23. 
 * 
 * Según el valor de este último, 
 * se aplicará la siguiente tabla: 0=T 1=R 2=W 3=A 4=G 5=M 6=Y 7=F 8=P 9=D 10=X 11=B 12=N 13=J 14=Z 15=S 16=Q 17=V 18=H 19=L 20=C 21=K 22=E 23=O
 * 
 * @author JS
 * @category DNI VALIDATOR
 */
public class Ej6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numeroDNI = 0;
		int numeroDNIcopy = 0;
		
		System.out.println("Introduce el numero del DNI: ");
		numeroDNI = teclado.nextInt();
		
		int aux= numeroDNI;
		numeroDNIcopy = numeroDNI;
		aux = aux/23;
		//System.out.println("division"+aux);
		aux = aux*23;
		//System.out.println("entera*multiplicacion: "+ aux);
		
		numeroDNI = numeroDNI - aux;
		
		if(numeroDNI>=0 && numeroDNI<=23)
		{
			char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','O'};
			System.err.println("\nTU LETRA ES: " + numeroDNIcopy + "-" + letras[numeroDNI]);
		}
		else{
			System.err.println("DNI ERRONEO");
		}
		
		//System.out.println("numeroDNI restante" + numeroDNI);
		

		
		
	}

}
