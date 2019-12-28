package a01XasignacionOperadoresCasting;

import java.util.Scanner;

/**
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class A7xIntercambioValores {
	public static void main(String[] Args) {
		// Creación del Scanner "Teclado".
		Scanner Teclado = new Scanner(System.in);
		// Declaración de variables.
		int x, y, z;
		// Petición de datos.
		System.out.println("Dame el valor de X: ");
		x = Teclado.nextInt();
		System.out.println("Dame el valor de Y: ");
		y = Teclado.nextInt();
		// Resolución de problema.
		z = x;
		x = y;
		y = z;
		// Salida por pantalla.
		System.out.println("El valor de X es " + x + " y el valor de Y es " + y);
		// Cierre de Teclado.
		Teclado.close();
	}
}
