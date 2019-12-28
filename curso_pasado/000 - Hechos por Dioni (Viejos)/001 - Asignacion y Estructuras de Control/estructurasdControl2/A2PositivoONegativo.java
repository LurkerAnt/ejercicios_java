package estructurasdControl2;

import java.util.Scanner;

public class A2PositivoONegativo {

	public static void main(String[] args) {

		int numero;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		while (numero != 0) {
			if (numero < 0) {
				System.out.printf("El número %d es negativo.", numero);
			}
			if (numero > 0) {
				System.out.printf("El número %d es positivo", numero);
			}
			System.out.println();
			System.out.println("Introduce otro número: ");
			numero = T.nextInt();
		}
		if (numero == 0) {
			System.out.println("El número es 0.");
		}
	}

}
