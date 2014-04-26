

public class ej2 {
	
	public static double[][] matrizDispersa(int tamaño, double porcentajeRelleno)
	{
		double[][] matriz= new double[tamaño][tamaño];
		
		for(int i=0;i<matriz.length-1;i++)
			for(int j=0;j<matriz[i].length;j++)
			{
				if((Math.random()*100)<=porcentajeRelleno)
				{
					
					matriz[i][j] = 1;
				}else{
					matriz[i][j] = 0;
				}
				
			}		
		
		return matriz;
	}

	public static void main(String[] args) {
		
		
		double[][] matriz = matrizDispersa(10, 50);
		
		
		for(int i=0;i<matriz.length-1;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				System.out.print(" " + matriz[i][j]);
			}	
		System.out.println();
		}
	}

}
