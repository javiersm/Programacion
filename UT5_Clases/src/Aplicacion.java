

/**
 * Crea un programa que saque por consola el texto "Hola Mundo", y llama a esta clase Aplicación.
 * 
 *
 */

class Cerebro{
	public Cerebro(){
		System.out.println("Pensando...");
	}
}



class Alumno{
	
	private String nombre= "";
	private Cerebro cerebro1;
	
	public Alumno(){
		
		System.out.println("Constructor Ejecutandose !");
	}
	
	public Alumno(String nombre){
		System.out.println(nombre);
		cerebro1 = new Cerebro();
	}
	
}

public class Aplicacion {

	public static void main(String[] args) {


		System.out.println("Hola Mundo");

		Alumno javi = new Alumno("Javi");
	}

}
