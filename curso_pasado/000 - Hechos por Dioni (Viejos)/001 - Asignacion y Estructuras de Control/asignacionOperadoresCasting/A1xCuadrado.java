package asignacionOperadoresCasting;

import java.util.Scanner;

public class A1xCuadrado {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int numero;
		int cuadrado;

		System.out.println("Introduce un Número: ");
		numero = T.nextInt();

		cuadrado = (int) Math.pow(numero, 2);

		System.out.printf("El cuadrado de %d es %d \n", numero, cuadrado);
	}

}
