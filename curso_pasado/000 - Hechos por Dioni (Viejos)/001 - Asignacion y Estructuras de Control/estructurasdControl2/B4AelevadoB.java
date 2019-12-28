package estructurasdControl2;

import java.util.Scanner;

public class B4AelevadoB {

	public static void main(String[] args) {
		int numero, potencia, resultado, cont;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		numero = T.nextInt();
		System.out.println("Introduce la potencia: ");
		potencia = T.nextInt();
		resultado = numero;
		for (cont = 1; cont < potencia; cont++) {
			resultado = resultado * numero;
		}
		System.out.printf("%d elevado a %d es %d.", numero, potencia, resultado);
	}

}
