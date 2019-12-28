package a03XbuclesDecisiones;

import java.util.Scanner;

/**
 * 24. Escribe un programa que lea un número N y realice el siguiente dibujo
 * (Ej: suponiendo N igual a 4): +*** *+** **+* ***+
 * 
 * @author LurkerAnt
 *
 */
public class C4xSacaDibujoUno {

	public static void main(String[] args) {
		Scanner df = new Scanner(System.in);

		int fila;
		int numeroFilas;
		int numeroColumnas;

		System.out.println("Da un numero de filas: ");
		numeroFilas = df.nextInt();

		numeroColumnas = numeroFilas;
		for (fila = 0; fila < numeroFilas; fila++) {
			System.out.println();

			for (int columnas = 0; columnas < numeroColumnas; columnas++) {
				if (fila == columnas)
					System.out.print(" +");
				else
					System.out.print(" *");
			}

		}
		df.close();

	}

}
