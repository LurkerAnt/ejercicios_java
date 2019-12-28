package estructurasdControl1;

import java.util.Scanner;

//Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 d�as. Con a�os bisiestos. 
public class B5PedirFechaCorrecta {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int dia, mes, year;
		boolean esCorrecta = false;
		System.out.println("Introduce el d�a: ");
		dia = T.nextInt();
		System.out.println("Introduce el mes: ");
		mes = T.nextInt();
		System.out.println("Introduce el a�o: ");
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

	}

}
