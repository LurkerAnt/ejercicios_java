package a01XasignacionOperadoresCasting;

/**
 * 2. Programa que calcule y escriba el per�metro y el �rea de un rect�n�gulo cuya base y altura se leen desde teclado.
 * @author Dionisio Fern�ndez Ortiz
 */

import java.util.Scanner;

public class A2xRectangulo {

	public static void main(String[] args) {
		// Inicio del Scanner.
		Scanner Teclado = new Scanner(System.in);
		// Declaraci�n de Variables.
		int base, altura, perimetro;
		float area;
		// Petici�n de datos con salida por panta��a
		System.out.println("Introduce la base: ");
		base = Teclado.nextInt();
		System.out.println("Introduce la altura: ");
		altura = Teclado.nextInt();
		// C�lculo del per�metro y salida por pantalla.
		perimetro = (base * 2) + (altura * 2);
		System.out.println("El Per�metro del rectangulo con base " + base + " y altura " + altura + " es " + perimetro);
		// C�lculo del are y salida por pantalla
		area = (base * altura) / 2f;
		System.out.println("El area del rectangulo es " + area);
		// Cierre del Scanner Teclado.
		Teclado.close();
	}

}
