package a01XasignacionOperadoresCasting;

import java.util.Scanner;

/**
 * 4. Repetir el programa anterior leyendo el entero de la entrada est�ndar.
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class B4xEnterScannerChar {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);

		int numero;
		char caracter;

		System.out.println("Dame un n�mero: ");
		numero = Teclado.nextInt();

		caracter = (char) numero;
		System.out.println("El n�mero " + numero + " equivale a: " + caracter);
		Teclado.close();
	}

}
