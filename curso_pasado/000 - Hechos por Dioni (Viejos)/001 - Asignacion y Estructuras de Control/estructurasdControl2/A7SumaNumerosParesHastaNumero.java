package estructurasdControl2;

import java.util.Scanner;

//Calcula la suma de los N primeros números pares enteros positivos.

public class A7SumaNumerosParesHastaNumero {

	public static void main(String[] args) {
		int numero, sumatorio, numEntero;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		numEntero = 0;
		sumatorio = 0;
		while (numEntero <= numero) {
			if (numEntero % 2 == 0) {
				sumatorio += numEntero;
			}
			numEntero++;
		}
		System.out.printf("La suma de los numeros pares hasta %d valen %d", numero, sumatorio);
	}

}
