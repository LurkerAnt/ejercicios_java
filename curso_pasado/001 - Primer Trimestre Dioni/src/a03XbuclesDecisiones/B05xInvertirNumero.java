package a03XbuclesDecisiones;

/**
 * 15. Invierte un n�mero N entero positivo.
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class B05xInvertirNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAux, invertido;
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		numAux = numero;
		for (invertido = 0; numero > 0;) {
			invertido = invertido * 10;
			invertido += numero % 10;
			numero = numero / 10;
		}
		System.out.printf("El numero %d al reves es %d.", numAux, invertido);
		teclado.close();
	}

}
