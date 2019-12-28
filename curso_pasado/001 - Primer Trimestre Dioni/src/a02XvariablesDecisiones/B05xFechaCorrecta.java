package a02XvariablesDecisiones;

/**
 * 15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Con años bisiestos. 
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B05xFechaCorrecta {

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
			} else if (day < 29) {
				itsCorrect = false;
			}
		}
		if (itsCorrect == true) {
			System.out.printf("The date %d/%d/%d is correct.", day, month, year);
		} else if (itsCorrect == false) {
			System.out.printf("The date %d/%d/%d is correct.", day, month, year);
		}
		key.close();
	}
}