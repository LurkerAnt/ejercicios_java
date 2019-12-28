package a01xVariablesDecisiones;

import java.util.Scanner;

public class A04xMayorOrIgual {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("inicio");
		System.out.println("primer valor");
		n1 = teclado.nextInt();
		System.out.println("da el segundo valor");
		n2 = teclado.nextInt();
		// System.out.println(n1 == n2 ? "iguales" : "distintos");
		if (n1 == n2) {
			System.out.println(n1 + " y " + n2 + " son iguales");
		} else if (n1 != n2) {
			System.out.println(n1 + " y " + n2 + " son distintos");
		}
		System.out.println("despues");
		teclado.close();
	}

}
