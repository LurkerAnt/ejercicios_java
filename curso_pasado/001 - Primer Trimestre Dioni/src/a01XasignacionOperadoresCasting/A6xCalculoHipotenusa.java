package a01XasignacionOperadoresCasting;

import java.util.Scanner;

public class A6xCalculoHipotenusa {
	/**
	 * 6. Programa que calcule la hipotenusa de un tri�ngulo rect�ngulo cuyos
	 * catetos se dan por teclado.
	 * 
	 * @author Dionisio Fern�ndez Ortiz
	 *
	 */
	public static void main(String[] Args) {
		Scanner Teclado = new Scanner(System.in);
		// Creo el Scanner "Teclado" para poder introducir la informaci�n en las
		// variables y trabajar.
		int cateto1, cateto2;
		double hipotenusa;
		// Defino las variables para trabajar. Hipotenusa va a ser como m�nimo entero
		// asique se define como double.
		System.out.println("Dame el valor de el primer cateto: ");
		cateto1 = Teclado.nextInt();
		// Se pide el valor de el primer cateto.
		System.out.println("Dame el valor de el segundo cateto: ");
		cateto2 = Teclado.nextInt();
		// Se pide el valor del segundo cateto.
		hipotenusa = Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
		// C�lculo de la hipotenusa mediante el uso de Math.
		/*
		 * Otra manera de hacer la ra�z cuadrada, esta formula permite calcular tambien
		 * cuando se hacen cosas al cubo etc. hipotenusa = Math.pow((cateto1 * cateto1)
		 * + (Math.pow(cateto2, 2)), 0.5);
		 */
		System.out.println("La hipotenusa es: " + hipotenusa);
		// Se muestra el resultado por pantalla.
		Teclado.close();
		// Cierre del Scanner Teclado.
	}
}
