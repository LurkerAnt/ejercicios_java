package a02XvariablesDecisiones;

/**
 * 4. Pedir dos n�meros y decir cual es el mayor o si son iguales. 
 * @author Dionisio Fern�ndez Ortiz
 */

import java.util.Scanner;

public class A04xMayorIgual {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, mayor, menor;
		System.out.println("Dame el primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo n�mero: ");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
			System.out.println("El n�mero " + mayor + "es mayor que " + menor + ".");
		} else if (num1 < num2) {
			mayor = num2;
			menor = num1;
			System.out.println("El n�mero " + mayor + "es mayor que " + menor + ".");
		} else if (num1 == num2) {
			System.out.println("Los n�meros son iguales");
		}
		teclado.close();
	}

}
