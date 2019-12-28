package teachermade002;

import java.util.Scanner;

public class NumeroCapicua {

	public static void main(String[] args) {

		int numero;
		int invertido;
		int unidades;
		int aux;
		int digitos;

		numero = 1234;

		aux = numero;

		digitos = 1;
		while (numero > 0) {
			numero /= 10;
			digitos++;
		}

		numero = aux; // vuelve a coger el varo que tenia porque lo hemos roto arriba
		invertido = 0; // 4321
		while (numero > 0) {
			unidades = numero % 10;
			invertido = invertido * 10 + unidades;
			numero = numero / 10;
		}

		if (numero == invertido)
			System.out.println(numero + "Si es capicua");
		else
			System.out.println(numero + "No es capicua");

	}

}
