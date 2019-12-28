package a01XasignacionOperadoresCasting;

import java.util.Scanner;

/**
 * 8. Programa que lee una cantidad menor de 10000 y la desglosa en unidades,
 * decenas, centenas y unidades de mil
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class A8xDesgloseCantidad {
	public static void main(String[] Args) {
		// Creación de Scanner Teclado
		Scanner Teclado = new Scanner(System.in);
		// Declaración de variables
		int cantidad, cantidadAux, unidades, decenas, centenas, miles;
		// Petición de Cantidad.
		System.out.println("Dame una cantidad: ");
		cantidad = Teclado.nextInt();
		// Control para comprobar que no pase de 10000
		if (cantidad > 10000) {
			System.out.println("Cantidad muy alta, dame otra cantidad: ");
			cantidad = Teclado.nextInt();
		}
		// Se almacena el número en una variable auxiliar para utilizarlo luego y no
		// perderlo
		cantidadAux = cantidad;
		// Desglose
		unidades = cantidad % 10;
		cantidad = cantidad / 10;

		decenas = cantidad % 10;
		cantidad = cantidad / 10;

		centenas = cantidad % 10;
		cantidad = cantidad / 10;

		miles = cantidad % 10;
		// Salida por pantalla
		System.out.println("La cantidad " + cantidadAux + " se desglosa en " + unidades + " unidades, " + decenas
				+ " decenas, " + centenas + " centenas, " + miles + " unidades de mil.");
		// Cierre de Scanner.
		Teclado.close();
	}
}
