package a01XasignacionOperadoresCasting;

import java.util.Scanner;

/**
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */
public class A7xIntercambioValores {
	public static void main(String[] Args) {
		// Creaci�n del Scanner "Teclado".
		Scanner Teclado = new Scanner(System.in);
		// Declaraci�n de variables.
		int x, y, z;
		// Petici�n de datos.
		System.out.println("Dame el valor de X: ");
		x = Teclado.nextInt();
		System.out.println("Dame el valor de Y: ");
		y = Teclado.nextInt();
		// Resoluci�n de problema.
		z = x;
		x = y;
		y = z;
		// Salida por pantalla.
		System.out.println("El valor de X es " + x + " y el valor de Y es " + y);
		// Cierre de Teclado.
		Teclado.close();
	}
}
