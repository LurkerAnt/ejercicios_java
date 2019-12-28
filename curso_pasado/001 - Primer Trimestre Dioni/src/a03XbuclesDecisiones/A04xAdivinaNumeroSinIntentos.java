package a03XbuclesDecisiones;

/**
 * 04. 	Realizar un juego para adivinar un número. 
 * 		Para ello extrae un número aleatorio, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
 * 		El proceso termina cuando el usuario acierta.
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class A04xAdivinaNumeroSinIntentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAdv, intentos;
		numAdv = (int) (Math.random() * 100);
		System.out.println(numAdv);
		System.out.println("Dame un número: ");
		numero = teclado.nextInt();
		intentos = 1;
		while (numero != numAdv) {
			if (numero < numAdv) {
				System.out.println("El número es mayor.");
			} else if (numero > numAdv) {
				System.out.println("El número es menor.");
			}
			System.out.println("Dame otro número: ");
			numero = teclado.nextInt();
			intentos++;
		}
		System.out.println("¡Has acertado!");
		System.out.printf("Has necesitado %d intentos.", intentos);
		teclado.close();
	}

}
