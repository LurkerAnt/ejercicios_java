package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * 12. Calcula el producto de dos números por sumas sucesivas.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class B02xMultiplicacionPorSumas {

	public static void main(String[] args) {
		int multiplicador, multiplicando, contador, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número: ");
		multiplicador = teclado.nextInt();
		System.out.println("Dame otro número: ");
		multiplicando = teclado.nextInt();
		for (contador = 0, resultado = 0; contador <= multiplicando; contador++) {
			resultado += multiplicador;
		}
		System.out.printf("El resultado de multiplicar %d por %d es %d", multiplicador, multiplicando, resultado);
		teclado.close();
	}

}
