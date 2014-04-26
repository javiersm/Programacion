


/*
 *  CREACION DE UNA EXCEPCION DE TIPO NUMERO NEGATIVO
 */

public class NumeroNegativo extends Exception {

	
	/*
	 *  se podria poner un metodo tipo getMessage();
	 */

	public String getMessage(){
		
		String str = "Este metodo sobreescribe otro metodo";
		return str;
	}
}
