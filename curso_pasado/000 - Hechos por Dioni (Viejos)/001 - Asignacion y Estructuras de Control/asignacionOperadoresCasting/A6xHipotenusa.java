package asignacionOperadoresCasting;

import java.util.Scanner;

public class A6xHipotenusa {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int cateto1, cateto2;
		double hipotenusa;

		System.out.println("Introduce el valor del primer cateto: ");
		cateto1 = T.nextInt();
		System.out.println("Introduce el valor del segundo cateto: ");
		cateto2 = T.nextInt();

		hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		hipotenusa = Math.sqrt(hipotenusa);

		System.out.printf("La hipotenusa es %.3f", hipotenusa);
	}

}
