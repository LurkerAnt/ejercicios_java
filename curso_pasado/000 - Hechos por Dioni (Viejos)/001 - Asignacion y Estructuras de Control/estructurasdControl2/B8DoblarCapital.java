package estructurasdControl2;

import java.util.Scanner;

//Un capital C se coloca a un r�dito R. �Al cabo de cuantos a�os de duplicar� el capital ?
public class B8DoblarCapital {

	public static void main(String[] args) {
		double capital, redito, totalCap, dobleCap;
		int a�os, mesesFin, meses;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce tu capital.");
		capital = 100;
		System.out.println("Introduce el r�dito.");
		redito = 3;
		redito = capital * (redito / 100);
		System.out.println(redito);
		meses = 1;
		totalCap = 0;
		dobleCap = capital * 2;
		System.out.println(capital);
		for (totalCap = capital; totalCap < dobleCap; meses++) {
			totalCap = totalCap + redito;
		}
		mesesFin = meses % 12;
		a�os = meses / 12;
		if (mesesFin == 0) {
			System.out.printf("El capital %.2f a un redito %.2f ha tardado en doblarse %d a�os.", capital, redito,
					a�os);
		} else {
			System.out.printf("El capital %.2f a un redito %.2f ha tardado en doblarse %d a�os y %d meses.", capital,
					redito, a�os, mesesFin);
		}

	}

}
