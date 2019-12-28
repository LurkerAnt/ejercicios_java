package estructurasdControl1;

import java.util.Scanner;

public class B6DiaCorrectoMasUno {

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

		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia <= 30) {
				esCorrecta = true;
			}
		} else if (mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia <= 31) {
				esCorrecta = true;
			}

		} else if (mes == 2) {
			if (dia <= 28) {
				esCorrecta = true;
			} else {
				if (dia == 29) {
					if (year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0))) {
						esCorrecta = true;
					}
				}
			}
		}

		if (esCorrecta == true) {
			System.out.printf("%d/%d/%d es correcta", dia, mes, year);
		} else {
			System.out.printf("%d/%d/%d no es correcta", dia, mes, year);
		}
		if (esCorrecta == true) {
			dia = dia + 1;

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia > 30) {
					dia = 1;
					mes++;
				}
			} else if (mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia > 31) {
					dia = 1;
					mes++;
					if (mes == 13) {
						mes = 1;
						year++;
					}
				}

			} else if (mes == 2) {
				if (dia > 28 && !(year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0)))) {
					dia = 1;
					mes++;
				} else {
					if (dia > 29) {
						if (year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0))) {
							dia = 1;
							mes++;
						}
					}
				}
			}
			System.out.printf(". Y el día siguiente es %d/%d/%d.", dia, mes, year);
		}
	}

}
