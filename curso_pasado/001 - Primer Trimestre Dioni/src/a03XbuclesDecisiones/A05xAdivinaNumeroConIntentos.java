package a03XbuclesDecisiones;

/**
 * 05. Modifica el ejercicio anterior para permitir sólo un número IMAX de intentos máximos.
 * @author Dionisio Fernández Ortiz
 */

import java.util.Scanner;

public class A05xAdivinaNumeroConIntentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAdv, intentos;
		numAdv = (int) (Math.random() * 100);
		System.out.println(numAdv);
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		intentos = 1;
		while (numero != numAdv || intentos <= 7) {
			if (numero < numAdv) {
				System.out.println("El número es mayor.");
			} else if (numero > numAdv) {
				System.out.println("El número es menor.");
			}
			System.out.println("Dame otro número: ");
			numero = teclado.nextInt();
			intentos++;
			System.out.printf("Intento número %d.", intentos);
		}
		if (numero == numAdv) {
			System.out.println("¡Has acertado!");
			System.out.printf("Has necesitado %d intentos.", intentos);
		} else {
			System.out.println("Número máximo de intentos alcanzado.");
		}

		teclado.close();
	}

}
