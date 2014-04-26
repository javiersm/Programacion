package vectores_y_matrices;

import java.util.Arrays;

public class Explicacion1 {

	public static void main(String[] args) {
		
		int[][] array1;
		
		array1 = new int[3][4]; //3 filas con 4 columnas
		array1[1][3]=7;
		
		/*representacion de lo que hemos hecho en array1
		
		 [[0,0,0,0],
		  [0,0,0,0],
		  [0,0,0,0]]
		 
		 */
		
		System.out.println("imprime una fila completa del array");
		System.out.println(Arrays.toString(array1[1]));
		
		
		
		System.out.println("\n\nImprime el array completamente");
		//Recorrer el array
		for(int i=0; i<array1.length; i++){
			for(int j=0;j<array1[i].length;j++){
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}

		
		
		//Array bidemsional de caracteres
		
		char[][] caracteres = {{'a','b'},{'c','d','e'},{'f','g'}};
		
		/* Representacion grafica de lo que he declarado arriba
		 
		 [['a','b'],
		  ['c','d']
		  ['f','g']]
		  
		 */
		
		System.out.println("\n\nImprime el array Caracteres");
		for(int i=0; i<caracteres.length; i++){
			for(int j=0;j<caracteres[i].length;j++){
				System.out.print(caracteres[i][j]+" ");
			}
			System.out.println();
		}
		
		//CREAR EL ARRAY INICALIZANDOLO LUEGO, es como el de arriba
		char[][] caracteres2;
		caracteres2 = new char[3][];
		caracteres2[0] = new char[2];
		caracteres2[1] = new char[3];
		caracteres2[3] = new char[2];
		
		caracteres2[0][0]='a';
		caracteres2[0][1]='b';
		caracteres2[1][0]='c';
		caracteres2[1][1]='d';
		caracteres2[1][0]='e';
		caracteres2[2][0]='f';
		caracteres2[2][1]='g';
			
		
		
	}

}
