package estructurasdControl2;

import java.util.Scanner;

public class B9CapitalNYears {

	public static void main(String[] args) {
		double capital, redito, capiAux, rediAux;
		int years, auxYears, meses;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce la cantidad: ");
		capital = T.nextDouble();
		capiAux = capital;
		System.out.println("Introduce el redito: ");
		redito = T.nextDouble();
		System.out.println("Introduce los años: ");
		years = T.nextInt();
		for (auxYears = 1; auxYears <= years; auxYears++) {
			for (meses = 0, rediAux = 0; meses < 12; meses++) {
				rediAux = rediAux + ((capital * redito) / 100);
				capital = capital + ((capital * redito) / 100);
			}
			System.out.printf(
					"Durante el año %d el un capital de %.2f€ ha aumentado en %.2f€ dando un total de %.2f€\n",
					auxYears, capiAux, rediAux, capital);
			capiAux = capital;
		}
	}

}
