package Ej4_Mensajeria;

public interface Postal  {
	
	double costeMinimoEnvio = 2.30;
	String direccion = "";
	
	public void enviar(String direccion);
	public boolean entregado();
	public double portes();

}
