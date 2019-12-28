package estructurasdControl1;

import java.util.Scanner;

public class B7DiasEntreFechas {

	public static void main(String[] args) {

		Scanner T = new Scanner(System.in);
		int dia, mes, year, dia1, mes1, year1, diasTotales;
		System.out.println("Introduce el primer día: ");
		dia = T.nextInt();
		if (dia > 30 || dia < 0) {
			System.out.println("Dia incorrecto, vuelva a introducirlo: ");
			dia = T.nextInt();
		}
		System.out.println("Introduce el primer mes: ");
		mes = T.nextInt();
		if (mes > 12 || mes < 0) {
			System.out.println("Mes incorrecto, vuelva a introducirlo: ");
			mes = T.nextInt();
		}
		System.out.println("Introduce el primer año: ");
		year = T.nextInt();

		System.out.println("Introduce el segundo día: ");
		dia1 = T.nextInt();
		if (dia1 > 30 || dia1 < 0) {
			System.out.println("Dia incorrecto, vuelva a introducirlo: ");
			dia1 = T.nextInt();
		}
		System.out.println("Introduce el segundo mes: ");
		mes1 = T.nextInt();
		if (mes1 > 12 || mes1 < 0) {
			System.out.println("Mes incorrecto, vuelva a introducirlo: ");
			mes1 = T.nextInt();
		}
		System.out.println("Introduce el segundo año: ");
		year1 = T.nextInt();

		if (dia == dia1 && mes == mes1 && year == year1) {
			System.out.println("Son el mismo día. No hay ningún día de diferencia.");
		}

		diasTotales = 0;
		if (year == year1) {
			diasTotales += 0;
		} else {
			if (year > year1) {
				diasTotales += (year - year1) * 360;
			} else {
				diasTotales += (year1 - year) * 360;
			}
		}
		if (mes == mes1) {
			diasTotales += 0;
		} else {
			if (mes > mes1) {
				if ((mes - mes1) > 1) {
					diasTotales = diasTotales + ((mes - mes1) * 30);
				} else {
					if ((mes1 - mes) > 1) {
						diasTotales = diasTotales + ((mes1 - mes) * 30);
					}
				}
			}
		}
		if (dia == dia1) {
			diasTotales += 0;
		} else {
			if (dia < dia1) {
				diasTotales += dia1 - dia;
			} else {
				diasTotales += dia - dia1;
			}
		}

		System.out.printf("Entre las fechas %d/%d/%d y %d/%d/%d hay %d días de diferencia.", dia, mes, year, dia1, mes1,
				year1, diasTotales);

	}
}
