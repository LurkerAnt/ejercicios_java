package a02XvariablesDecisiones;

/**
 * 17. Pedir dos fechas y mostrar el n�mero de d�as que hay de diferencia. Suponiendo todos los meses de 30 d�as. 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class B07xDiferenciaFechas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, year, diferencia, dia2, mes2, year2, diferenciaYear;
		System.out.println("Dame el primer d�a: ");
		dia = teclado.nextInt();
		System.out.println("Dame el primer mes: ");
		mes = teclado.nextInt();
		System.out.println("Dame el primer a�o: ");
		year = teclado.nextInt();
		System.out.println("Dame el segundo d�a: ");
		dia2 = teclado.nextInt();
		System.out.println("Dame el segundo mes: ");
		mes2 = teclado.nextInt();
		System.out.println("Dame el segundo a�o: ");
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

		System.out.printf("Hay %d d�as de diferencia.", diferencia);
		teclado.close();
	}

}
