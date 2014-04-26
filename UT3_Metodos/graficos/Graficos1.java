package ejemplos.graficos;

import simple_Graphics_Library.graphics.Canvas;
import simple_Graphics_Library.graphics.Color;
import simple_Graphics_Library.graphics.Ellipse;
import simple_Graphics_Library.graphics.Rectangle;

public class Graficos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Canvas lienzo;
		lienzo = Canvas.getInstance();
		
		Rectangle rectangulo = new Rectangle(10,10,300,400);
		rectangulo.draw();
		
		Canvas.pause();
		rectangulo.translate(60, 60);
		rectangulo.setColor(Color.MAGENTA);
		
		
		
		Color gris = new Color(200,200,200);
		rectangulo.setColor(gris);
		rectangulo.fill();
		
		
		
	}

}
