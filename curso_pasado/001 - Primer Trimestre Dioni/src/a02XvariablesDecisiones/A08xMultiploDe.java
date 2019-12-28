package a02XvariablesDecisiones;

/**
 * 8. Escribe un programa que lea dos n�meros enteros positivos distintos y diga si el mayor es m�ltiplo del menor.
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class A08xMultiploDe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, mayor, menor;
		System.out.println("Dame el primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo n�mero: ");
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
			System.out.println("El n�mero " + mayor + " es m�ltiplo de " + menor);
		} else {
			System.out.println("El n�mero " + mayor + " NO es m�ltiplo de " + menor);
		}
		teclado.close();
	}

}
