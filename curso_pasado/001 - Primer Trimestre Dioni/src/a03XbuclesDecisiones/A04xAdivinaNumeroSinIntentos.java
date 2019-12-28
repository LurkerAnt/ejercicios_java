package a03XbuclesDecisiones;

/**
 * 04. 	Realizar un juego para adivinar un n�mero. 
 * 		Para ello extrae un n�mero aleatorio, y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N. 
 * 		El proceso termina cuando el usuario acierta.
 * @author Dionisio Fern�ndez Ortiz
 *
 */

import java.util.Scanner;

public class A04xAdivinaNumeroSinIntentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, numAdv, intentos;
		numAdv = (int) (Math.random() * 100);
		System.out.println(numAdv);
		System.out.println("Dame un n�mero: ");
		numero = teclado.nextInt();
		intentos = 1;
		while (numero != numAdv) {
			if (numero < numAdv) {
				System.out.println("El n�mero es mayor.");
			} else if (numero > numAdv) {
				System.out.println("El n�mero es menor.");
			}
			System.out.println("Dame otro n�mero: ");
			numero = teclado.nextInt();
			intentos++;
		}
		System.out.println("�Has acertado!");
		System.out.printf("Has necesitado %d intentos.", intentos);
		teclado.close();
	}

}
