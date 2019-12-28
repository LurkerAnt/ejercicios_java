package metodos;

/*
 * Calcular el número del tarot de una persona a partir de la fecha de su nacimiento. 
 * El cálculo consiste en sumar el día, mes y año; del resultado obtenido se suman sus dígitos y así sucesivamente hasta reducir a un sólo dígito.
 * Antes de hacer los cálculos debes comprobar que la fecha introducida es correcta: día, mes y año.
 */

import java.util.Scanner;

public class A2Tarot {

	public static int tarot(int dia, int mes, int year) {
		int numeroTarot, acumDia, acumMes, acumYear;
		numeroTarot = acumDia = acumMes = acumYear = 0;

		if (dia >= 10) {
			acumDia = dia % 10;
			acumDia += dia / 10;
		} else {
			acumDia += dia;
		}
		if (mes >= 10) {
			acumMes = mes % 10;
			acumMes += mes / 10;
		} else {
			acumMes += mes;
		}
		while (year > 0) {
			acumYear += year % 10;
			year = year / 10;
		}
		numeroTarot = acumDia + acumMes + acumYear;
		return numeroTarot;
	}

	public static void main(String[] args) {

		Scanner T = new Scanner(System.in);
		int dia, mes, year, numTarot;
		boolean esCorrecta = false;
		System.out.println("Introduce el día: ");
		dia = T.nextInt();
		System.out.println("Introduce el mes: ");
		mes = T.nextInt();
		System.out.println("Introduce el año: ");
		year = T.nextInt();

		esCorrecta = A1FechaCorrecta.fechaCorrecta(dia, mes, year);

		if (esCorrecta == true) {
			System.out.printf("%d/%d/%d es correcta", dia, mes, year);
		} else {
			System.out.printf("%d/%d/%d no es correcta", dia, mes, year);
		}
		if (esCorrecta == true) {
			numTarot = tarot(dia, mes, year);
			System.out.printf("\nEl número del tarot es %d ", numTarot);
		}
	}
}
