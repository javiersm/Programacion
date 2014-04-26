

import java.util.Scanner;

public class Capicua {

	/*
	Lee un número por consola y comprueba si es palíndromo (capicúa).
	Pista: si creas un número con los dígitos en orden inverso al leido, y al compararlos resulta que son iguales, será capicúa.
	*/
	
	
	
	public static void main(String[] args) {
		
        Scanner teclado;
        teclado = new Scanner(System.in);
        //numero: del que calcularemos si es o no palíndromo
        int numero = 0;
        
        System.out.println("Introduce el número del que quieres saber si es un palíndromo: ");
        numero = teclado.nextInt();
        //numeroinverso: guarda el numero dado la vuelta
        //resto de las divisiones
        //falta, los digitos que faltan por dar la vuelta
        int numeroinverso, resto, falta;
        
        falta=numero;
        numeroinverso=0;
        resto=0;        
        
        //cogemos el ultimo digito del numero
        resto = falta%10;
        
        //del numero original quitamos el ultimo digito
        falta = falta/10;
        
        //para guardar el numero substraído, lo sumaremos al número que tengamos, multiplicado por 10.
        // En el primer caso lo haremos sobre el 0.
        numeroinverso=numeroinverso*10+resto;
        
        //Lo repetimos hasta que haya algo por analizar
        while(falta!=0){
                resto=falta%10;
                numeroinverso=numeroinverso*10+resto;
                falta=falta/10;
                }
        
        //Ahora miramos si es capicua
        if(numeroinverso==numero){
                System.out.println("El numero ES palíndromo (capicua)");
        }else{
                System.out.println("El numero NO es palíndromo(capicua)");
        }
         teclado.close();

	}

}
