package a02XvariablesDecisiones;

/**
 * 14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien... 
 * @author Dionisio Fernández Ortiz.
 *
 */

import java.util.Scanner;

public class B04xNotas {

	public static void main(String[] args) {
		int nota;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una nota: ");
		nota = teclado.nextInt();
		if (nota < 5) {
			System.out.println("Insuficiente.");
		} else if (nota == 5) {
			System.out.println("Suficiente.");
		} else if (nota == 6) {
			System.out.println("Bien.");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable.");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente.");
		}
		teclado.close();

	}

}
