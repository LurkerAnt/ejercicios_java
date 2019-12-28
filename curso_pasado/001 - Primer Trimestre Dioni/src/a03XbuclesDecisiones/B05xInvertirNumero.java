package a03XbuclesDecisiones;

/**
 * 15. Invierte un número N entero positivo.
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B05xInvertirNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAux, invertido;
		System.out.println("Dame un número: ");
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
