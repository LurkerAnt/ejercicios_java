package estructurasdControl2;

import java.util.Scanner;

public class B5DigitosEnN {

	public static void main(String[] args) {
		int numero, digitos, numAux;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		numAux = numero;
		for (digitos = 0; numero != 0; digitos++) {
			numero = numero / 10;
		}
		System.out.printf("El número de dígitos en %d es %d", numAux, digitos);
	}

}
