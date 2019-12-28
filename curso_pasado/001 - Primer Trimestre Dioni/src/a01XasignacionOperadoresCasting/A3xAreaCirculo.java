package a01XasignacionOperadoresCasting;

import java.util.Scanner;

/**
 * 3. Programa que calcula la superficie de un círculo dando su radio por
 * teclado.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class A3xAreaCirculo {

	public static void main(String[] args) {
		// Creación del Scanner Teclado
		Scanner Teclado = new Scanner(System.in);
		// Declaración de Variables.
		int radio;
		double area;
		// Pido el valor de las variables.
		System.out.println("Introduce el Radio del Circulo: ");
		radio = Teclado.nextInt();
		// Cálculo del area.
		area = Math.PI * Math.pow(radio, 2);
		// Salida por pantalla.
		System.out.println("El Area del circulo con Radio " + radio + " es " + area);
		// Cierre del Scanner Teclado.
		Teclado.close();

	}

}
