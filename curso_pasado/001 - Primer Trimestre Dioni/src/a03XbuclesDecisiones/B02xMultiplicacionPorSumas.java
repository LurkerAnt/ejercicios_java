package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * 12. Calcula el producto de dos n�meros por sumas sucesivas.
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class B02xMultiplicacionPorSumas {

	public static void main(String[] args) {
		int multiplicador, multiplicando, contador, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero: ");
		multiplicador = teclado.nextInt();
		System.out.println("Dame otro n�mero: ");
		multiplicando = teclado.nextInt();
		for (contador = 0, resultado = 0; contador <= multiplicando; contador++) {
			resultado += multiplicador;
		}
		System.out.printf("El resultado de multiplicar %d por %d es %d", multiplicador, multiplicando, resultado);
		teclado.close();
	}

}
