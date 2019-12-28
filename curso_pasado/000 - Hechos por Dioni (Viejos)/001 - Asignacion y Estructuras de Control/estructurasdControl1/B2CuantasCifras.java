package estructurasdControl1;

import java.util.Scanner;

public class B2CuantasCifras {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		int numero, cifras, numeroAux;

		Scanner T = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		numero = T.nextInt();
		if (numero > 9999 || numero < 0) {
			System.out.println("Numero erroneo, introduce un numero entre 0 y 9999:");
			numero = T.nextInt();
		}
		numeroAux = numero;
		for (cifras = 1; numero >= 10; cifras++) {
			numero = numero / 10;
		}
		System.out.printf("El numero %d tiene %d cifras.", numeroAux, cifras);
	}

}
