package Ej3_Dados;

public class ParDeDados {

	Dado dado1;
	Dado dado2;
	
	public ParDeDados(){
		dado1 = new Dado();
		dado2 = new Dado();
	}
	
	
	public int tirar(){
		return (dado1.tirar() + dado2.tirar());
	}
	
	public int getDado1(){
		return dado1.getValor();
	}
	
	public int getDado2(){
		return dado2.getValor();
	}
	
	
	
	
	@Override
	public String toString() {
		return "ParDeDados [Dado1= " + dado1 + ", Dado2= " + dado2 + ", Total="+(dado1.getValor()+dado2.getValor()) + "]";
	}


	public static void main(String[] args) {
		
		int tiradas = 0;
		boolean hasAcertado = false;
		do
		{
			ParDeDados parDados = new ParDeDados();
			parDados.tirar();
			System.out.println("Tirada de dados, ha salido "+parDados.getDado1()+" y "+ parDados.getDado2());
			tiradas++;
			if(parDados.getDado1()==1 && parDados.getDado2()==1)
				hasAcertado=true;
			
		}while(!hasAcertado);
		
		System.out.println("Has tirado "+ tiradas + " veces hasta conseguir dos unos");
				
	}

}
