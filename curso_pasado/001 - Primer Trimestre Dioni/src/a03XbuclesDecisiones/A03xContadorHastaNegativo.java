package a03XbuclesDecisiones;

/**
 *3. Pedir n�meros hasta que se teclee uno negativo, y mostrar cu�ntos n�meros se han introducido.
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class A03xContadorHastaNegativo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador;
		numero = 0;
		contador = 0;
		while (numero >= 0) {
			System.out.println("Dame un n�mero: ");
			numero = teclado.nextInt();
			contador++;
		}
		System.out.printf("Se han introducido %d n�meros en total.", contador);
		teclado.close();
	}

}
