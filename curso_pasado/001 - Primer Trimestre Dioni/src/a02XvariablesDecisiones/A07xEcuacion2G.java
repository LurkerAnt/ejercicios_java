package a02XvariablesDecisiones;

/**
 * 7. Pedir los coeficientes de una ecuación se 2o grado, y muestre sus soluciones reales. Si no existen, debe indicarlo. 
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class A07xEcuacion2G {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1, x2;
		int a, b, c;
		System.out.println("Dame la a: ");
		a = teclado.nextInt();
		System.out.println("Dame la b: ");
		b = teclado.nextInt();
		System.out.println("Dame la c: ");
		c = teclado.nextInt();

		x1 = (-b + (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / (2 * a);
		x2 = (-b - (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / (2 * a);

		System.out.println("El resultado de X1 es: " + x1);
		System.out.println("El resultado de X2 es: " + x2);
		teclado.close();
	}

}
