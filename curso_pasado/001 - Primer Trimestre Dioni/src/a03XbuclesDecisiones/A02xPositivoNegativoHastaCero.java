package a03XbuclesDecisiones;

/**
 * 2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
 * @author LurkerAnt
 *
 */

import java.util.Scanner;

public class A02xPositivoNegativoHastaCero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		while (numero != 0) {
			if (numero > 0) {
				System.out.println("El número es positivo.");
			} else if (numero < 0) {
				System.out.println("El número es negativo.");
			}
			System.out.println("Dame otro número: ");
			numero = teclado.nextInt();
		}
		System.out.println("El número es 0. Se acabó.");
		teclado.close();
	}

}
