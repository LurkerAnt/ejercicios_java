package estructurasdControl1;

import java.util.Scanner;

public class A4CualMayoroIgual {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce el primer n�mero: ");
		numero1 = T.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		numero2 = T.nextInt();

		if (numero1 > numero2) {
			System.out.printf("El numero %d es el mayor", numero1);
		}
		if (numero2 > numero1) {
			System.out.printf("El numero %d es el mayor", numero2);
		}
		if (numero1 == numero2) {
			System.out.printf("Los n�meros %d y %d son iguales.", numero1, numero2);
		}

	}

}
