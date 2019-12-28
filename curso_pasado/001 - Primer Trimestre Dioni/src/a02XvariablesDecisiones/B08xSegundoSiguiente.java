package a02XvariablesDecisiones;

/**
 * 18. Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B08xSegundoSiguiente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int segundos, minutos, horas;
		System.out.println("Dame los segundos: ");
		segundos = teclado.nextInt();
		System.out.println("Dame los minutos: ");
		minutos = teclado.nextInt();
		System.out.println("Dame las horas: ");
		horas = teclado.nextInt();

		if (segundos >= 60) {
			minutos += (segundos / 60);
			segundos = segundos % 60;
		}
		if (minutos >= 60) {
			horas += (segundos / 60);
			minutos = minutos % 60;
		}
		if (horas > 24) {
			horas = horas % 24;
		}

		System.out.printf("Son las %d:%d:%d.", horas, minutos, segundos);

		segundos++;

		if (segundos >= 60) {
			minutos += (segundos / 60);
			segundos = segundos / 60;
		}
		if (minutos >= 60) {
			horas += (minutos / 60);
			minutos = minutos / 60;
		}
		if (horas > 24) {
			horas = horas / 24;
		}

		System.out.printf(" El segundo siguiente es %d:%d:%d.", horas, minutos, segundos);
		teclado.close();
	}

}
