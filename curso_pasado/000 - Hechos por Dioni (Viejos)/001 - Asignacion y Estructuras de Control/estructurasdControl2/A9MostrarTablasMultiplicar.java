package estructurasdControl2;

import java.util.Scanner;

public class A9MostrarTablasMultiplicar {

	public static void main(String[] args) {
		int numero, resultado, multiplicador;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		multiplicador = 0;
		for (numero = 0; numero <= 10; numero++) {
			System.out.printf("La tabla de multiplicar del %d es: ", numero);
			for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
				System.out.println();
				resultado = numero * multiplicador;
				System.out.printf("%d * %d = %d\n", numero, multiplicador, resultado);
			}

		}
	}

}
