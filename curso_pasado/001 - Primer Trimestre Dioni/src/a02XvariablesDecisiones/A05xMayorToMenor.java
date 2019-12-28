package a02XvariablesDecisiones;

import java.util.Scanner;

/**
 * 5. Pedir dos números y mostrarlos ordenados de mayor a menor.
 * 
 * @author Dionisio Fernández Ortiz.
 *
 */

public class A05xMayorToMenor {

	public static void main(String[] Args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, mayor, menor;
		System.out.println("Dame el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo número: ");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
			System.out.println("Los números de mayor a menor son: " + mayor + "," + menor + ".");
		} else if (num1 < num2) {
			mayor = num2;
			menor = num1;
			System.out.println("Los números de mayor a menor son: " + mayor + "," + menor + ".");
		} else if (num1 == num2) {
			System.out.println("Los números de mayor a menor son: " + num1 + "," + num2 + ".");
		}
		teclado.close();
	}
}
