package a01XasignacionOperadoresCasting;

/**
 * 1. Programa que lea un número por teclado y escriba su cuadrado.
 * 
 * @author Dionisio Fernández Ortiz
 */

import java.util.Scanner;

public class A1xCuadrado {

	public static void main(String[] args) {
		// Creo el Scanner Teclado.
		Scanner Teclado = new Scanner(System.in);
		// Declaro variables.
		int numero, cuadrado;
		// Pido el valor del número.
		System.out.println("Introduce un número: ");
		numero = Teclado.nextInt();
		// Cálculo del cuadrado.
		cuadrado = (int) Math.pow(numero, 2);
		// Salida por pantalla del resultado.
		System.out.println("El cuadrado de " + numero + " es " + cuadrado);
		// Cierre del Scanner teclado.
		Teclado.close();
	}

}
