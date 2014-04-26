package ejemplos.graficos;

import simple_Graphics_Library.graphics.Color;
import simple_Graphics_Library.graphics.Ellipse;
import simple_Graphics_Library.graphics.Line;
import simple_Graphics_Library.graphics.Rectangle;

public class Coche {
	
	
	public void coche(){
		
		// cocheeeee
		Rectangle carroceria = new Rectangle(350,500,200,40);
		carroceria.setColor(Color.RED);
		carroceria.draw();
		carroceria.fill();
		
		
		Ellipse rueda1 = new Ellipse(395, 510, 40, 40);
		rueda1.setColor(Color.BLACK);
		rueda1.draw();
		rueda1.fill();
		
		Ellipse rueda2 = new Ellipse(475, 510, 40, 40);
		rueda2.setColor(Color.BLACK);
		rueda2.draw();
		rueda2.fill();
		
		Line segment = new Line(390, 500, 450, 450);
		segment.setColor(Color.RED);
		segment.draw();
		Line segment2 = new Line(391, 501, 451, 451);
		segment2.setColor(Color.RED);
		segment2.draw();
		
	}
	
	public void coche(Color color){
		
		// cocheeeee
		Rectangle carroceria = new Rectangle(350,500,200,40);
		carroceria.setColor(color);
		carroceria.draw();
		carroceria.fill();
		
		
		Ellipse rueda1 = new Ellipse(395, 510, 40, 40);
		rueda1.setColor(Color.BLACK);
		rueda1.draw();
		rueda1.fill();
		
		Ellipse rueda2 = new Ellipse(475, 510, 40, 40);
		rueda2.setColor(Color.BLACK);
		rueda2.draw();
		rueda2.fill();
		
		Line segment = new Line(390, 500, 450, 450);
		segment.setColor(color);
		segment.draw();
		Line segment2 = new Line(391, 501, 451, 451);
		segment2.setColor(color);
		segment2.draw();
		
	}
	
	public void coche(int x, Color color){
		
		// cocheeeee
		Rectangle carroceria = new Rectangle((350+x),500,200,40);
		carroceria.setColor(color);
		carroceria.draw();
		carroceria.fill();
		
		
		Ellipse rueda1 = new Ellipse((395+x), 510, 40, 40);
		rueda1.setColor(Color.BLACK);
		rueda1.draw();
		rueda1.fill();
		
		Ellipse rueda2 = new Ellipse((475+x), 510, 40, 40);
		rueda2.setColor(Color.BLACK);
		rueda2.draw();
		rueda2.fill();
		
		Line segment = new Line((390+x), 500, (450+x), 450);
		segment.setColor(color);
		segment.draw();
		Line segment2 = new Line((391+x), 501, (451+x), 451);
		segment2.setColor(color);
		segment2.draw();
		
	}
	

}
