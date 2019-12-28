package estructurasdControl1;

import java.util.Scanner;

public class A2positivo {

	public static void main(String[] args) {
		int numero;
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce un número:");
		numero = T.nextInt();

		if (numero > 0) {
			System.out.printf("El número %d es positivo", numero);
		} else {
			System.out.printf("El número %d es negativo", numero);
		}
	}

}
