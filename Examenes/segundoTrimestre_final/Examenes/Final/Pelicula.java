package Examenes.Final;
import java.util.Arrays;


public class Pelicula {
	
	private String nombre;
	//private String genero;
	private String[] generos = new String[6];
	int numGenero=0;
	
	
	public Pelicula(){
		nombre = "SinNombre";
		generos[numGenero] = "SinGenero";
		numGenero++;
	}
	
	public Pelicula(String nombre){
		this.nombre = nombre;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		String str="";
		for(int i=0;i<generos.length;i++)
		{
			if(i==0)
				str += generos[i];
			if(i>0 && generos[i] != null)
				str += "," + generos[i];
		}
			
		return str;
	}

	public void setGenero(String genero) {
		if(numGenero<=generos.length-1)
		{
			this.generos[numGenero] = genero;
			numGenero++;
		}else{
			System.out.println("no admite mas generos");
		}

	}
	
	

	@Override
	public String toString() {
		return  nombre + "(" + getGenero() + ")";
	}

	/*
	public static void main(String[] args) {

		Pelicula peli = new Pelicula("AceVentura");
		peli.setGenero("terror");
		peli.setGenero("comedia");
		peli.setGenero("terror");
		peli.setGenero("intriga");
		peli.setGenero("intriga");
		peli.setGenero("thriller");
		peli.setGenero("thriller");
		
		System.out.println(peli.getGenero());
		
		System.out.println();
		System.out.println(peli);
	}*/
}
