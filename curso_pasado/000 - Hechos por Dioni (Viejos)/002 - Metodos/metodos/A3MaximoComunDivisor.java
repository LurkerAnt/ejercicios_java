package metodos;

import java.util.Scanner;

/*
 * Calcular el máximo común divisor por el “Algoritmo de Euclides”. Consiste en:
Dividir el mayor por el menor.
Dividir el divisor por el resto.
Seguir dividiendo el último divisor por el último resto hasta que la división sea exacta.
El último divisor es el máximo común divisor.
 */
public class A3MaximoComunDivisor {

	public static int mcm(int dividendo, int divisor) {
		int resto, mcm, div;
		mcm = 0;
		resto = dividendo % divisor;
		System.out.printf("mcd(%d,%d)", dividendo, divisor);
		while (resto != 0) {
			mcm = dividendo / divisor;
			resto = dividendo % divisor;
			dividendo = divisor;
			mcm = divisor;
			divisor = resto;
			System.out.printf(" = mcd(%d,%d)", dividendo, divisor);
		}
		return mcm;
	}

	public static void main(String[] args) {

		Scanner T = new Scanner(System.in);
		int numero1, numero2, maxCD;
		System.out.println("Introduce el primer número: ");
		numero1 = T.nextInt();
		System.out.println("Introduce el segundo número: ");
		numero2 = T.nextInt();
		maxCD = 0;
		if (numero1 > numero2) {
			maxCD = mcm(numero1, numero2);
		} else {
			if (numero2 > numero1) {
				maxCD = mcm(numero2, numero1);
			}
		}
		System.out.printf("\nEl máximo comun divisor es: %d", maxCD);
	}

}
