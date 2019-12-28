package arrays1;

import java.util.Scanner;

public class A2Leer5NumsInvers {

	public static void main(String[] args) {
		int contador;
		int[] numbers = new int[5];
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce 5 números: ");
		for (contador = 0; contador <= 4; contador++) {
			numbers[contador] = T.nextInt();
		}
		System.out.println("Los números son: ");
		for (contador = 4; contador >= 0; contador--) {
			System.out.println(numbers[contador]);
		}
	}

}
