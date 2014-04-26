package ejemplos.graficos;

import simple_Graphics_Library.graphics.Canvas;
import simple_Graphics_Library.graphics.Color;

public class MundoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Canvas.getInstance();
		
		
		Semaforo semaforo1 = new Semaforo();
		
		
		int x= 600;
		Coche coche = new Coche();
		coche.coche(x, Color.GREEN);
		
		Coche coche2 = new Coche();
		coche2.coche();
		
		Coche coche3 = new Coche();
		coche3.coche(300, Color.DARK_GRAY);
		
	}

}
