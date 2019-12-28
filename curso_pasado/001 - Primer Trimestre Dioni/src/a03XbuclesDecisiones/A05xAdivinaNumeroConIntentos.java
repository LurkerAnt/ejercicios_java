package a03XbuclesDecisiones;

/**
 * 05. Modifica el ejercicio anterior para permitir s�lo un n�mero IMAX de intentos m�ximos.
 * @author Dionisio Fern�ndez Ortiz
 */

import java.util.Scanner;

public class A05xAdivinaNumeroConIntentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAdv, intentos;
		numAdv = (int) (Math.random() * 100);
		System.out.println(numAdv);
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		intentos = 1;
		while (numero != numAdv || intentos <= 7) {
			if (numero < numAdv) {
				System.out.println("El n�mero es mayor.");
			} else if (numero > numAdv) {
				System.out.println("El n�mero es menor.");
			}
			System.out.println("Dame otro n�mero: ");
			numero = teclado.nextInt();
			intentos++;
			System.out.printf("Intento n�mero %d.", intentos);
		}
		if (numero == numAdv) {
			System.out.println("�Has acertado!");
			System.out.printf("Has necesitado %d intentos.", intentos);
		} else {
			System.out.println("N�mero m�ximo de intentos alcanzado.");
		}

		teclado.close();
	}

}
