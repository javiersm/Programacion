
public class TrueFalse {

	public static void main(String[] args) {  //http://aulavirtual.educa.jccm.es/Aula_Virtual/mod/resource/view.php?id=177715
		/* Realizar las expresiones aritméticas propuestas en clase. Intentar analizar el resultado en Java. Después comprobar ejecutándolas, que es el resultado que realmente Java nos ofrece.
    Completa la siguiente tabla (crea también un programa Java que muestre la tabla realizando cada uno de los cálculos): */

		
		boolean a, b;
		
		//System.out.println("a	     b	    a && b	   a || b	!a	    !b   ");
		//System.out.println("3>5	    12!=8	false    	true	...	    ...  ");
		//System.out.println("5>=6	3!=3	...			");
		
		
		System.out.print("a:(3>5)	b:(12!=8)");
		System.out.print("\t");
		System.out.print("[a&&b]:" + "false");
		System.out.print("\t [a||b]:" + "true");
		System.out.print("\t [!a]:" + "true");
		System.out.print("\t [!b]:" + "false");
		System.out.print("\n---------------------------------------------------------------------------");
		System.out.print("\na:(5>=6)   b:(3!=3)");
		System.out.print("\t");
		System.out.print("[a&&b]:" + "false");
		System.out.print("\t [a||b]:" + "false");
		System.out.print("\t [!a]:" + "true");
		System.out.print("\t [!b]:" + "true");
		
		System.out.print("\n---------------------------------------------------------------------------");
		System.out.print("\na:(-7=8)   b:(22)");
		System.out.print("\t");
		System.out.print("[a&&b]:" + "NO SE PUEDE HACER");
		System.out.print("\t [a||b]:" + "NO SE PUEDE HACER");
		System.out.print("\t [!a]:" + "NO SE PUEDE HACER");
		System.out.print("\t [!b]:" + "NO SE PUEDE HACER");
		
		
		System.out.print("\n---------------------------------------------------------------------------");
		System.out.print("\na:21!=12   b:true");
		System.out.print("\t");
		System.out.print("[a&&b]:" + "true");
		System.out.print("\t [a||b]:" + "true");
		System.out.print("\t [!a]:" + "false");
		System.out.print("\t [!b]:" + "false");
		
		
		System.out.print("\n---------------------------------------------------------------------------");
		System.out.print("\na:4=2   b:7>=-9");
		System.out.print("\t");
		System.out.print("[a&&b]:" + "false");
		System.out.print("\t [a||b]:" + "true");
		System.out.print("\t [!a]:" + "true");
		System.out.print("\t [!b]:" + "false");

		
		
		
	}

}
