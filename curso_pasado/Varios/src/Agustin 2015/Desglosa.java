package secuenciales;

public class Desglosa {

	public static void main(String[] args) {
		int numero= 88142;
		
		int uMil;
		int centenas;
		int decenas;
		int unidades;
		
		int auxiliar= numero;
		
		// para 8142
		uMil= numero / 1000;	// 88 valor de uMil
		numero = numero % 1000;	// 142 valor de numero
		centenas= numero / 100;	// 1
		numero= numero % 100;	// 42
		decenas= numero / 10;	// 4
		numero= numero % 10;	// 2
		unidades= numero / 1;	// 2
		numero = numero % 1;
		/**
		 * otra
		 */
		numero= 88142;
		auxiliar= numero;
		unidades= numero % 10;
		numero = numero / 10;
		decenas= numero % 10;
		numero = numero / 10;
		centenas= numero % 10;
		numero = numero / 10;
		uMil= numero;
		
		unidades= numero % 10;
		decenas= (numero / 10) % 10;
		//centenas= 
		
		System.out.println("el número " + auxiliar);
		System.out.println("unidades mil: " + uMil);
		System.out.println("centenas: " + centenas);
	}

}
