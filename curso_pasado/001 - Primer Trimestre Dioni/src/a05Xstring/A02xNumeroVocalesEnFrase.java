package a05Xstring;

/**
 * 2. Escribe un programa que nos diga cuantas vocales hay en una cadena que el usuario introduce por teclado.
 * @author Dionisio Fernández Ortiz
 */

import java.util.Scanner;

public class A02xNumeroVocalesEnFrase {
	public static int numeroVecesVocal(String frase, String vocales) {
		int contVocales = 0;
		for (int indice = 0; indice < frase.length(); indice++) {
			for (int indice2 = 0; indice2 < vocales.length(); indice2++) {
				if (frase.charAt(indice) == vocales.charAt(indice2)) {
					contVocales++;
				}
			}
		}
		return contVocales;
	}

	public static void main(String[] args) {
		String frase, vocales;
		vocales = "AaEeIiOoUu";
		int numVocales;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();
		numVocales = numeroVecesVocal(frase, vocales);
		System.out.printf("Esta frase contiene %d vocales", numVocales);
		teclado.close();

	}

}
