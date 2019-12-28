package estructurasdControl1;

import java.util.Scanner;

public class A5MayorAMenor {

	public static void main(String[] args) {
		int numero1, numero2, numAux;
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce el primer número: ");
		numero1 = T.nextInt();
		System.out.println("Introduce el segundo número: ");
		numero2 = T.nextInt();

		if (numero1 > numero2) {
			System.out.printf("El numero %d es el mayor que %d", numero1, numero2);
		}
		if (numero2 > numero1) {
			numAux = numero1;
			numero1 = numero2;
			numero2 = numAux;
			System.out.printf("El numero %d es mayor que %d", numero1, numero2);
		}
		if (numero1 == numero2) {
			System.out.printf("Los números %d y %d son iguales.", numero1, numero2);
		}

	}

}
