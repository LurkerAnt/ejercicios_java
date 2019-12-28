package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * Programa que obtenga e imprima la lista de los intereses producidos y el
 * capital acumulado anualmente por un capital inicial C impuesto un rédito R
 * durante N años a interés compuesto. El capital se incrementa cada año con los
 * intereses producidos en el mismo.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class B08xCapitalEnEquisYears {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double capital, redito, acumulado, interes;
		int year, month, totalMonth, yearAcum;
		System.out.println("Dame el capital: ");
		capital = teclado.nextDouble();
		System.out.println("Dame el rédito: ");
		redito = teclado.nextDouble();
		System.out.println("Dame la cantidad de años: ");
		year = teclado.nextInt();
		acumulado = capital;
		for (totalMonth = year * 12, month = 0, interes = 0; month <= totalMonth; month++) {
			interes += (acumulado * (redito / 100));
			acumulado += (acumulado * (redito / 100));
			yearAcum = month / 12;
			if (month % 12 == 0 && month > 0) {
				System.out.printf("Durante el año %d el interés generado ha sido %.2f, y el total acumulado es %.2f.\n",
						yearAcum, interes, acumulado);
			}
		}
		teclado.close();
	}

}
