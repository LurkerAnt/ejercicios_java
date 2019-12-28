package a01XasignacionOperadoresCasting;

import java.util.Scanner;

/**
 * 9. Programa que lee una cantidad de dinero y la desglosa en las monedas de 1,
 * 5, 10, 20 y 50 euros.
 * 
 * @author Dionisio Fernández Ortiz.
 *
 */

public class A9xDesgloseDinero {
	public static void main(String[] Args) {
		Scanner Teclado = new Scanner(System.in);
		int cantidad, cantidadAux, uno, dos, cinco, diez, veinte, cincuenta;
		// Petición de Cantidad.
		System.out.println("Dame una cantidad: ");
		cantidad = Teclado.nextInt();
		// Copia del valor de cantidad.
		cantidadAux = cantidad;
		// Desglose.
		cincuenta = cantidad / 50;
		cantidad = cantidad % 50;

		veinte = cantidad / 20;
		cantidad = cantidad % 20;

		diez = cantidad / 10;
		cantidad = cantidad % 10;

		cinco = cantidad / 5;
		cantidad = cantidad % 5;

		dos = cantidad / 2;
		cantidad = cantidad % 2;

		uno = cantidad;

		System.out.println(cantidadAux + " euro/s se desglosa/n en " + cincuenta + " billete/s de 50, " + veinte
				+ " billete/s de 20, " + diez + " billete/s de 10, " + cinco + " billete/s de 5, " + dos
				+ " moneda/s de 2, " + uno + " moneda/s de 1.");
		Teclado.close();
	}
}
