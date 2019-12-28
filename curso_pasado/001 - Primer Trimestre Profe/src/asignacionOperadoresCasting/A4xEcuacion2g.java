package asignacionOperadoresCasting;

import java.util.Scanner;

public class A4xEcuacion2g {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, base;
		float x1, x2;

		System.out.println("Coeficiente a: ");
		a = teclado.nextInt();
		if (a == 0)
			System.out.println("No es una ecuación de segundo grado");
		else {
			System.out.println("Coeficiente b: ");
			b = teclado.nextInt();
			System.out.println("Coeficiente c: ");
			c = teclado.nextInt();
			base = b * b - 4 * a * c;
			if (base < 0)
				System.out.println("Raices imaginarias.");
			else if (base == 0) {
				/*
				 * x1 = -b / (2 * a); x2 = x1;
				 */
				System.out.println("x1= " + x1);
				System.out.println("x2= " + x2);
			} else {
				x1 = (float) ((-b + Math.sqrt(base)) / (2 * a));
				x2 = (float) ((-b + Math.sqrt(base)) / (2 * a));
				if (x1 == x2)
					System.out.println("Iguales");
				else
					System.out.println("Diferentes");
			}
		}

	}

}
