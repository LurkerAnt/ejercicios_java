package a03XbuclesDecisiones;

/**
 * 17. Un capital C se coloca a un r�dito R. �Al cabo de cuantos a�os de duplicar� el capital?
 * @author Dionisio Fern�ndez Ortiz	
 *
 */

import java.util.Scanner;

public class B07xDoblarCapital {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double capital, redito, acumulado;
		int year, month, restMonth;
		System.out.println("Dame el capital: ");
		capital = teclado.nextDouble();
		System.out.println("Dame el r�dito: ");
		redito = teclado.nextDouble();
		acumulado = capital;
		for (month = 0; acumulado <= (capital * 2); month++) {
			acumulado += (acumulado * (redito / 100));
		}
		year = month / 12;
		restMonth = month % 12;
		System.out.printf("El credito %.2f ha tardado %d a�os y %d meses en doblarse con un redito de %.2f%", capital,
				year, restMonth, redito);
		teclado.close();
	}

}
