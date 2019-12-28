package estructurasdControl2;

import java.util.Scanner;

//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
public class A3PedirNumeroHastaNegativo {

	public static void main(String[] args) {
		int numero, contador;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		contador = 0;
		while (numero >= 0) {
			contador++;
			System.out.println();
			System.out.println("Introduce otro número: ");
			numero = T.nextInt();
			if (numero < 0) {
				System.out.printf("Se han introducido %d números positivos.", contador);
			}
		}

	}

}
