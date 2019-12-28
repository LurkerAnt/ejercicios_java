package a01XasignacionOperadoresCasting;

/**
 * 2. Programa que calcule y escriba el perímetro y el área de un rectán­gulo cuya base y altura se leen desde teclado.
 * @author Dionisio Fernández Ortiz
 */

import java.util.Scanner;

public class A2xRectangulo {

	public static void main(String[] args) {
		// Inicio del Scanner.
		Scanner Teclado = new Scanner(System.in);
		// Declaración de Variables.
		int base, altura, perimetro;
		float area;
		// Petición de datos con salida por pantañña
		System.out.println("Introduce la base: ");
		base = Teclado.nextInt();
		System.out.println("Introduce la altura: ");
		altura = Teclado.nextInt();
		// Cálculo del perímetro y salida por pantalla.
		perimetro = (base * 2) + (altura * 2);
		System.out.println("El Perímetro del rectangulo con base " + base + " y altura " + altura + " es " + perimetro);
		// Cálculo del are y salida por pantalla
		area = (base * altura) / 2f;
		System.out.println("El area del rectangulo es " + area);
		// Cierre del Scanner Teclado.
		Teclado.close();
	}

}
