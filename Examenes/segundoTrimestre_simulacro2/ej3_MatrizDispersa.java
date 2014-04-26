

import java.util.Scanner;

public class ej3_MatrizDispersa {

	private double[] datosMatriz;
	private int[] fila;
	private int[] columna;
	private static int numGuardado=-1;
	private static int tamañoMatriz;


	public ej3_MatrizDispersa(int tamañoMatriz)
	{
		datosMatriz=new double[tamañoMatriz];
		fila= new int[tamañoMatriz];
		columna = new int[tamañoMatriz];
		this.tamañoMatriz = tamañoMatriz;
		
	}
	
	public void guardarElemento(int fila, int columna, double dato)
	{
		numGuardado++;
		this.fila[numGuardado] = fila;
		this.columna[numGuardado] = columna;
		this.datosMatriz[numGuardado] = dato;
		System.err.println("GUADADO CORRECTO EN POSICION: "+numGuardado);
	}
	

	public void getElementos(){
		System.out.println("Num Elementos Guardados: "+ numGuardado+3 );
		for(int i=0; i<=numGuardado;i++)
		{
			System.out.println("Elemento["+(i+1)+"]: "+fila[i]+", "+columna[i]+", "+ datosMatriz[i]);
		}
	}
	
	
	public String toString(){
		
		double[][] mz = new double[tamañoMatriz][tamañoMatriz];
		for(int i=0; i<mz.length-1;i++)
			for(int j=0;j<mz[i].length;j++)
				mz[i][j]=0;
		
		//relleno el array
		for(int i=0; i<=numGuardado;i++)
			mz[fila[i]][columna[i]]=datosMatriz[i];
		
		//imprimo la matriz
		for(int i=0; i<mz.length-1;i++)
		{	
			for(int j=0;j<mz[i].length;j++)
				System.out.print(" "+mz[i][j]);
			System.out.println();
		}
		return "hola";
	}
	
	public static void main(String[] args) {

		ej3_MatrizDispersa matriz = new ej3_MatrizDispersa(10);
		
		do
		{
			Scanner teclado = new Scanner(System.in);
			System.out.println("**************************************");
			System.out.println("1. Introduce un elemento en el array");
			System.out.println("2. muestra la matriz");
			System.out.println("3. elementos guardados");
			System.out.println("***************************************");
			int opcion= teclado.nextInt();
			
			
			switch(opcion)
			{
				case 1: System.out.println("Introduce una fila, columna, dato");
						matriz.guardarElemento(teclado.nextInt(), teclado.nextInt(), teclado.nextDouble());
						break;
				
				case 2: System.out.println("***** Matriz **********");
						matriz.toString();
						break;
				case 3:	matriz.getElementos();
						break;
				default:
						break;
				
			}
			
			
			
		}while(true);

	}

}
