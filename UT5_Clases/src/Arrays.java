

public class Arrays {

	
	
	
	
	public static void main(String[] args) {
		
		
		

		//Arrays Bi-Dimensionales
		
		int[][] enteros4;
		
		int[][] enteros5 = {{1,2},{3,4}};
		
		enteros5[0][1]=7;
		
		System.out.println(enteros5[0][1]);
		System.out.println(enteros5[1][0]);
		
		
		enteros4 = new int[3][3];
		
		enteros4[1][1] = 1;
		enteros4[2][2] = 2;
		enteros4[1][2] = 3;
		
		
		System.out.println(enteros4[1].length);

		
		
		
		
	}

}
