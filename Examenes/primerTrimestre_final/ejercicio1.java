
import java.util.Scanner;


public class ejercicio1 {

	public static void main(String[] args) {
		
		String dibujo = "";
		Scanner teclado = new Scanner(System.in);
		int col = 0;	
		System.out.println("Introduce el numbero de columnas para crear la figura: ");
		col = teclado.nextInt();
		int i = 0;
	
		/*
		System.out.println("figura 1");
		for(i=0; i<col; i++){
			dibujo = "";
			for(int j=col-i; j>0; j--){
				dibujo = dibujo + "@";
			}
			System.out.println(dibujo);
		}
		
		
		
		System.out.println("figura 2");
		
		for(i=0; i<col; i++){
			dibujo = "";
			for(int k=0; k<=i; k++){
				dibujo= dibujo + " ";
			}
			for(int j=0; j<(col-i); j++){
				dibujo = dibujo + "@";
			}
			System.out.println(dibujo);
		}
		

		
		System.out.println("\n figura 3");
		for(i=0; i<col;i++){
			for(int j=0; j<col-i; j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++){
				System.out.print("@ ");
			}
			System.out.println();
		}
		*/
		
		System.out.println("\n Arbol de Navidad");
		//primera parte del arbol
		int col1 = (col/3);
		for(i=0; i<col1;i++){
			for(int j=0; j<col-i; j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++){
				System.out.print("@ ");
			}
			System.out.println();
		}
		int col2 = (col/2);
		//segunda parte del arbol
		for(i=0; i<(col2);i++){
			for(int j=0; j<col-i; j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++){
				System.out.print("@ ");
			}
			System.out.println();
		}
		//tercera parte del arbol
		for(i=0; i<col-(col1);i++){
			for(int j=0; j<col-i; j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++){
				System.out.print("@ ");
			}
			System.out.println();
		}
		//int col1 = (col/3);
		for(i=0; i<col;i++){
			for(int j=0; j<col-i; j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++){
				System.out.print("@ ");
			}
			System.out.println();
		}
		
		/*
		System.out.println("figura 3");
		if(col%2 != 0){
			col++;
		}			
		dibujo = "";
		for(i=0; i<col; i++){			
			if((i%2 == 0)){
				dibujo = dibujo + "@";
			}
			if(!(i%2 == 0)){
				dibujo = dibujo + " ";
			}
		}
		System.out.println(dibujo);
*/
		

		


		
		
		
		
		
		
		
	}
	

}
