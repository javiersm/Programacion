package vectores_y_Matrices_Arrays2d;

public class Pantalla {

	private int height = 0;
	private int width = 0;
	private char[][] pixels; //donde guardo todos los puntos.
	private char paintingChar = '@';
	private int x = 0;
	private int y = 0;
	
	public void Pantalla(){
		width = 6;
		height = 6;
		init();
	}
	
	public void Pantalla(int width, int height)
	{
		this.width = width;
		this.height = height;
		init();
	}
	
	
	private void init(){
		pixels = new char[width][height];
		for(int i=0; i<pixels.length;i++)
		{
			for(int j=0; j<pixels[i].length; j++)
					pixels[i][j]=paintingChar;
		}
	}
	
	public void paint()
	{
		System.out.println("\n");
		for(int i=0; i<pixels.length;i++)
		{
			for(int j=0; j<pixels[i].length; j++)
					System.out.print(" " +pixels[i][j]);
			System.out.println();
		}
		
	}
	
	public void drawRectangle(int xx, int yy, int width)
	{
		int x = xx-1;
		int y = yy-1;
		//valido que el punto de comienzo esté en la pantalla
		//System.out.println("x.lenght:" + (pixels.length));
		//System.out.println("y.lenght:" + (pixels.length-1));
		if(x<pixels.length-1){
			System.out.println("x esta dentro del rango del array");
			if(y<pixels.length-1)
				System.out.println("y esta dentro del rango del array");
		}else{
			System.err.println("Error el punto inicial esta fuera de la pantalla");
		}
		
		setPaintingChar('.');
		
		//PINTA LINEAS HORIZONTALES
		if((x+width)<=pixels[x].length) //si lo que queremos pintar NO se sale de la pantalla lo va a pintar
		{
			for(int i=x; i<(x+width); i++)
				pixels[y][i]=paintingChar;
		}else{							//en caso de que se salga por la pantalla vendra aki abajo y calculara hasta donde puede pintar (Extremo derecho)
			System.out.println("Se sale por la derecha");
			for(int i=x; i<pixels[y].length; i++)
				pixels[y][i]=paintingChar;
		}
		//linea horizontal de la base
		if((y+width)<=pixels[y].length && (x+width)<=pixels[x].length) //si lo que queremos pintar NO se sale de la pantalla lo va a pintar
		{
			for(int i=x; i<(x+width); i++)
				pixels[y+width][i]=paintingChar;
		}
		else if ((y+width)<=pixels[y].length && (x+width)>=pixels[x].length){							//en caso de que se salga por la pantalla vendra aki abajo y calculara hasta donde puede pintar (Extremo derecho)
			System.out.println("Se sale por la Abajo o por la derecha");
			for(int i=x; i<pixels[y].length; i++)
				pixels[y+width][i]=paintingChar;
		}
		
		
		//PINTA LINEAS VERTICALES
		if((y+width)<=pixels.length)
		{
			for(int i=y; i<(y+width); i++)
				pixels[i][x]=paintingChar;
		}else{
			System.out.println("Se sale por abajo");
			for(int i=y; i<pixels.length; i++)
				pixels[i][x]=paintingChar;
		}
		//linea vertical del lado derecho
		if((y+width)<=pixels.length && (y+width)<=pixels.length)
		{
			for(int i=y; i<(y+width); i++)
				pixels[i][x]=paintingChar;
		}else{
			System.out.println("Se sale por abajo");
			for(int i=y; i<pixels.length; i++)
				pixels[i][x]=paintingChar;
		}

		
		
	}
	
	
	public char getPaintingChar() {
		return paintingChar;
	}

	public void setPaintingChar(char paintingChar) {
		this.paintingChar = paintingChar;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	
	
	public static void main(String[] args) {
		
		Pantalla pantalla = new Pantalla(); 
		pantalla.Pantalla(6, 6);
		pantalla.paint();
		
		System.out.println("Voy a imprimir un cuadrado");
		pantalla.drawRectangle(3, 1, 5);
		pantalla.paint();
		
	}



}
