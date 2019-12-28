package a02XvariablesDecisiones;

import java.util.Scanner;

/**
 * 2. Pedir un n�mero por teclado y decir si es positivo o negativo.
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class A02xPositivoNegativo {

	public static void main(String[] args) {
		// Iniciaci�n del scanner
		Scanner teclado = new Scanner(System.in);
		// Declaraci�n de variables.
		int numero;
		// Petici�n de informaci�n
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		// Tratamiento de informaci�n.
		if (numero < 0)
			System.out.println("El n�mero es negativo.");
		else if (numero > 0)
			System.out.println("El n�mero es positivo.");
		else if (numero == 0)
			System.out.println("El n�mero no es ni positivo, ni negativo");
		// Cierre de Scanner.
		teclado.close();
	}

}
