package a02XvariablesDecisiones;

import java.util.Scanner;

/**
 * 12. Pedir un n�mero entre 0 y 9.999 y mostrarlo con las cifras al rev�s.
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class B02xDelReves {

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
		System.out.println("El n�mero " + numAux + " al rev�s es " + reves + ".");
		teclado.close();
	}

}
