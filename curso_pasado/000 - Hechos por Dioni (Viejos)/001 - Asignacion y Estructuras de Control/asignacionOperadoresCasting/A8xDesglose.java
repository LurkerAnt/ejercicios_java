//8.	Programa que lee una cantidad menor de 10000 y la desglosa en unidades, decenas, centenas y unidades de mil.

package asignacionOperadoresCasting;

import java.util.Scanner;

public class A8xDesglose {

	public static int unidades(int num1) {
		num1 = num1 % 10;
		return num1;
	}

	public static int dividir(int num1) {
		num1 = num1 / 10;
		return num1;
	}

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int Numero, units, decenas, centenas, miles, numeroAux;

		System.out.println("Introduce un número: ");
		Numero = T.nextInt();

		if (Numero > 10000) {
			System.out.println("Número demasiado grande, introduce otro número: ");
			Numero = T.nextInt();
		}
		numeroAux = Numero;
		units = unidades(Numero);
		Numero = dividir(Numero);

		decenas = unidades(Numero);
		Numero = dividir(Numero);

		centenas = unidades(Numero);
		Numero = dividir(Numero);

		miles = unidades(Numero);
		Numero = dividir(Numero);

		System.out.printf("El numero %d se descompone en: %d unidades, %d decenas, %d centenas y %d unidades de mil.",
				numeroAux, units, decenas, centenas, miles);

	}

}
