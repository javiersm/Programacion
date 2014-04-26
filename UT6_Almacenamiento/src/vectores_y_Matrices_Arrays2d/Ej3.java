package vectores_y_Matrices_Arrays2d;

/**Ejercicio 3. 
 	
 	Queremos guardar en la memoria del ordenador el número de alumnos matriculados (por módulos) en el ciclo de DAW. 
 	Sabemos que los alumnos matriculados por cada módulo son:

    21 alumnos matriculados en Sistemas Informáticos.
    17 alumnos matriculados en Base de Datos.
    30 alumnos matriculados en Programación.
    14 alumnos matriculados en Lengaje de Marcas.
    12 alumnos matriculados en Entornos de Desarrollo.
    25 alumnos matriculados en Acceso a Datos.

 * @author JS
 */
public class Ej3 {

	public static void main(String[] args) {
		
		
		int[][] alumnosMatriculados = new int[6][];
		
		alumnosMatriculados[0] = new int[21];
		alumnosMatriculados[1] = new int[17];
		alumnosMatriculados[2] = new int[30];
		alumnosMatriculados[3] = new int[14];
		alumnosMatriculados[4] = new int[12];
		alumnosMatriculados[5] = new int[25];
		
		System.out.println("\n\nArray Imprimido");
		for(int i=0; i<alumnosMatriculados.length; i++){
			for(int j=0;j<alumnosMatriculados[i].length;j++){
				System.out.print(alumnosMatriculados[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
