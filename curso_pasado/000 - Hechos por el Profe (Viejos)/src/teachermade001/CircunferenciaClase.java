package teachermade001;

import java.util.Scanner;

public class CircunferenciaClase {

	public static void main(String[] args) {
		int radio;
		float longitud;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el radio: ");
		radio = teclado.nextInt();

		longitud = (float) (2 * radio * Math.PI);

		teclado.close();

		System.out.println("circunferencia:" + longitud);
		System.out.println("Superficie: " + Math.PI * Math.pow((radio), 2));
		System.out.println("Volumen: " + 4 * Math.PI * Math.pow(radio, 3) / 3);
	}

}
