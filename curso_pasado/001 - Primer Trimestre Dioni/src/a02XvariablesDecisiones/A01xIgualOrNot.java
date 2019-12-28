package a02XvariablesDecisiones;

import java.util.Scanner;

/**
 * 1. Pedir dos números por teclado y decir si son iguales o no.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class A01xIgualOrNot {

	public static void main(String[] args) {
		// Iniciación escaner.
		Scanner Teclado = new Scanner(System.in);
		// Declaración de Variables.
		int num1, num2;
		// Petición de información.
		System.out.println("Dame el primer número: ");
		num1 = Teclado.nextInt();
		System.out.println("Dame el segundo número: ");
		num2 = Teclado.nextInt();
		// Tratamiento de información
		if (num1 == num2)
			System.out.println("Son iguales.");
		else
			System.out.println("No son iguales.");
		Teclado.close();
	}

}
