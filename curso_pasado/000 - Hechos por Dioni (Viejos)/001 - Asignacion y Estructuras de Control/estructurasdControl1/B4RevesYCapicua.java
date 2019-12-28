package estructurasdControl1;

import java.util.Scanner;

public class B4RevesYCapicua {

	public static void main(String[] args) {
		int numero, cifra, numeroAux;
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce el numero: ");
		numero = T.nextInt();
		if (numero > 9999 || numero < 0) {
			System.out.println("Numero erroneo, introduce un numero entre 0 y 9999:");
			numero = T.nextInt();
		}
		numeroAux = numero;

		for (cifra = 0; numero > 0;) {
			cifra = cifra * 10;
			cifra = cifra + (numero % 10);
			numero = numero / 10;
		}
		System.out.printf("El numero %d al revés es %d", numeroAux, cifra);

		if (numeroAux == cifra) {
			System.out.println(" y son numeros capicúa.");
		} else {
			System.out.println(" y no son numeros capicúa.");
		}
	}

}
