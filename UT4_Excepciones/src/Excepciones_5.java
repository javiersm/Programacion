


//import java.io.IOException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escribe un programa que pida los datos de dos alumnos. 
 * De dichos alumnos nos interesa nombre, edad y altura. 
 * Visualiza los datos de dichos alumnos diciendo cual es el mayor (o si tienen la misma edad). 
 * Si se produjese un error IOException, se mostrará un mensaje y se terminará el programa. Puedes usar System.exit(-1); 
 * Si el usuario introduce un valor erróneo (InputMismatchException) volverá a pedir el dato correspondiente.
 */


public class Excepciones_5 {

      public static void main(String[] args) {                
              
              Scanner teclado = new Scanner(System.in);
              String nomAlumno1;
              String nomAlumno2;
              int edadAlumno1 = 0;
              int edadAlumno2 = 0;
              float altAlumno1 = 0f;
              float altAlumno2 = 0f;                
              boolean hayDatosErroneos;
              
              hayDatosErroneos = true;
              
              System.out.print("Introduzca Nombre de Alumno nº1: ");                                
              nomAlumno1 = teclado.next();
              
              do {                        
                      
                      try {                                
                              
                              System.out.print("Introduzca Edad de Alumno nº1: ");                                
                              edadAlumno1 = teclado.nextInt();
                              hayDatosErroneos = false;
                      }
                      
//                      catch ( IOException e ){
                              
//                      }
                      
                      catch ( InputMismatchException entradaInvalida ) {
                              
                              System.out.println("Error al escribir la edad. Inténtelo de nuevo.");
                              teclado.nextLine();
                      }
              
              } while ( hayDatosErroneos );
              
              hayDatosErroneos = true;
              
              do {                        
                      
                      try {                                
                              
                              System.out.print("Introduzca Altura de Alumno nº1: ");                                
                              altAlumno1 = teclado.nextFloat();
                              hayDatosErroneos = false;
                      }                        
                      
                      catch ( InputMismatchException entradaInvalida ) {
                              
                              System.out.println("Error al escribir la altura. Inténtelo de nuevo.");
                              teclado.nextLine();
                      }
              
              } while ( hayDatosErroneos );
              
              System.out.print("Introduzca Nombre de Alumno nº2: ");                                
              nomAlumno2 = teclado.next();
              
              hayDatosErroneos = true;
              
              do {                        
                      
                      try {                                
                              
                              System.out.print("Introduzca Edad de Alumno nº2: ");                                
                              edadAlumno2 = teclado.nextInt();
                              hayDatosErroneos = false;
                      }                        
                      
                      catch ( InputMismatchException entradaInvalida ) {
                              
                              System.out.println("Error al escribir la edad. Inténtelo de nuevo.");
                              teclado.nextLine();
                      }
              
              } while ( hayDatosErroneos );
              
              hayDatosErroneos = true;
              
              do {                        
                      
                      try {                                
                              
                              System.out.print("Introduzca Altura de Alumno nº2: ");                                
                              altAlumno2 = teclado.nextFloat();
                              hayDatosErroneos = false;
                      }                        
                      
                      catch ( InputMismatchException entradaInvalida ) {
                              
                              System.out.println("Error al escribir la altura. Inténtelo de nuevo.");
                              teclado.nextLine();
                      }
              
              } while ( hayDatosErroneos );
              
              teclado.close();
              
              int mayor = Math.max(edadAlumno1, edadAlumno2);
              
              System.out.printf("\n%10s%10s%10s%10s\n", "NOMBRE", "EDAD", "ALTURA", "MAYOR");
              System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno1, edadAlumno1, altAlumno1,
                              edadAlumno1 == mayor ? "X" : "");
              System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno2, edadAlumno2, altAlumno2,
                              edadAlumno2 == mayor ? "X" : "");        

      }

}