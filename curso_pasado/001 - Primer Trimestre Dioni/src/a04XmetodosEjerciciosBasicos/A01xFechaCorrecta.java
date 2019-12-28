package a04XmetodosEjerciciosBasicos;

/**
 * 1.	Indicar si una fecha es correcta. 
 * 		Un año es bisiesto cuando es múltiplo de cuatro, salvo los múltiplos de cien a no ser que los sean de cuatrocientos.
 * @author Dionisio Fernández Ortiz.
 */
import java.util.Scanner;

public class A01xFechaCorrecta {

	public static boolean correctaOrNot(int dia, int mes, int anhos) {
		int day, month, year;
		boolean itsCorrect = false;
		day = dia;
		month = mes;
		year = anhos;
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
		return itsCorrect;
	}

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int dia, mes, year;
		boolean esCorrecta = false;
		System.out.println("Introduce el día: ");
		dia = T.nextInt();
		System.out.println("Introduce el mes: ");
		mes = T.nextInt();
		System.out.println("Introduce el año: ");
		year = T.nextInt();

		esCorrecta = correctaOrNot(dia, mes, year);

		if (esCorrecta == true)
			System.out.println("La fecha es correcta.");
		else
			System.out.println("La fecha es incorrecta.");
		T.close();
	}

}
