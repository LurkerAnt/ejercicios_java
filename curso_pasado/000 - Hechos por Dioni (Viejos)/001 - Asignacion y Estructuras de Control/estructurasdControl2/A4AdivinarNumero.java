package estructurasdControl2;

import java.util.Scanner;

//Realizar un juego para adivinar un n�mero.
//Para ello extrae un n�mero aleatorio, y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N.
//El proceso termina cuando el usuario acierta.
public class A4AdivinarNumero {

	public static void main(String[] args) {
		int numRandom, numero;
		double dobleRandom;
		Scanner T = new Scanner(System.in);

		dobleRandom = Math.random();
		dobleRandom = (dobleRandom * 100);
		numRandom = (int) dobleRandom + 1;
		System.out.println(numRandom);
		System.out.println("Introduce un n�mero entre 1 y 100: ");
		numero = T.nextInt();

		while (numero != numRandom) {
			if (numero > numRandom) {
				System.out.println("Menor");
			}
			if (numero < numRandom) {
				System.out.println("Mayor");
			}
			System.out.println("Introduce Otro n�mero: ");
			numero = T.nextInt();
		}
		if (numero == numRandom) {
			System.out.println("N�mero correcto!!!");
		}
	}

}
