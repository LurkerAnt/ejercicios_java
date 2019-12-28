package estructurasdControl2;

import java.util.Scanner;

public class A6SumaEnterosHastaNumero {

	public static void main(String[] args) {
		int numero, sumatorio, numEntero;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		numero = T.nextInt();
		numEntero = 0;
		sumatorio = 0;
		while (numEntero <= numero) {
			sumatorio += numEntero;
			numEntero++;
		}
		System.out.printf("La suma de los numeros enteros hasta %d valen %d", numero, sumatorio);
	}

}
