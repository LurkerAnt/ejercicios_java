package a03XbuclesDecisiones;

/**
 *3. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 * @author Dionisio Fernández Ortiz
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
			System.out.println("Dame un número: ");
			numero = teclado.nextInt();
			contador++;
		}
		System.out.printf("Se han introducido %d números en total.", contador);
		teclado.close();
	}

}
