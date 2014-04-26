package Examen;



import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Color color;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el tamaño del lienzo: ");
		int tamañoLienzo = teclado.nextInt();
		System.out.println("Introduce el numero de figuras a crear dentro del lienzo: ");
		int numeroFiguras = teclado.nextInt();
		
		
		Canvas lienzo;
		lienzo = Canvas.getInstance();
		
		
		switch(numeroFiguras){		
		case 1: 
			Ellipse elipse = new Ellipse(50,50,60,60);
			elipse.fill();
			color = new Color((int) (Math.random()*256),
					  (int) (Math.random()*256),
					  (int) (Math.random()*256));
			elipse.setColor(color);
			break;
		
		case 2:
			Ellipse elipse3 = new Ellipse((int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo));
			elipse3.fill();
			color = new Color((int) (Math.random()*256),
					  (int) (Math.random()*256),
					  (int) (Math.random()*256));
			elipse3.setColor(color);
			Ellipse elipse2 = new Ellipse((int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo));
			elipse2.fill();
			color = new Color((int) (Math.random()*256),
					  (int) (Math.random()*256),
					  (int) (Math.random()*256));
			elipse2.setColor(color);
			break;
			
		
		case 3:
			Ellipse elipse4 = new Ellipse((int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo));
			elipse4.fill();
			color = new Color((int) (Math.random()*256),
					  (int) (Math.random()*256),
					  (int) (Math.random()*256));
			elipse4.setColor(color);
			Ellipse elipse6 = new Ellipse((int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo));
			elipse6.fill();
			color = new Color((int) (Math.random()*256),
					  (int) (Math.random()*256),
					  (int) (Math.random()*256));
			elipse6.setColor(color);
			Rectangle rectangulo = new Rectangle(10,10,300,400);
			//rectangulo.setColor(new graphics.Color(15, 50, 70));
			rectangulo.fill();
			rectangulo.draw();
			break;
		
			
		default:
			for(int i=0; i< (int)(Math.random()*500);i++)
			{
				Ellipse elipse1 = new Ellipse((int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo));
				elipse1.fill();
				color = new Color((int) (Math.random()*256),
						  (int) (Math.random()*256),
						  (int) (Math.random()*256));
				elipse1.setColor(color);
				
				Line linea = new Line((int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo),(int)(Math.random()*tamañoLienzo));
				linea.draw();
				color = new Color((int) (Math.random()*256),
						  (int) (Math.random()*256),
						  (int) (Math.random()*256));
				linea.setColor(color);
				
				
			}
			break;
		}
		
	}

}
