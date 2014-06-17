package Ej3_Dados;

public class Dado {

	private int valor;
	
	public Dado(){
		
	}
	
	public int tirar(){
		valor = (int) (1+Math.random()*6);
		return valor;
	}
	
	
	public int getValor(){
		return this.valor;
	}
	
	
	@Override
	public String toString() {
		return "Dado [valor=" + valor + "]";
	}

	
	
	
	public static void main(String[] args) {

		Dado dado1 = new Dado();
		for(int i=0; i<200 ; i++){
			System.out.println(dado1.tirar());
		}
		System.out.println(dado1.toString());
		System.out.println("ultima tirada" + dado1.getValor());
		
	}

}
