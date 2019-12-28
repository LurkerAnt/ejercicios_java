package arrays1;

import java.util.Scanner;

//Leer 5 números y mostrarlos en el mismo orden introducido.
public class A1Leer5Nums {

	public static void main(String[] args) {
		int contador;
		int[] numbers = new int[5];
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce 5 números: ");
		for (contador = 0; contador <= 4; contador++) {
			numbers[contador] = T.nextInt();
		}
		System.out.println("Los números son: ");
		for (contador = 0; contador <= 4; contador++) {
			System.out.println(numbers[contador]);
		}
	}

}
