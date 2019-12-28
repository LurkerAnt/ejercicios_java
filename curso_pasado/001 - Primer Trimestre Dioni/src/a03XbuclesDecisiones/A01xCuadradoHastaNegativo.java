package a03XbuclesDecisiones;

/**
 * 1. Leer un n�mero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un n�mero negativo.
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class A01xCuadradoHastaNegativo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		while (numero > 0) {
			System.out.println((int) Math.pow(numero, 2));
			System.out.println("Dame otro n�mero: ");
			numero = teclado.nextInt();
		}
		System.out.println("N�mero negativo, se acab�.");
		teclado.close();
	}

}
