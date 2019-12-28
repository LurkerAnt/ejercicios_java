package a03XbuclesDecisiones;

/**
 * 1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class A01xCuadradoHastaNegativo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		while (numero > 0) {
			System.out.println((int) Math.pow(numero, 2));
			System.out.println("Dame otro número: ");
			numero = teclado.nextInt();
		}
		System.out.println("Número negativo, se acabó.");
		teclado.close();
	}

}
