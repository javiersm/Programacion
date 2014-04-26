package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Distintos {

        public static void main(String[] args) {
                
        int[] numeros = new int[10];
        int tam_numeros = 0;
        Scanner teclado = new Scanner(System.in);
  
        
        System.out.println("Dime número (max 10): ");
        
        boolean cero=false;
        int i=0;
        while (i<10 && !cero) {
                //leer
                int numero = teclado.nextInt();
                if (numero==0) {
                        cero=true; // si introducimos "0": exit
                }
                else {
                      //insertar si no está
                        boolean encontrado=false;
                        
                        for(int j=0;j<tam_numeros;j++)
                                if (numero==numeros[j]) encontrado=true;
                        
                        //SINO encontro el numero introducido ENTONCES lo introduce 
                        if (!encontrado) {
                                numeros[tam_numeros]=numero;
                                tam_numeros++;
                        }
                                
                }
                
                i++;
        }
        
        System.out.println("Número de distintos " + tam_numeros);
        System.out.println(Arrays.toString(numeros));
        }
        
        
        
        

}