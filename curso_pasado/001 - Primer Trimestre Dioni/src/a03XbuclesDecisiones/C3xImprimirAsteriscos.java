package a03XbuclesDecisiones;

/**
 * 23. Escriba un programa que imprima el siguiente triángulo utilizando un
 * bucle while y un bucle for: * ** *** **** ***** ****** ******* ********
 * 
 * @author LurkerAnt
 *
 */

public class C3xImprimirAsteriscos {

	public static void main(String[] args) {
		String asterisco = "";
		int contador = 10;

		while (contador >= 0) {
			asterisco = asterisco + "*";
			System.out.println(asterisco);
			contador--;
		}
	}

}
