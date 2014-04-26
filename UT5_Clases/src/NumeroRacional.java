

import java.util.Scanner;

/* Numeros Racionales
 * 	   clase racional
 * 
 * Constructores
 * 		por defecto 1
 * 		con los valores q le pase opr parametro
 * 
 * Metodos:
 * 		get/set
 * 		racional. sumar(racional a, racional b)
 * 		minumero.sumer(Racional otro)
 * 		restar
 * 		dividir
 * 		multiplicar
 * 		toString() "1/2"
 * 		toFloatString() 
 * 
 * Metodo privado:
 * 		simplificar:
 * 
 * 
 * clase para probarlo: leer dos numeros racionales, mostrar un menu para (sumar/restar/multiplicar/dividir)
 * 
 */


public class NumeroRacional {
	
	private static boolean continuar;
	private int numerador;
	private int denominador;
	
	
	public NumeroRacional()
	{
		numerador = 1;
		denominador = 2;
	}
	
	public NumeroRacional(int numerador, int denominador)
	{		
		this.numerador = numerador;
		if (denominador != 0)
			this.denominador = denominador;
		else
			System.out.println("denominador no puede ser cero");
	}
	
	
	public void suma(NumeroRacional r)
	{
		//comprobar si tienen igual denominador
		if(this.denominador == r.getDenominador())
		{
			System.out.println("denominador iguales");
			this.numerador = this.numerador + r.getNumerador();
			this.denominador = this.denominador + r.getDenominador();
		}else{
			System.out.println("denominador distintos");
			this.numerador = (this.numerador * r.denominador ) + (this.denominador * r.numerador);
			this.denominador = (this.denominador * r.denominador);	
		}
	}
	
	public void resta(NumeroRacional r)
	{

		//comprobar si tienen igual denominador
		if(this.denominador == r.getDenominador())
		{
			System.out.println("denominador iguales");
			this.numerador = this.numerador - r.getNumerador();
			this.denominador = this.denominador - r.getDenominador();
		}else{
			System.out.println("denominador distintos");
			this.numerador = (this.numerador * r.denominador )- (this.denominador * r.numerador);
			this.denominador = (this.denominador * r.denominador);	
		}
		
		
	}
	
	
	public void multiplicacion(NumeroRacional r)
	{
		this.numerador = this.numerador * r.getNumerador();
		this.denominador = this.denominador * r.getDenominador();
	}
	
	public void division(NumeroRacional r)
	{
		this.numerador = this.numerador / r.getNumerador();
		this.denominador = this.denominador / r.getDenominador();
	}
	
	
	public int getNumerador(){return numerador;}
	public void setNumerador(int numero){this.numerador = numero;}
	
	public int getDenominador(){return denominador;}
	public void setDenominador(int numero){this.denominador = numero;}
	
	public String toString()
	{
		
		System.out.println(numerador + "/" + denominador);
		return numerador + "/" + denominador;
	}
	
	public void toFloatString()
	{
		double result = (numerador/(double)denominador); 
		System.out.println(result);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		NumeroRacional racional1;
		NumeroRacional racional2;
		/*
		System.out.println("1.Introduce un numero RACIONAL: [ej. 1/3, 4/8]");
		racional1 = new NumeroRacional(teclado.nextInt(),teclado.nextInt());
		
		System.out.println("2.Introduce otro numero RACIONAL: [ej. 1/3, 4/8]");
		racional2 = new NumeroRacional(teclado.nextInt(),teclado.nextInt());
		*/
		
		racional1 = new NumeroRacional(1,3);
		racional2 = new NumeroRacional(3,9);
		
		
		String opcion = "";
		do{
			
			boolean continuar = false;
			System.out.println("\nracional1: " + racional1.toString() + "   racional2: " + racional2.toString());
			
			System.out.println("Elige una opcion: ");
			System.out.println("a) Sumar el primer racional al segundo racional");
			System.out.println("b) Restar el primer racional al segundo racional");
			System.out.println("c) Multiplicar el primer racional al segundo racional");
			System.out.println("d) Dividir el primer racional al segundo racional");
			System.out.println("Opcion: ");
			opcion =  teclado.next().toLowerCase();
			
			if((opcion == "a") || (opcion == "b") || (opcion == "c") || (opcion == "d"))
					continuar = true;
			else{
				continuar = false;
			}
			
		}while(continuar);
		
		//System.out.println( "opcion" + opcion);
		switch(opcion){
		
		case "a": System.out.println("\n*****  Suma ***********");
				racional1.suma(racional2);				
				System.out.println("RESULTADO: ");
				racional1.toString();
				racional1.toFloatString();
				break;
				
		case "b": System.out.println("\n ****** Resta *********");
				racional1.resta(racional2);				
				System.out.println("RESULTADO: ");
				racional1.toString();
				racional1.toFloatString();
				break;
				
		case "c": System.out.println("\nMultiplicacion");
				break;
				
		case "d": System.out.println("\nDivision");
				break;
		
		}
		
		
		teclado.close();
		System.out.println("FIN");
		

	}

}
