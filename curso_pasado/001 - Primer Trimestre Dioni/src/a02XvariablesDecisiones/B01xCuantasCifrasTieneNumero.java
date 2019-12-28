package a02XvariablesDecisiones;

/**
 *  11. Pedir un n�mero entre 0 y 9.999 y decir cuantas cifras tiene.
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class B01xCuantasCifrasTieneNumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int number;
		System.out.println("Dame un n�mero: ");
		number = teclado.nextInt();
		if (number < 0 || number > 9999) {
			System.out.println("Dame otro n�mero, entre 0 y 9999: ");
			number = teclado.nextInt();
		}
		if (number >= 0 && number <= 9) {
			System.out.println("El n�mero tiene una cifra.");
		} else if (number >= 10 && number <= 99) {
			System.out.println("El n�mero tiene dos cifras.");
		} else if (number >= 100 && number <= 999) {
			System.out.println("El n�mero tiene tres cifras.");
		} else if (number >= 1000 && number <= 9999) {
			System.out.println("El n�mero tiene cuatro cifras.");
		}
		teclado.close();
	}
}
