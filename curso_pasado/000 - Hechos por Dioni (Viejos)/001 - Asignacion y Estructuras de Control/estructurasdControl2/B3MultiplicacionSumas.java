package estructurasdControl2;

import java.util.Scanner;

public class B3MultiplicacionSumas {

	public static void main(String[] args) {
		int resultado, multiplicando, multiplicador, contador;
		Scanner T = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		multiplicando = T.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		multiplicador = T.nextInt();
		resultado = multiplicando;
		for (contador = 1; contador < multiplicador; contador++) {
			resultado = resultado + multiplicando;
		}
		System.out.printf("El resultado de multiplicar %d por %d es: %d", multiplicando, multiplicador, resultado);
	}

}
