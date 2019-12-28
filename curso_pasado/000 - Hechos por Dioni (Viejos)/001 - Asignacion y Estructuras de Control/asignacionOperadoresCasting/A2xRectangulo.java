package asignacionOperadoresCasting;

import java.util.Scanner;

public class A2xRectangulo {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int base;
		int altura;
		int perimetro;
		int area;

		System.out.println("Introduce la Base: ");
		base = T.nextInt();
		System.out.println("Introduce la Altura: ");
		altura = T.nextInt();

		perimetro = (base * 2) + (altura * 2);
		area = base * altura;

		System.out.printf("El perimetro del cuadrado es %d y el area es %d \n", perimetro, area);

	}

}
