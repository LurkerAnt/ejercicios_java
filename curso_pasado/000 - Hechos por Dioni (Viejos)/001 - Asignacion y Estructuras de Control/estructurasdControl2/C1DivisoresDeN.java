package estructurasdControl2;

import java.util.Scanner;

public class C1DivisoresDeN {

	public static void main(String[] args) {
		int numero, divisor;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		System.out.printf("Divisores de %d:", numero);
		for (divisor = 1; divisor <= numero; divisor++) {
			if (numero % divisor == 0) {
				System.out.print(divisor + " ");
			}
		}

	}

}
