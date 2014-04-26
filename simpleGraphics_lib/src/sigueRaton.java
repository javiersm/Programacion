

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Rectangle;
import graphics2.Text;

import java.awt.Point;

public class sigueRaton {

	public static void main(String[] args) {

		//
		Rectangle cuadrado;
		Ellipse circulo;

		cuadrado = new Rectangle(100, 100, 300, 300);
		cuadrado.setThickness(20);
		cuadrado.setColor(Color.BLACK);
		cuadrado.draw();

		circulo = new Ellipse(250, 250, 30, 30);
		circulo.setThickness(20f);
		circulo.setColor(Color.RED);
		circulo.fill();
		circulo.draw();

		Canvas c;
		c = Canvas.getInstance();

		Text text1 = new Text(5, 5, "X:   Y:  ");
		text1.grow(4, 4);
		text1.draw();
		System.out.println("PINCHA CON EL RATON EN EL CANVAS");

		while (true) {
			
			//METODO QUE DEVUELVE LAS CORDENADAS DEL RATON
			Point pulsacionRaton = c.getMousePosition();
			
			text1.setText(String.format("X:%d  Y:%d", pulsacionRaton.x,
					pulsacionRaton.y));


			circulo.translate(
					(pulsacionRaton.x - circulo.getX())
							- (circulo.getWidth() / 2),
					(pulsacionRaton.y - circulo.getY())
							- (circulo.getHeight() / 2));

		}

	}

}
