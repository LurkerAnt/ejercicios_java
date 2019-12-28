package a02XvariablesDecisiones;

/**
 * 8. Escribe un programa que lea dos números enteros positivos distintos y diga si el mayor es múltiplo del menor.
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class A08xMultiploDe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, mayor, menor;
		System.out.println("Dame el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo número: ");
		num2 = teclado.nextInt();
		mayor = menor = 0;
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		} else if (num1 < num2) {
			mayor = num2;
			menor = num1;
		}

		if (mayor % menor == 0) {
			System.out.println("El número " + mayor + " es múltiplo de " + menor);
		} else {
			System.out.println("El número " + mayor + " NO es múltiplo de " + menor);
		}
		teclado.close();
	}

}
