package a02XvariablesDecisiones;

/**
 * 16. 	Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. 
 * 		Cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días o 29 si quieres). 
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B06xDiaMasUno {

	public static void main(String[] args) {
		int day, month, year;
		boolean itsCorrect = false;
		Scanner key = new Scanner(System.in);
		System.out.println("Give me a day: ");
		day = key.nextInt();
		System.out.println("Give me a month: ");
		month = key.nextInt();
		System.out.println("Give me a year: ");
		year = key.nextInt();
		if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) {
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
			}
		}

		if (itsCorrect == true) {
			System.out.printf("The date %d/%d/%d is correct.", day, month, year);
		} else if (itsCorrect == false) {
			System.out.printf("The date %d/%d/%d is correct.", day, month, year);
		}

		day++;

		if (itsCorrect == true) {
			if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day > 31) {
					day = 1;
					month++;
					if (month > 12) {
						month = 1;
						year++;
					}
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day > 30) {
					day = 1;
					month++;
				}
			} else if (month == 2) {
				if (month == 2 && day == 29 && year % 100 == 0 && year % 4 != 0
						|| month == 2 && day == 29 && year % 400 != 0) {
					day = 1;
					month++;
				} else if (month == 2 && day == 30 && year % 100 != 0 && year % 4 == 0
						|| month == 2 && day == 30 && year % 400 == 0) {
					day = 1;
					month++;
				}

			}
		}
		System.out.printf(" The next day is %d/%d/%d.", day, month, year);

		key.close();
	}
}
