package a03XbuclesDecisiones;

/**
 * 6. Suma de los primeros números enteros positivos. Hasta N.
 * @author LurkerAnt
 *
 */

import java.util.Scanner;

public class A06xSumaEnterosPositivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numN, numero, suma;
		numero = 0;
		System.out.println("Dame un número: ");
		numN = teclado.nextInt();
		suma = 0;
		while (numero <= numN) {
			numero++;
			suma += numero;
		}
		System.out.printf("La suma hasta el numero %d es: %d.", numN, suma);
		teclado.close();
	}

}
