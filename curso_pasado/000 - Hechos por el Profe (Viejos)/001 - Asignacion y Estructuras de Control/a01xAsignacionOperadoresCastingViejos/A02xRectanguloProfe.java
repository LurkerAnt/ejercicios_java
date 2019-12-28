package a01xAsignacionOperadoresCastingViejos;

import java.util.Scanner;

public class A02xRectanguloProfe {

	public static void main(String[] Args) {
		int base;
		int altura;
		int perimetro;
		int area;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe la base: ");
		base = teclado.nextInt();

		System.out.print("Escribe la altura: ");
		altura = teclado.nextInt();

		area = base * altura;
		perimetro = (int) ((base * 2) + (altura * 2));

		teclado.close();

		System.out.printf("El area es " + area + " y el perimetro es " + perimetro);
		teclado.close();
	}
}
