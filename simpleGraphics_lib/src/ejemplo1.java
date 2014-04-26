

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Rectangle;

public class ejemplo1 {

	public static void main(String[] args) {
		//
		Rectangle cuadrado;
		Ellipse circulo;
		
		cuadrado = new Rectangle(100,100,300,300);
		cuadrado.setThickness(20);
		cuadrado.setColor(Color.RED);
		cuadrado.draw();
		
		circulo = new Ellipse(150,150,200,200);
		circulo.setThickness(20f);
		circulo.setColor(Color.BLUE);
		circulo.draw();
		
		Canvas.pause();
		
		circulo.undraw();
		
		

	}

}
