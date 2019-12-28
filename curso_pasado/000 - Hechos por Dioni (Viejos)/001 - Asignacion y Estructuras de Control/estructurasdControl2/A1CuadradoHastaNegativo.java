package estructurasdControl2;

import java.util.Scanner;

public class A1CuadradoHastaNegativo {

	public static void main(String[] args) {

		int numero, cuadrado;
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce el número: ");
		numero = T.nextInt();
		cuadrado = 0;

		for (cuadrado = 0; numero >= 1;) {
			cuadrado = (int) Math.pow(numero, 2);
			System.out.printf("El cuadrado de %d es %d.", numero, cuadrado);
			System.out.println();
			System.out.println("Introduce otro número: ");
			numero = T.nextInt();

		}
		if (numero <= 0) {
			System.out.println("Número igual o menor que 0. Se acabo.");
		}
	}

}
