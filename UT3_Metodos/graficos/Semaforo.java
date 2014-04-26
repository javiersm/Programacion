package ejemplos.graficos;

import java.lang.ProcessBuilder.Redirect;

import simple_Graphics_Library.graphics.Canvas;
import simple_Graphics_Library.graphics.Color;
import simple_Graphics_Library.graphics.Ellipse;
import simple_Graphics_Library.graphics.Line;
import simple_Graphics_Library.graphics.Rectangle;

public class Semaforo {

	//public static void main(String[] args) throws InterruptedException {
	private int ancho, alto, centro_x, centro_y, diametro_disco;
			
	public Semaforo(){ 
	
			Rectangle caja, palo;
			Ellipse verde, ambar, rojo;
			//int ancho, alto, centro_x, centro_y, diametro_disco;
			
			
			ancho = 100;
			alto = 300;
			centro_x = 300;
			centro_y = 300;
			diametro_disco = ancho / 2;

			
			caja = new Rectangle((centro_x - ancho/2), (centro_y - alto/2), ancho, alto);
			caja.setColor(Color.BLACK);	
			caja.draw();
			caja.fill();
			
			palo = new Rectangle(centro_x-ancho/10, centro_y, (ancho/10)+(ancho/10), alto);
			palo.setColor(Color.BLACK);
			palo.fill();
			
			//Thread.sleep(1500);
			rojo = new Ellipse(centro_x-diametro_disco/2, centro_y-2*diametro_disco, diametro_disco, diametro_disco);
			rojo.setColor(Color.RED);
			rojo.fill();
			
			//Thread.sleep(1500);
			ambar = new Ellipse(centro_x-diametro_disco/2, centro_y-0.5*diametro_disco, diametro_disco, diametro_disco);
			ambar.setColor(Color.ORANGE);
			ambar.fill();    
			
			//Thread.sleep(1500);
			verde = new Ellipse(centro_x-diametro_disco/2, centro_y+1*diametro_disco, diametro_disco, diametro_disco);
			verde.setColor(Color.GREEN);
			verde.fill();    
			
	}
		
	public Semaforo(int x, int y, int ancho, int alto){ 
		
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		
		ancho = 100;
		alto = 300;
		centro_x = 300;
		centro_y = 300;
		diametro_disco = ancho / 2;
		
		
		this.alto = alto;
		this.ancho = ancho;
		centro_x = x;
		centro_y = y;
		diametro_disco = ancho / 2;

		
		caja = new Rectangle((centro_x - ancho/2), (centro_y - alto/2), ancho, alto);
		caja.setColor(Color.BLACK);	
		caja.draw();
		caja.fill();
		
		palo = new Rectangle(centro_x-ancho/10, centro_y, (ancho/10)+(ancho/10), alto);
		palo.setColor(Color.BLACK);
		palo.fill();
		
		//Thread.sleep(1500);
		rojo = new Ellipse(centro_x-diametro_disco/2, centro_y-2*diametro_disco, diametro_disco, diametro_disco);
		rojo.setColor(Color.RED);
		rojo.fill();
		
		//Thread.sleep(1500);
		ambar = new Ellipse(centro_x-diametro_disco/2, centro_y-0.5*diametro_disco, diametro_disco, diametro_disco);
		ambar.setColor(Color.ORANGE);
		ambar.fill();    
		
		//Thread.sleep(1500);
		verde = new Ellipse(centro_x-diametro_disco/2, centro_y+1*diametro_disco, diametro_disco, diametro_disco);
		verde.setColor(Color.GREEN);
		verde.fill();    
		
}
		
		
		
	//}

}
