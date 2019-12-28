package a02XvariablesDecisiones;

/**
 * 10. Pedir tres números y mostrarlos ordenados de mayor a menor. 
 * @author Dionisio Fernández Ortiz
 */

import java.util.Scanner;

public class A10xTresEnOrden {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, mayor, middle, menor;
		System.out.println("Dame el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Dame el tercer número: ");
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
		System.out.println("Los números ordenados de mayor a menor son: " + mayor + ", " + middle + ", " + menor + ".");
		teclado.close();
	}

}
