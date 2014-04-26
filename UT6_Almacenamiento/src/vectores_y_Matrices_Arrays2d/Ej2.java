package vectores_y_Matrices_Arrays2d;

public class Ej2 {
	/**
	 * Ejercicio 2. 
	 * 		Declara y crea un tipo de variable que sea capaz de contener 
	 * 		la nota que han obtenido 4 alumnos en los diferentes módulos 
	 * 		en los que están matriculados. Sabemos que el primer alumno
	 * 		está matriculado en 4 módulos; 
	 * 		el segundo, en 7 módulos; 
	 * 		el tercero, en 3 módulos, 
	 * 		yel cuarto, en 2 módulos.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] notas;
		notas = new int[4][];
		notas[0]= new int[4];
		notas[1]= new int[7];
		notas[2]= new int[3];
		notas[3]= new int[2];
		
		
		//imprime notas
		System.out.println("\n\nImprime el array con las notas");
		for(int i=0; i<notas.length; i++){
			for(int j=0;j<notas[i].length;j++){
				System.out.print(notas[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
