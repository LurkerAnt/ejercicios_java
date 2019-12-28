package estructurasdControl2;

import java.util.Scanner;

public class B6InvierteNumeros {

	public static void main(String[] args) {
		int numero, numAux, invertido, unidad;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce el número:");
		numero = T.nextInt();
		numAux = numero;
		invertido = unidad = 0;
		while (numero > 0) {
			unidad = numero % 10;
			numero = numero / 10;
			invertido = (invertido * 10) + unidad;
		}
		System.out.printf("El numero invertido de %d es %d", numAux, invertido);
	}

}
