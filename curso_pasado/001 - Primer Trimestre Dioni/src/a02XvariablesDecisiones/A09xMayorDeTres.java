package a02XvariablesDecisiones;

/**
 * 9. Escribe un programa que decida cual de tres n�meros introducidos por teclado es el mayor
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class A09xMayorDeTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, mayor, middle, menor;
		System.out.println("Dame el primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo n�mero: ");
		num2 = teclado.nextInt();
		System.out.println("Dame el tercer n�mero: ");
		num3 = teclado.nextInt();
		menor = middle = mayor = 0;
		if (num1 > num2 && num1 < num3) {
			mayor = num3;
			middle = num1;
			menor = num2;
		} else if (num1 > num3 && num1 < num2) {
			mayor = num2;
			middle = num1;
			menor = num3;
		} else if (num1 > num2 && num1 > num3 && num2 > num3) {
			mayor = num1;
			middle = num2;
			menor = num3;
		} else if (num1 > num2 && num1 > num3 && num3 > num2) {
			mayor = num1;
			middle = num3;
			menor = num2;
		} else if (num1 < num2 && num1 < num3 && num2 > num3) {
			mayor = num2;
			middle = num3;
			menor = num1;
		} else if (num1 < num2 && num1 < num3 && num3 > num2) {
			mayor = num3;
			middle = num2;
			menor = num1;
		}
		System.out.println(
				"El n�mero m�s grande es: " + mayor + ", seguido de " + middle + ", y por �ltimo" + menor + ".");
		teclado.close();
	}
}
