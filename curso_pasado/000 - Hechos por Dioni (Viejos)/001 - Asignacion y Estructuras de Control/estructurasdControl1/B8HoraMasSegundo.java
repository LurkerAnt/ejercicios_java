package estructurasdControl1;

import java.util.Scanner;

public class B8HoraMasSegundo {

	public static void main(String[] args) {

		int hora, minuto, segundo;
		Scanner T = new Scanner(System.in);

		System.out.println("Introduce una hora: ");
		hora = T.nextInt();
		if (hora > 24 || hora < 0) {
			System.out.println("Hora incorrecta, vuelve a introducirla: ");
			hora = T.nextInt();
		}
		System.out.println("Introduce los minutos: ");
		minuto = T.nextInt();
		if (minuto >= 60 || minuto < 0) {
			System.out.println("Minutos incorrectos, vuelve a introducirlos: ");
			minuto = T.nextInt();
		}
		System.out.println("Introduce los segundos: ");
		segundo = T.nextInt();
		if (segundo >= 60 || segundo < 0) {
			System.out.println("Segundos incorrectos, vuelve a introducirlos: ");
			segundo = T.nextInt();
		}
		segundo++;
		if (segundo >= 60) {
			segundo = 00;
			minuto++;
			if (minuto >= 60) {
				minuto = 00;
				hora++;
				if (hora > 24) {
					hora = 00;
				}
			}
		}

		System.out.printf("La hora es %d:%d:%d", hora, minuto, segundo);
	}

}
