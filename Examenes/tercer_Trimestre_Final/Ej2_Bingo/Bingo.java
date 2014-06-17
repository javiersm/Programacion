package Ej2_Bingo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Bingo {

	Collection<Integer> bolas = new HashSet<Integer>(90); 
	
	public Bingo(){
		for(int i=1;i<=90;i++)
			bolas.add(new Integer(i));
	}
	
	
	public int saca(){
		int numero = 0;
		boolean sacado = false;
		if(quedanBolas())
		{
			do{
				numero = (int)(1+Math.random()*90);
				if(bolas.contains(numero)){
					sacado = true;
					bolas.remove(numero);
					System.out.println("Has sacado el numero " + numero);
				}
			}while(!sacado);
			return numero;
		}else{
			System.out.println("YA NO QUEDAN MAS BOLAS !!!!");
			return 0;
		}
		
	}
	
	public boolean quedanBolas(){
		if(bolas.size()>0)
			return true;
		else
			return false;
	}
	
	
	public boolean haSalido(int numero){
		if(bolas.contains(numero))
			return false;
		else
			return true;
	}
	
	/*
	public void imprimeNumeroRestantes(){
		Iterator it = bolas.iterator();
		int cont = 0;
		while(it.hasNext()){
			System.out.printf("%4d",it.next());
			cont++;
			if(cont%10 == 0)
				System.out.println();
		}
	}*/
	
	
	
	public static void main(String[] args) {

		Bingo bingo1 = new Bingo();
		
		for(int i=0; i<20; i++)
			bingo1.saca();
		
		System.out.println(bingo1.quedanBolas());
		System.out.println("ha salido el 4 " + bingo1.haSalido(4));
		
		//bingo1.imprimeNumeroRestantes();
	}
	

}
