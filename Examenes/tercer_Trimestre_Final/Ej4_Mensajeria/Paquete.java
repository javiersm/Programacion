package Ej4_Mensajeria;



public class Paquete extends Caja implements Postal{

	double peso;
	double costeEnvio = 0;
	boolean entregado = false;
	String direccion = "";
	
	
	
	public Paquete(double alto, double ancho, double fondo, double peso) {
		super(alto, ancho, fondo);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	public void setPortesEnvio(double costeEnvio) {
		this.costeEnvio = costeEnvio;
	}
	/*
	public double getPortesEnvio() {
		if(this.costeEnvio > Postal.costeMinimoEnvio)
		{
			return costeEnvio;
		}else{
			return Postal.costeMinimoEnvio;
		}
	}*/

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getDireccion() {
		return direccion;
	}

	
	@Override
	public double portes() 
	{		
		if(this.costeEnvio > Postal.costeMinimoEnvio)
		{
			return costeEnvio;
		}else{
			return Postal.costeMinimoEnvio;
		}
	}

	@Override
	public boolean entregado() {
		return entregado;
	}

	@Override
	public void enviar(String direccion) {
		this.direccion = direccion;
	}
	
	

	public static void main(String[] args) {
		Paquete paquete1 = new Paquete(15, 20, 15, 5);
		paquete1.enviar("Calle toledo numero 1");
		paquete1.setPortesEnvio(15.50);
		
		System.out.println("Volumen: " + paquete1.getVolumen() + " litros");
		System.out.println("Portes " + paquete1.portes() + " Euros");
		paquete1.setEntregado(true);
		System.out.println("Paquete entregado: " + paquete1.entregado());
		
		
	}


	
}
