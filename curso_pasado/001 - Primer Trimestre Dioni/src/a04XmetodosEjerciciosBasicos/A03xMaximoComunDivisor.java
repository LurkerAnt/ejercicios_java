package a04XmetodosEjerciciosBasicos;

import java.util.Scanner;

/**
 * 3. Calcular el máximo común divisor por el “Algoritmo de Euclides”. Consiste
 * en: Dividir el mayor por el menor. Dividir el divisor por el resto. Seguir
 * dividiendo el último divisor por el último resto hasta que la división sea
 * exacta. El último divisor es el máximo común divisor.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class A03xMaximoComunDivisor {

	public static int cualMayor(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int cualMenor(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int maximoComunDivisor(int num1, int num2) {
		int mCD, mayor, menor, resto, divisor;
		mayor = cualMayor(num1, num2);
		menor = cualMenor(num1, num2);
		mCD = 0;
		resto = mayor % menor;
		divisor = menor;
		while (resto != 0) {
			mCD = divisor / resto;
			resto = divisor % resto;
		}

		return mCD;
	}

	public static void main(String[] args) {
		int numero1, numero2, maximoCD;
		Scanner t = new Scanner(System.in);
		System.out.println("Dame el primer número: ");
		numero1 = t.nextInt();
		System.out.println("Dame el segundo número: ");
		numero2 = t.nextInt();
		maximoCD = 0;
		maximoComunDivisor(numero1, numero2);
		System.out.printf("El maximo común divisor es %d.", maximoCD);
		t.close();
	}

}
