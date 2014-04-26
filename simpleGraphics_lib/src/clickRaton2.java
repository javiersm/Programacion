

import graphics2.Canvas;
import graphics2.Color;
import graphics2.Ellipse;
import graphics2.Rectangle;
import graphics2.Text;

import java.awt.Point;

public class clickRaton2 {

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
		c= Canvas.getInstance();
		//c.waitMouseClick();

		Text text1 = new Text(5, 5, "X:   Y:  ");
		text1.grow(4, 4);
		text1.draw();
		System.out.println("PINCHA CON EL RATON EN EL CANVAS");
		
		while(true){
			Point pulsacionRaton = c.waitMouseClick();
			circulo.undraw();
			//HACE LO MISMO QUE LA CLASE clickRaton PERO BORRANDO EL OBJETO Y CREANDOLO DE NUEVO
			//borro el circulo y creo uno nuevo
			circulo = new Ellipse((pulsacionRaton.x - 20), (pulsacionRaton.y -20), 40, 40);
			circulo.setColor(Color.DARK_GRAY);
			circulo.setThickness(15);
			circulo.draw();
			
			text1.setText(String.format("X:%d  Y:%d", pulsacionRaton.x, pulsacionRaton.y));
			System.out.println((circulo.getX() - pulsacionRaton.x)+"," +(circulo.getY() - pulsacionRaton.y));
			
			
			circulo.translate( (pulsacionRaton.x - circulo.getX()) - (circulo.getWidth()/2), (pulsacionRaton.y - circulo.getY())-(circulo.getHeight()/2));
			
			/*
			circulo.undraw();
			circulo = new Ellipse(pulsacionRaton.x, pulsacionRaton.y, 200,200);
			circulo.draw();
			*/
		}

	}

}
