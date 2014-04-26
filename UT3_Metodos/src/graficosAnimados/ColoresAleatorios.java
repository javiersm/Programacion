package graficosAnimados;



import graphics.Color;
import graphics.Ellipse;

public class ColoresAleatorios {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		int centro_x, centro_y;
		int distancia;
		
		Color[] colores = new Color[5];
		colores[0]= Color.BLACK;
		colores[1]= Color.RED;
		colores[2]= Color.GRAY;
		colores[3]= Color.YELLOW;
		colores[4]= new Color(125,255,100);
		
		
		centro_x = 200;
		centro_y = 200;
		distancia = 25;
				
		int colorAleatorioAnterior = 0;
		int colorAleatorio = 0;
		/*for (int i=10; i>0; i--)
		{
			Ellipse circulo;
			circulo = new Ellipse(centro_x-i*distancia, centro_y-i*distancia, distancia*i*2, distancia*i*2);
			do{
				colorAleatorio = (int) (Math.random()*5);
			}while(colorAleatorio == colorAleatorioAnterior);
			colorAleatorioAnterior = colorAleatorio;
			circulo.setColor(colores[colorAleatorio]);
			circulo.fill();
		}*/
		Ellipse[] circulo = new Ellipse[10];
		int[] circuloColores = new int[10];
		for (int i=10; i>0; i--)
		{
			
			circulo[i-1] = new Ellipse(centro_x-i*distancia, centro_y-i*distancia, distancia*i*2, distancia*i*2);
			do{
				colorAleatorio = (int) (Math.random()*5);
			}while(colorAleatorio == colorAleatorioAnterior);
			colorAleatorioAnterior = colorAleatorio;
			
			circulo[i-1].setColor(colores[colorAleatorio]);
			circuloColores[i-1]=colorAleatorio;
			circulo[i-1].fill();
		}
		
		while(true)
		{
			//colorAleatorioAnterior = circuloColores[circulo.length - 1];
			for(int i=0; i<circulo.length; i++)
			{
				//circulo[i].setColor(Color.MAGENTA);
				Thread.sleep(500);
				if (i != circulo.length-1)
				{
					circulo[i].setColor(colores[circuloColores[i+1]]);
					
				}
				else if (i == circulo.length){
					circulo[i].setColor(colores[circuloColores[0]]);
				}
				
			}
		
		}
		
		
		
		/*
		Ellipse circulo = new Ellipse(100,100,200,200);
		int aleatorio;
		while(true)
		{
			aleatorio = (int) (Math.random() * 5);
			System.out.println(aleatorio);
			circulo.setColor(colores[aleatorio]);
			circulo.fill();
			Thread.sleep(300);
		}*/
			

			
		

	}

}
