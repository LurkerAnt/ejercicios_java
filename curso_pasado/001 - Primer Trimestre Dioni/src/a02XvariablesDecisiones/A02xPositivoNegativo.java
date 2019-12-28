package a02XvariablesDecisiones;

import java.util.Scanner;

/**
 * 2. Pedir un número por teclado y decir si es positivo o negativo.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class A02xPositivoNegativo {

	public static void main(String[] args) {
		// Iniciación del scanner
		Scanner teclado = new Scanner(System.in);
		// Declaración de variables.
		int numero;
		// Petición de información
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		// Tratamiento de información.
		if (numero < 0)
			System.out.println("El número es negativo.");
		else if (numero > 0)
			System.out.println("El número es positivo.");
		else if (numero == 0)
			System.out.println("El número no es ni positivo, ni negativo");
		// Cierre de Scanner.
		teclado.close();
	}

}
