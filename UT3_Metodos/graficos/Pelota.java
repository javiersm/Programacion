package ejemplos.graficos;


import simple_Graphics_Library.graphics.Canvas;
import simple_Graphics_Library.graphics.Color;
import simple_Graphics_Library.graphics.Ellipse;
import simple_Graphics_Library.graphics.Rectangle;


public class Pelota {
	
	static int movimiento_x;
	static int movimiento_y;
	static Ellipse pelota;
	static Color color;
	static Rectangle tablero;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		pelota = new Ellipse(200,200,40,40);
		color = new Color((int) (Math.random()*256),
						  (int) (Math.random()*256),
						  (int) (Math.random()*256));
		
		Rectangle tablero = new Rectangle(0,0,400,400);
		tablero.draw();
		
		pelota.setColor(color);
		pelota.fill();
		
		if(movimiento_x == 0) movimiento_x++;
		if(movimiento_y == 0) movimiento_y++;
		
		//(int) (Math.random() * (max-min+1)) + min
		movimiento_x = (int) (Math.random() * (5-(-5)+1)) -5;
		movimiento_y = (int) (Math.random() * 11) -5;
		
		while(true)
		{
			pelota.translate(movimiento_x, movimiento_y);
			if((pelota.getX()+ 40)>400 || pelota.getX()<0){ 
				movimiento_x *= -1;}
			if((pelota.getY()+ 40)>400 || pelota.getY()<0) 
				movimiento_y *= -1;
			Thread.sleep(20);
		}

	}

}
