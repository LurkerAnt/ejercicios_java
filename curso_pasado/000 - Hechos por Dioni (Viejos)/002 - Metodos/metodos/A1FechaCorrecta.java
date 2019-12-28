package metodos;

import java.util.Scanner;

/*
 * Indicar si una fecha es correcta. Un año es bisiesto cuando es múltiplo de cuatro, salvo los múltiplos de cien a no ser que los sean de cuatrocientos.
 */
public class A1FechaCorrecta {

	public static boolean fechaCorrecta(int dia, int mes, int year) {
		boolean esCorrecta = false;
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
		return esCorrecta;
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

		esCorrecta = fechaCorrecta(dia, mes, year);

		if (esCorrecta == true) {
			System.out.printf("%d/%d/%d es correcta", dia, mes, year);
		} else {
			System.out.printf("%d/%d/%d no es correcta", dia, mes, year);
		}

	}

}
