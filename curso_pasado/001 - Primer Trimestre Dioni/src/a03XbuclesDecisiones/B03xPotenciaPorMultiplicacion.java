package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * 13. Calcula A elevado a B por productos sucesivos. Ampl�alo para n�meros + y
 * -).
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */
public class B03xPotenciaPorMultiplicacion {
	public static void main(String[] Args) {
		int numero, potencia, resultado, contador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		System.out.println("Dame la potencia: ");
		potencia = teclado.nextInt();
		resultado = numero;
		for (contador = 1; contador <= potencia; contador++) {
			resultado *= numero;
		}
		System.out.printf("%d elevado a %d es %d", numero, potencia, resultado);
		teclado.close();
	}
}
