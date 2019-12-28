package asignacionOperadoresCasting;

import java.util.Scanner;

public class A3xCirculo {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int radio;
		double superficie;

		System.out.println("Introduce el Radio: ");
		radio = T.nextInt();

		superficie = Math.PI * Math.pow(radio, 2);

		System.out.printf("La superficie del circulo es %f", superficie);
	}

}
