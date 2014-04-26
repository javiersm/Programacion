

import java.awt.Point;

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Rectangle;
import graphics2.Text;

public class clickRaton {

	public static void main(String[] args) {
		//
		Rectangle cuadrado;
		Ellipse circulo;
		
		cuadrado = new Rectangle(100,100,300,300);
		cuadrado.setThickness(20);
		cuadrado.setColor(Color.BLACK);
		cuadrado.draw();
		
		circulo = new Ellipse(250,250,30,30);
		circulo.setThickness(20f);
		circulo.setColor(Color.RED);
		circulo.fill();
		circulo.draw();
		
		
		 
		
		Canvas c;
		//Se puede hacer ASÍ
		c= Canvas.getInstance();
		//c.waitMouseClick();
		
		//O se puede hacer ASI (Es lo mismo que el codigo de arriba)
		/* Canvas.getInstance().waitMouseClick(); //Esto lo que hace es como un "Canvas.pause()" se espera hasta que pinchemos con el raton. */
		
		
		
		Text text1 = new Text(5, 5, "X:   Y:  ");
		text1.grow(4, 4);
		text1.draw();
		System.out.println("PINCHA CON EL RATON EN EL CANVAS");
		
		while(true){
			Point pulsacionRaton = c.waitMouseClick();
			//System.out.println("Has pulsado en:  X:" + pulsacionRaton.x + "  Y:" + pulsacionRaton.y);
			text1.setText(String.format("X:%d  Y:%d", pulsacionRaton.x, pulsacionRaton.y));
			
			System.out.println((circulo.getX() - pulsacionRaton.x)+"," +(circulo.getY() - pulsacionRaton.y));
			circulo.translate( (pulsacionRaton.x - circulo.getX()) - (circulo.getWidth()/2), (pulsacionRaton.y - circulo.getY())-(circulo.getHeight()/2));
			
		}
	}

}
