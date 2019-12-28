package a02XvariablesDecisiones;

/**
 * 17. Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días. 
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B07xDiferenciaFechas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, year, diferencia, dia2, mes2, year2, diferenciaYear;
		System.out.println("Dame el primer día: ");
		dia = teclado.nextInt();
		System.out.println("Dame el primer mes: ");
		mes = teclado.nextInt();
		System.out.println("Dame el primer año: ");
		year = teclado.nextInt();
		System.out.println("Dame el segundo día: ");
		dia2 = teclado.nextInt();
		System.out.println("Dame el segundo mes: ");
		mes2 = teclado.nextInt();
		System.out.println("Dame el segundo año: ");
		year2 = teclado.nextInt();
		diferencia = 0;

		if (year == year2) {
			diferencia += 0;
		} else if (year > year2) {
			diferenciaYear = year - year2;
			if (diferenciaYear == 1) {
				diferencia = (30 - dia2) + dia;
				diferencia += ((12 - mes2) + mes) * 30;
			} else if (diferenciaYear > 1) {
				diferencia = (diferenciaYear - 1) * 360;
				diferencia += (30 - dia2) + dia;
				diferencia += ((12 - mes2) + mes) * 30;
			}
		} else if (year2 > year) {
			diferenciaYear = year2 - year;
			if (diferenciaYear == 1) {
				diferencia = (30 - dia) + dia2;
				diferencia += ((12 - mes) + mes2) * 30;
			} else if (diferenciaYear > 1) {
				diferencia = (diferenciaYear - 1) * 360;
				diferencia += (30 - dia) + dia2;
				diferencia += ((12 - mes) + mes2) * 30;
			}
		}

		System.out.printf("Hay %d días de diferencia.", diferencia);
		teclado.close();
	}

}
