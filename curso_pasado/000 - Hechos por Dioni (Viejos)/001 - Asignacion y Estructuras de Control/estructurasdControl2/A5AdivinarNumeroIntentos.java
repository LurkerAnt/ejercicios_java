package estructurasdControl2;

import java.util.Scanner;

public class A5AdivinarNumeroIntentos {

	public static void main(String[] args) {

		int numRandom, numero;
		int intentos;
		double dobleRandom;
		Scanner T = new Scanner(System.in);

		dobleRandom = Math.random();
		dobleRandom = (dobleRandom * 100);
		numRandom = (int) dobleRandom + 1;
		System.out.println(numRandom);
		System.out.println("Introduce un número entre 1 y 100: ");
		numero = T.nextInt();
		intentos = 0;
		for (intentos = 2; numero != numRandom && intentos <= 3; intentos++) {
			if (numero < numRandom) {
				System.out.println("El número es ménor, introduce otro número: ");
				numero = T.nextInt();
			} else {
				if (numero > numRandom) {
					System.out.println("El número es Mayor, introduce otro número: ");
					numero = T.nextInt();
				}
			}
		}

		if (numero == numRandom) {
			System.out.println("El número es el mismo!!!");
		} else if (numero != numRandom) {
			System.out.println("Numero de Intentos agotado, vuelva a intentarlo otro día.");

		}

	}

}
/*
 * for (intentos = 1; intentos <= 3;) {
 * 
 * if (numero > numRandom) { System.out.println("Menor"); } if (numero <
 * numRandom) { System.out.println("Mayor"); } if (numero == numRandom) {
 * System.out.println("Número correcto!!!"); }
 * System.out.println("Introduce Otro número: "); numero = T.nextInt();
 * intentos++; if (intentos == 3) {
 * System.out.println("Número de intentos máximos superado."); }
 * 
 * }
 */
