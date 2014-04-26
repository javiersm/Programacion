package ejemplos.graficos;

import simple_Graphics_Library.graphics.Rectangle;

public class Ajedrez {

	
	static int tablero_x = 600;
	static int tablero_y = 600;
	static int casillas_x = 7;
	static int casillas_y = 7;
	static int tamaño = 50;
	
	static Rectangle tablero;
	
	int ajedrez[][];
	
	public static void main(String[] args) {
		
	tablero = new Rectangle(0,0,tablero_x,tablero_y);
	tablero.draw();
	
	for(int i=0; i<=casillas_x; i++)
	{
		for(int j=0; j <=casillas_y; j++)
			if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0)
			{
		         Rectangle casilla;
                 casilla=new Rectangle(j*tamaño,i*tamaño,tamaño,tamaño);
                 casilla.fill();
			}
				
				//System.out.println("tablero" + i);
	}
		
		

	}

}
