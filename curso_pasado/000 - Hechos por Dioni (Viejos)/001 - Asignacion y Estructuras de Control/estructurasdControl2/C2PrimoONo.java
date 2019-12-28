package estructurasdControl2;

import java.util.Scanner;

public class C2PrimoONo {

	public static void main(String[] args) {
		int numero, numAux, divisor;
		boolean primo = true;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		numAux = numero;

		for (divisor = 2; divisor <= (numero / 2); divisor++) {
			if (numero % divisor == 0) {
				primo = false;
			}

		}
	}

}
