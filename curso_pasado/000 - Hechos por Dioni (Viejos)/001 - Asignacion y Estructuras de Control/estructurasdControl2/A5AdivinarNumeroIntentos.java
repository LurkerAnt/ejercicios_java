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
		System.out.println("Introduce un n�mero entre 1 y 100: ");
		numero = T.nextInt();
		intentos = 0;
		for (intentos = 2; numero != numRandom && intentos <= 3; intentos++) {
			if (numero < numRandom) {
				System.out.println("El n�mero es m�nor, introduce otro n�mero: ");
				numero = T.nextInt();
			} else {
				if (numero > numRandom) {
					System.out.println("El n�mero es Mayor, introduce otro n�mero: ");
					numero = T.nextInt();
				}
			}
		}

		if (numero == numRandom) {
			System.out.println("El n�mero es el mismo!!!");
		} else if (numero != numRandom) {
			System.out.println("Numero de Intentos agotado, vuelva a intentarlo otro d�a.");

		}

	}

}
/*
 * for (intentos = 1; intentos <= 3;) {
 * 
 * if (numero > numRandom) { System.out.println("Menor"); } if (numero <
 * numRandom) { System.out.println("Mayor"); } if (numero == numRandom) {
 * System.out.println("N�mero correcto!!!"); }
 * System.out.println("Introduce Otro n�mero: "); numero = T.nextInt();
 * intentos++; if (intentos == 3) {
 * System.out.println("N�mero de intentos m�ximos superado."); }
 * 
 * }
 */
