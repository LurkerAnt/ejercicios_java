package teachermade001;

import java.util.Scanner;

public class DesgloseClase {

	public static void main(String[] args) {
		scannner teclado = new scanner(sytem.In);
		int numero;
		int unidades;
		int decenas;
		int centenas;
		int miles;
		int auxiliar;
		System.out.println("Da el valor del número: ");
		numero = teclado.nextInt(); // 9756

		/*
		 * unidades= 9756 % 10 = 6 decenas % 10 % 10 = 5 (mal) 9756/10=975%10=5 (bien,
		 * unicamente coge numeros enteros por lo que dividiendo te cargas las unidades.
		 * esto implica que puede crear un bucle y automatizarlo.
		 *
		 */

		auxiliar = numero;

		unidades = numero % 10; // 6
		numero = numero / 10; // 975

		decenas = numero % 10; // 5
		numero = numero / 10; // 97

		centenas = numero % 10; // 7
		numero = numero / 10; // 9

		miles = numero % 10; // 9
		numero = numero / 10; // 0 esto esta mal

		teclado.close();

		System.out.println("El número " + auxiliar + " se desglosa en:");
		System.out.println("\t" + unidades + " unidades.");
		System.out.println("\t" + decenas + " decenas.");
		System.out.println("\t" + centenas + " centenas.");
		System.out.println("\t" + miles + " unidades de mil.");
	}

}
