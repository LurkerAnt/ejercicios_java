package a03XbuclesDecisiones;
/**
 * 7. Calcula la suma de los N primeros n�meros pares enteros positivos.
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class A07xSumaEnterosParesHastaN {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numN, suma, contador;
		System.out.println("Dame un n�mero: ");
		numN = teclado.nextInt();
		for (contador = 0, suma = 0; contador <= numN; contador++) {
			if (contador % 0 == 0) {
				suma += contador;
			}
		}
		System.out.printf("La suma de los n�meros enteros pares hasta %d es %d", numN, suma);
		teclado.close();
	}

}
