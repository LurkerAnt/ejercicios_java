package a03XbuclesDecisiones;

import java.util.Scanner;

public class B06xNumeroCapicua {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAux, invertido;
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		numAux = numero;
		for (invertido = 0; numero > 0;) {
			invertido = invertido * 10;
			invertido += numero % 10;
			numero = numero / 10;
		}
		System.out.printf("El n�mero %d al reves es %d.\n", numAux, invertido);
		if (numAux == invertido) {
			System.out.printf("El n�mero %d es capic�a.", numAux);
		} else {
			System.out.printf("El n�mero %d no es capic�a.", numAux);
		}
		teclado.close();
	}

}
