package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * 20. Decir si un numero N introducido por teclado es primo o no lo es.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class B10xDecirSiNumeroPrimo {

	public static void main(String[] args) {
		int numero, divisor;
		@SuppressWarnings("unused")
		boolean primo;
		primo = true;
		Scanner t = new Scanner(System.in);
		numero = t.nextInt();
		for (divisor = 2; divisor <= numero / 2; divisor++) {
			if (numero % divisor == 0) {
				primo = false;
			}
		}

		if (primo = true) {
			System.out.println("Primo");
		} else {
			System.out.println("No es Primo");
		}
		t.close();
	}

}
