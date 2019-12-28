package a04XmetodosEjerciciosBasicos;

import java.util.Scanner;

/**
 * 2. Calcular el número del tarot de una persona a partir de la fecha de su
 * nacimiento. El cálculo consiste en sumar el día, mes y año; del resultado
 * obtenido se suman sus dígitos y así sucesivamente hasta reducir a un sólo
 * dígito. Antes de hacer los cálculos debes comprobar que la fecha introducida
 * es correcta: día, mes y año.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class A02XTarot {
	public static boolean esBisiesto(int year) {
		boolean itsCorrect = false;
		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
			itsCorrect = true;
		} else {
			itsCorrect = false;
		}
		return itsCorrect;
	}

	public static boolean fechaCorrectaOrNot(int dia, int mes, int anhos) {
		int day, month, year;
		boolean itsCorrect = false;
		day = dia;
		month = mes;
		year = anhos;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day <= 31) {
				itsCorrect = true;
			} else {
				itsCorrect = false;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day <= 30) {
				itsCorrect = true;
			} else {
				itsCorrect = false;
			}
		} else if (month == 2) {
			if (day <= 28) {
				itsCorrect = true;
			} else if (day == 29) {
				if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
					itsCorrect = true;
				} else {
					itsCorrect = false;
				}
			} else if (day < 29) {
				itsCorrect = false;
			}
		}
		return itsCorrect;
	}

	public static boolean fechaCorrectaOrNot2(int dia, int mes, int years) {
		boolean itsCorrect = false;

		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >= 1 && dia <= 30) {
				itsCorrect = true;
			} else {
				itsCorrect = false;
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia >= 1 && dia <= 31) {
				itsCorrect = true;
			} else {
				itsCorrect = false;
			}
			break;
		case 2:
			if (dia >= 1 && dia <= 31 || dia == 29 && esBisiesto(years)) {
				itsCorrect = true;
			} else {
				itsCorrect = false;
			}
			break;
		}

		return itsCorrect;
	}

	public static int sumaTarot(int uni1, int uni2, int uni3) {
		int acumulador;
		acumulador = uni1 + uni2 + uni3;
		while (acumulador > 9) {
			acumulador = roturaTarot(acumulador);
		}
		return acumulador;
	}

	public static int roturaTarot(int sumaTarot) {
		int acumulado;
		acumulado = 0;
		while (sumaTarot > 0) {
			acumulado += sumaTarot % 10;
			sumaTarot = sumaTarot / 10;
		}
		return acumulado;
	}

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int dia, mes, year, numTarot;
		boolean esCorrecta = false;
		System.out.println("Dame tu fecha de nacimiento.");
		System.out.println("Introduce el día: ");
		dia = T.nextInt();
		System.out.println("Introduce el mes: ");
		mes = T.nextInt();
		System.out.println("Introduce el año: ");
		year = T.nextInt();

		esCorrecta = fechaCorrectaOrNot(dia, mes, year);

		if (esCorrecta == true) {
			numTarot = sumaTarot(dia, mes, year);
			System.out.printf("Tu número del tarot es: %d", numTarot);
		} else {
			System.out.println("La fecha es incorrecta. No se puede calcular el número del Tarot.");
		}
		T.close();
	}

}
