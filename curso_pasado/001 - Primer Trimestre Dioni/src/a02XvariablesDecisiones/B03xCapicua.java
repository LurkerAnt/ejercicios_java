package a02XvariablesDecisiones;

/**
 * 13. Pedir un n�mero entre 0 y 9.999, decir si es capic�a. 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class B03xCapicua {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAux, unidades, decenas, centenas, miles, reves;
		System.out.println("Dame un n�mero entre 0 y 9999: ");
		numero = teclado.nextInt();
		numAux = numero;
		unidades = numero % 10;
		numero = numero / 10;
		decenas = numero % 10;
		numero = numero / 10;
		centenas = numero % 10;
		numero = numero / 10;
		miles = numero;
		reves = (unidades * 1000) + (decenas * 100) + (centenas * 10) + miles;
		if (numAux == reves) {
			System.out.println("El n�mero " + numAux + " es capic�a.");
		} else {
			System.out.println("No es capic�a.");
		}
		teclado.close();
	}

}
