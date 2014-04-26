

public class Cine {
	
	private String nombre;
	private Pelicula[] arrayPelis;
	private int pelisGuardadas = 0;
	private int numPelisMax=0;
	
	public Cine(String nombre, int numPeliculas)
	{
		this.nombre = nombre;
		arrayPelis = new Pelicula[numPeliculas];
		numPelisMax = numPeliculas;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public Pelicula[] getPeliculas() {
		return arrayPelis;
	}



	public void setPelicula(Pelicula peli) {
		if(pelisGuardadas < numPelisMax)
		{
			for(int i=0; i<arrayPelis.length;i++)
			{
				if(arrayPelis[i] == null)
				{
					System.out.println("Guardando peli en: "+ (i+1));
					arrayPelis[pelisGuardadas] = peli;
					pelisGuardadas++;
					break;
				}
			}
			
			//System.out.println(pelisGuardadas);
		}else{
			System.out.println("Taquilla completa. No caben mas peliculas");
		}
		//this.arrayPelis = peli;
	}
	
	
	public void delPelicula(String nombre)
	{
		for(int i=0; i<arrayPelis.length-1;i++)
		{
			if(arrayPelis[i] != null)
			{
				if(arrayPelis[i].getNombre().equals(nombre))
				{
					System.out.println("Borrando pelicula " + arrayPelis[i] + "-" + nombre);
					arrayPelis[i]=null;
					pelisGuardadas--;
					
				}
			}		
		}
	}

	



	public static void main(String[] args) {

		Cine cine = new Cine("Cinesa", 4);
		cine.setPelicula(new Pelicula("peli1"));
		cine.setPelicula(new Pelicula("peli2"));
		cine.setPelicula(new Pelicula("peli3"));
		cine.setPelicula(new Pelicula("peli4"));
		cine.setPelicula(new Pelicula("peli5"));
		
		System.out.println(cine.getNombre());
		Pelicula[] enCartelera = cine.getPeliculas();
		System.out.println("******* en cartelera *************");
		for(int i=0;i<enCartelera.length;i++)
		{
			if(enCartelera[i] != null)
			System.out.println(enCartelera[i].getNombre());
		}
		
		System.out.println("\n");
		
		cine.delPelicula("peli1");
		
		System.out.println(cine.getNombre());
		enCartelera = cine.getPeliculas();
		System.out.println("******* en cartelera *************");
		for(int i=0;i<enCartelera.length;i++)
		{
			if(enCartelera[i] != null)
				System.out.println(enCartelera[i].getNombre());
		}
		
		
	}

}
