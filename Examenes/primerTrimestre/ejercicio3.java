

import graphics.Color;
import graphics.Rectangle;

import java.util.Scanner;


public class ejercicio3 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		int numIntroducido = 0;
		int ladoCuadrado = 0;
		int red = 0;
		int green = 0;
		int blue = 0;
		Color color;
		
		
		do{
			System.out.println("Dame el lado del cuadrado ([100,200]):");
			ladoCuadrado = teclado.nextInt();
		}while((ladoCuadrado < 100) || (ladoCuadrado >200));
		
		
		do{
			System.out.println("Dame los valores del color rojo([0,255]):");
			red = teclado.nextInt();
			System.out.println("Dame los valores del color verde([0,255]):");
			green = teclado.nextInt();
			System.out.println("Dame los valores del color azul([0,255]):");
			blue = teclado.nextInt();
		}while( ((red < 0) || (red > 255)) || ((green < 0) || (green > 255)) || ((blue < 0) || (blue > 255)));
		
		
  
		color = new Color(red,green,blue);
		Rectangle figuracuadrado = new Rectangle(10, 10, ladoCuadrado, ladoCuadrado);
	    figuracuadrado.setColor(color);
	    figuracuadrado.fill();	

	}

}
