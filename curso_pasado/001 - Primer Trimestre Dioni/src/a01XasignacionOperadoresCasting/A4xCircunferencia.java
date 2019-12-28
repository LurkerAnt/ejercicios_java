package a01XasignacionOperadoresCasting;

import java.util.Scanner;

/**
 * 4. Programa que calcula la longitud de una circunferencia dando su radio por
 * teclado.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */
public class A4xCircunferencia {

	public static void main(String[] args) {
		// Creo el Scanner Teclado.
		Scanner teclado = new Scanner(System.in);
		// Declaro las Variables.
		int radio;
		double diametro;
		// Se pide el valor del Radio
		System.out.println("Dame el valor del radio: ");
		radio = teclado.nextInt();
		// Calculo del diametro.
		diametro = Math.PI * (radio * 2);
		// Mostrar el resultado por pantalla.
		System.out.println("El diametro es: " + diametro);
		// Cierre del Scanner teclado.
		teclado.close();

	}

}
