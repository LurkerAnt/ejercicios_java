package estructurasdControl1;
//1.	Pedir dos n�meros por teclado y decir si son iguales o no.

import java.util.Scanner;

public class A1IgualesOno {

	public static void main(String[] args) {
		int num1, num2;
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce el primer n�mero: ");
		num1 = T.nextInt();
		System.out.println("Introduce el primer n�mero: ");
		num2 = T.nextInt();

		if (num1 > num2) {
			System.out.println("El primer n�mero es mayor");
		} else {
			System.out.println("El segundo n�mero es mayor");
		}

	}

}
