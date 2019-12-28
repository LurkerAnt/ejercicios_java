package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * 22. Determina si dos n�meros enteros positivos son amigos. Son amigos si la
 * suma de los divisores del primero excepto �l mismo es igual al segundo y
 * viceversa.
 * 
 * @author LurkerAnt
 *
 */

public class C2xNumerosAmigos {

	public static void main(String[] args) {
		int numero1, numero2, divisor, acumDivisor1, acumDivisor2;
		Scanner t = new Scanner(System.in);
		System.out.println("Dame el primer n�mero: ");
		numero1 = t.nextInt();
		System.out.println("Dame el segundo n�mero: ");
		numero2 = t.nextInt();
		for (acumDivisor1 = 0, acumDivisor2 = 0, divisor = 1; divisor <= numero1 / 2
				|| divisor <= numero2 / 2; divisor++) {
			if (numero1 % divisor == 0) {
				acumDivisor1 += divisor;
			}

			if (numero2 % divisor == 0) {
				acumDivisor2 += divisor;
			}
		}
		if (acumDivisor1 == numero2 && acumDivisor2 == numero1) {
			System.out.println("Los n�meros son Amigos");
		} else {
			System.out.println("Los n�meros NO son Amigos.");
		}
		t.close();
	}

}
