package asignacionOperadoresCasting;

import java.util.Scanner;

public class A5xEsfera {

	public static void main(String[] args) {

		Scanner T = new Scanner(System.in);
		int radio;
		double volumen;

		System.out.println("Dame el radio: ");
		radio = T.nextInt();

		volumen = Math.PI * Math.pow(radio, 3);

		System.out.printf("El volumen de la esfera es %.2f", volumen);

	}

}
