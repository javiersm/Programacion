package Examenes.simulacro1;

import java.util.Scanner;


/**2. 	(2 pts) Crear el m�todo est�tico pregunta_continuar() que
		muestra la t�pica pregunta ��Desea continuar (s/n)?�. El m�todo
		mostrar� el mensaje y controlar� que el usuario introduce una �s�
		o �n�. Si el usuario introduce otra cosa lo avisar� y volver�
		apreguntar. Finalmente devolver� un car�cter con valor �s� o �n�
		dependiendo de lo que el usuario eligiera.
						Ej:
						�Desea continuar (s/n)?
						g
						Debes introducir (s/n). Vuelve a intentarlo.
						s
 * 
 * @author JS
 *
 */
public class simulacro_2 {
	
	
	public static char pregunta_continuar(){
		char letra;
		Scanner teclado = new Scanner(System.in);
		do
		{
			System.out.println("�Desea continuar (s/n)?");
			letra = teclado.next().charAt(0);
			letra = Character.toLowerCase(letra);
			
		}while((letra !='s') && (letra!='n'));
		
		return letra;
	}

	public static void main(String[] args) {
		
		System.out.println("Has elegido:  "+simulacro_2.pregunta_continuar());


	}

}
