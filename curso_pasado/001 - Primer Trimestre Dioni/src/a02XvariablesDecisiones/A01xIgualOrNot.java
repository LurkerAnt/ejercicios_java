package a02XvariablesDecisiones;

import java.util.Scanner;

/**
 * 1. Pedir dos n�meros por teclado y decir si son iguales o no.
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class A01xIgualOrNot {

	public static void main(String[] args) {
		// Iniciaci�n escaner.
		Scanner Teclado = new Scanner(System.in);
		// Declaraci�n de Variables.
		int num1, num2;
		// Petici�n de informaci�n.
		System.out.println("Dame el primer n�mero: ");
		num1 = Teclado.nextInt();
		System.out.println("Dame el segundo n�mero: ");
		num2 = Teclado.nextInt();
		// Tratamiento de informaci�n
		if (num1 == num2)
			System.out.println("Son iguales.");
		else
			System.out.println("No son iguales.");
		Teclado.close();
	}

}
