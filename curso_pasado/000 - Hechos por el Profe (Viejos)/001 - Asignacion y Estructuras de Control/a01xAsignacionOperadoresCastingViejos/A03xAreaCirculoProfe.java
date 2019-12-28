package a01xAsignacionOperadoresCastingViejos;

import java.util.Scanner;

public class A03xAreaCirculoProfe {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int radio;
		double superficie;

		System.out.println("Introduce el Radio: ");
		radio = t.nextInt();

		superficie = Math.PI * Math.pow(radio, 2);

		System.out.printf("La superficie del circulo es %f", superficie);
		t.close();

		/*
		 * double radio; double pi; double area; double perimetro;
		 * 
		 * pi = 3.1416;
		 * 
		 * Scanner teclado = new Scanner (System.in);
		 * 
		 * System.out.print( "Escribe el radio: "); radio = teclado.nextInt();
		 * 
		 * perimetro = 2*pi*radio; area = pi * (radio * radio);
		 * 
		 * teclado.close();
		 * 
		 * System.out.println(" El area es " + area + " y el perímetro es " +
		 * perimetro);
		 */
	}

}
