package a03XbuclesDecisiones;

/**
 * 14. Calcula el n�mero de d�gitos que tiene un n�mero N entero positivo.
 * @author Dionisio Fern�ndez Ortiz	
 *
 */

import java.util.Scanner;

public class B04xNumeroDeDigitos {

	public static void main(String[] args) {
		int numero, numAux, contador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		numAux = numero;
		for (contador = 0; numero > 0; contador++) {
			numero = numero / 10;
		}
		System.out.printf("El numero %d tiene %d cifras.", numAux, contador);
		teclado.close();
	}

}
