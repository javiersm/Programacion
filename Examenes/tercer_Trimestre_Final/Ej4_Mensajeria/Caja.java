package Ej4_Mensajeria;

public class Caja {

	double alto;
	double ancho; 
	double fondo;

	
	
	public Caja(double alto, double ancho, double fondo) {
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
	}


	public double getVolumen(){
		return ((alto*ancho*fondo)/1000);
	}

	@Override
	public String toString() {
		return "Caja [alto=" + alto + ", ancho=" + ancho + ", fondo=" + fondo
				+ "]";
	}


	public double getAlto() {
		return alto;
	}



	public void setAlto(double alto) {
		this.alto = alto;
	}



	public double getAncho() {
		return ancho;
	}



	public void setAncho(double ancho) {
		this.ancho = ancho;
	}



	public double getFondo() {
		return fondo;
	}



	public void setFondo(double fondo) {
		this.fondo = fondo;
	}



	public static void main(String[] args) {

	}

}
