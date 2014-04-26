package Examen;




import graphics.Color;
import graphics.Ellipse;
import graphics.Line;
import graphics.Rectangle;
import graphics.Text;

import java.util.Scanner;

public class Ej2Arturo {

        public static void main(String[] args) {
                Scanner teclado;
                teclado = new Scanner(System.in);
                
                Rectangle cuadrado, figuracuadrado;
                Ellipse circulo;
                Line linea;
                Text texto;
                
                int tamaño = 0;
                int cantidad = 0;
                
                System.out.println("Dime el tamaño del lienzo:");
                tamaño = teclado.nextInt();
                
                System.out.println("Dime la cantidad de figuras");
                cantidad = teclado.nextInt();
                
                cuadrado = new Rectangle (10, 10, tamaño, tamaño);
                cuadrado.draw();
                
                int i = 0;
                
                do{
                        int elegida = ((int)((Math.random()*4)+1));
                        int tamfigura = ((int)((Math.random()*(tamaño-20))));
                        // tamaño-20, es el valor maximo del tamaño de la figura, por dejar 10 a cada lado
                        // -20 se pone para que el minimo sea 0.
                        int posicion_x = ((int)((Math.random()*(tamaño-tamfigura-15))+15));
                        // las posiciones dependen del tamaño del lienzo y de la figura. El minimo es 15, 5 de margen con el marco y 10 con el lienzo.
                        // maximo es tamaño-tamfigura para que no sea mas grande
                        int posicion_y = ((int)((Math.random()*(tamaño-tamfigura-15))+15));
                        switch (elegida){
                                case 1:
                                        figuracuadrado = new Rectangle(posicion_x, posicion_y, tamfigura, tamfigura);
                                        //figuracuadrado.fill();
                                        figuracuadrado.setColor(new Color (((int)(Math.random()*255)), ((int)(Math.random()*255)), ((int)(Math.random()*255))));
                                        figuracuadrado.draw();
                                        break;
                                        
                                case 2:
                                        circulo = new Ellipse(posicion_x,posicion_y,tamfigura,tamfigura);
                                        //circulo.fill();
                                        circulo.setColor(new Color (((int)(Math.random()*255)), ((int)(Math.random()*255)), ((int)(Math.random()*255))));
                                        circulo.draw();
                                        break;
                                        
                                case 3:
                                        int posicion_x1 = ((int)((Math.random()*(tamaño-10))+15));
                                        int posicion_y1 = ((int)((Math.random()*(tamaño-10))+15));
                                        int posicion_x2 = ((int)((Math.random()*(tamaño-10))+15));
                                        int posicion_y2 = ((int)((Math.random()*(tamaño-10))+15));
                                        linea = new Line(posicion_x1,posicion_y1,posicion_x2,posicion_y2);
                                        linea.setColor(new Color (((int)(Math.random()*255)), ((int)(Math.random()*255)), ((int)(Math.random()*255))));
                                        linea.draw();
                                        break;
                                        
                                case 4:
                                                texto = new Text((((int)((Math.random()*(tamaño-35))+15))),(((int)((Math.random()*(tamaño-20))+15))),"DAW");
                                                texto.setColor(new Color (((int)(Math.random()*255)), ((int)(Math.random()*255)), ((int)(Math.random()*255))));
                                                texto.draw();
                                                                                
                                        break;
                        }                        
                        i++;
                }while(i<cantidad);
                
                teclado.close();
        }

}