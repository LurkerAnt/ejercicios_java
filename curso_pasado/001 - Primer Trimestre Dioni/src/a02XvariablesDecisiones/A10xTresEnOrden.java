package a02XvariablesDecisiones;

/**
 * 10. Pedir tres n�meros y mostrarlos ordenados de mayor a menor. 
 * @author Dionisio Fern�ndez Ortiz
 */

import java.util.Scanner;

public class A10xTresEnOrden {

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
		System.out.println("Los n�meros ordenados de mayor a menor son: " + mayor + ", " + middle + ", " + menor + ".");
		teclado.close();
	}

}
