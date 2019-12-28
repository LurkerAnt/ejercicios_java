package estructurasdControl1;

import java.util.Scanner;

public class A8MayorMultiploMenor {

	public static void main(String[] args) {
		int numero1, numero2, mayor, menor;
		Scanner T = new Scanner(System.in);
		mayor = menor = 0;

		System.out.println("Introduce el primer número: ");
		numero1 = T.nextInt();
		System.out.println("Introduce el segundo número: ");
		numero2 = T.nextInt();

		if (numero1 > numero2) {
			System.out.printf("El numero %d es el mayor.", numero1);
			mayor = numero1;
			menor = numero2;
			System.out.println();
			if (mayor % menor == 0) {
				System.out.printf("El número %d es multiplo de %d.", mayor, menor);
			} else {
				System.out.printf("El número %d no es multiplo de %d.", mayor, menor);
			}
		}
		if (numero2 > numero1) {
			System.out.printf("El numero %d es el mayor.", numero2);
			mayor = numero2;
			menor = numero1;
			System.out.println();
			if (mayor % menor == 0) {
				System.out.printf("El número %d es multiplo de %d.", mayor, menor);
			} else {
				System.out.printf("El número %d no es multiplo de %d.", mayor, menor);
			}
		}

	}

}
