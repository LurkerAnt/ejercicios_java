package estructurasdControl2;

import java.util.Scanner;

public class B1Factorial {

	public static void main(String[] args) {
		int numero, factorial, multiplicador;
		Scanner T = new Scanner(System.in);
		System.out.println("Introducir un número: ");
		numero = T.nextInt();
		factorial = numero;
		multiplicador = 2;
		while (multiplicador < numero) {
			factorial = factorial * multiplicador;
			multiplicador++;
		}

		System.out.printf("El factorial de %d es %d", numero, factorial);
	}

}
