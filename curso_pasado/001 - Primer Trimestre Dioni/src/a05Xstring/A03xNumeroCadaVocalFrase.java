package a05Xstring;

import java.util.Scanner;

public class A03xNumeroCadaVocalFrase {
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

	public static boolean comprobarQueEsVocal(String vocales, char letra) {
		boolean esVocal = false;
		for (int indice = 0; indice < vocales.length(); indice++) {
			if (vocales.charAt(indice) == letra) {
				esVocal = true;
			}
		}
		return esVocal;
	}

	public static int comprobarCuantasVocalesSueltas(String frase, char letra) {
		int contVocal = 0;
		for (int indice = 0; indice < frase.length(); indice++) {
			if (frase.charAt(indice) == letra) {
				contVocal++;
			}
		}
		return contVocal;
	}

	public static void main(String[] args) {
		String frase, vocales;
		char vocal;
		int numVocales;
		int a, e, i, o, u;
		a = e = i = o = u = 0;
		// boolean esVocal = false;
		vocales = "AaEeIiOoUu";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();

		// System.out.println("Que vocal quieres comprobar: ");
		// vocal = teclado.next().charAt(0);
		// while (esVocal == false) {
		// esVocal = comprobarQueEsVocal(vocales, vocal);
		// if (esVocal == false) {
		// System.out.println("El caracter no era una vocal, que vocal quieres
		// comprobar: ");
		// vocal = teclado.next().charAt(0);
		// }
		// }
		for (int indice = 0; indice < vocales.length(); indice++) {
			vocal = vocales.charAt(indice);
			switch (vocal) {
			case 'A':
				a += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'a':
				a += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'E':
				e += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'e':
				e += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'I':
				i += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'i':
				i += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'O':
				o += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'o':
				o += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'U':
				u += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			case 'u':
				u += comprobarCuantasVocalesSueltas(frase, vocal);
				break;
			}
		}
		System.out.printf("Esta frase contine %d A\n", a);
		System.out.printf("Esta frase contine %d E\n", e);
		System.out.printf("Esta frase contine %d I\n", i);
		System.out.printf("Esta frase contine %d O\n", o);
		System.out.printf("Esta frase contine %d U\n", u);

		numVocales = numeroVecesVocal(frase, vocales);
		System.out.printf("Esta frase contiene %d vocales en total", numVocales);
		teclado.close();

	}

}
