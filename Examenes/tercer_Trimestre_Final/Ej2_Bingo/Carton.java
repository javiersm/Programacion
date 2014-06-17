package Ej2_Bingo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Carton {

	int[][] carton = new int[3][9];
	ArrayList<Integer> numeroMarcado = new ArrayList<Integer>();
	
	
	private static int numeroEntre(int min, int max){
		int random = 0;
		random = (int) (Math.random() * ((max - min) + 1)) + min;
		return random;
	}
	
	
	public void rellenaAleatorio(){
		
		int num1 = 0; int num2 = 0; int num3 = 0;
		int col = 0;
		int min = 1; int max=9;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while( num2 == num1 ||num2<min || num2>max);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1 || num3<min || num3>max);
		//System.out.println("numeroooo " + num1 +"  "+ num2 + "  "+ num3);
		
		
		
		num1=0;num2=0;num3=0;
		col=1;
		min = 10; max=19;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		
		num1=0;num2=0;num3=0;
		col=2;
		min = 20; max=29;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		
		num1=0;num2=0;num3=0;
		col=3;
		min = 30; max=39;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		
		num1=0;num2=0;num3=0;
		col=4;
		min = 40; max=49;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		
		num1=0;num2=0;num3=0;
		col=5;
		min = 50; max=59;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		
		num1=0;num2=0;num3=0;
		col=6;
		min = 60; max=69;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		num1=0;num2=0;num3=0;
		col=7;
		min = 70; max=79;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		num1=0;num2=0;num3=0;
		col=8;
		min = 80; max=90;
		num1 = numeroEntre(min, max);
		carton[0][col]=num1;
		do{
			num2 = numeroEntre(min, max);
			carton[1][col]=num2;
		}while(num2==num1);
		do{
			num3 = numeroEntre(min, max);
			carton[2][col]=num3;
		}while(num3==num2 || num3==num1);
		
		//guardo los valores en un arraylist para mirar si han salido
		for(int i=0; i<3;i++){
			for(int j=0; j<9;j++){
				numeroMarcado.add(carton[i][j]);
			}
		}
		
	}
	
	
	
	public Carton()
	{
		rellenaAleatorio();
		
	}
	
	public boolean marca(int bola){
		if(numeroMarcado.contains(bola)){
			Iterator it = numeroMarcado.iterator();
			while(it.hasNext()){
				if(it.next().equals(bola))
					it.remove();
			}
			if(numeroMarcado.size()==0)
				return true;
			else
				return false;
		}else
			return false;
	}
	
	public boolean marca(int x, int y){
		int x1 = x-1;
		int y1 = y-1;
		int bola = carton[x1][y1];
		if(numeroMarcado.contains(bola)){
			Iterator it = numeroMarcado.iterator();
			while(it.hasNext()){
				if(it.next().equals(bola))
					it.remove();
			}
			if(numeroMarcado.size()==0)
				return true;
			else
				return false;
		}else
			return false;
		
	}
	
	
	@Override
	public String toString() {
		String str = "";
		for(int i=0; i<3;i++){
			for(int j=0; j<9;j++){
				str = str + String.format("%4d%s",carton[i][j],numeroMarcado.contains(carton[i][j])?" ":"X");
			}
			str = str + String.format("\n");
		}
		//System.out.println(str);
		return str;
	}
	
	public boolean esBingo(){
		if(numeroMarcado.size()==0)
			return true;
		else 
			return false;
	}


	public static void main(String[] args) {
		Carton carton1 = new Carton();
		
		System.out.println("****** carton 1 *******");
		carton1.marca(20);
		carton1.marca(30);
		carton1.marca(40);
		System.out.print(carton1);
		
		
	}

}
