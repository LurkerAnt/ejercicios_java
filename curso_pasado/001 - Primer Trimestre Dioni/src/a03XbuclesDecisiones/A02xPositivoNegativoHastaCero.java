package a03XbuclesDecisiones;

/**
 * 2. Leer un n�mero e indicar si es positivo o negativo. El proceso se repetir� hasta que se introduzca un 0.
 * @author LurkerAnt
 *
 */

import java.util.Scanner;

public class A02xPositivoNegativoHastaCero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		while (numero != 0) {
			if (numero > 0) {
				System.out.println("El n�mero es positivo.");
			} else if (numero < 0) {
				System.out.println("El n�mero es negativo.");
			}
			System.out.println("Dame otro n�mero: ");
			numero = teclado.nextInt();
		}
		System.out.println("El n�mero es 0. Se acab�.");
		teclado.close();
	}

}
