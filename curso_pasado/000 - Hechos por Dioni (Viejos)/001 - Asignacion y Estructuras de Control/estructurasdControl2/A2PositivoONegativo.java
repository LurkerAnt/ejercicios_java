package estructurasdControl2;

import java.util.Scanner;

public class A2PositivoONegativo {

	public static void main(String[] args) {

		int numero;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		numero = T.nextInt();
		while (numero != 0) {
			if (numero < 0) {
				System.out.printf("El n�mero %d es negativo.", numero);
			}
			if (numero > 0) {
				System.out.printf("El n�mero %d es positivo", numero);
			}
			System.out.println();
			System.out.println("Introduce otro n�mero: ");
			numero = T.nextInt();
		}
		if (numero == 0) {
			System.out.println("El n�mero es 0.");
		}
	}

}
