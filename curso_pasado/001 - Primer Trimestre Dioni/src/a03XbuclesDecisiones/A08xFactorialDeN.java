package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * 8. Calcula el factorial de un número N.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class A08xFactorialDeN {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numN, factorial, contador;
		System.out.println("Dame un número: ");
		numN = teclado.nextInt();
		for (contador = 1, factorial = 1; contador <= numN; contador++) {
			factorial *= contador;
		}
		System.out.printf("El factorial de %d es %d", numN, factorial);
		teclado.close();
	}
}