package a02XvariablesDecisiones;

import java.util.Scanner;

public class A03xCualEsMayor {

	public static void main(String[] args) {
		// Inicio del scanner.
		Scanner teclado = new Scanner(System.in);
		// Declaraci�n de variables
		int num1, num2;
		// Petici�n de los valores
		System.out.println("Dame un n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro n�mero: ");
		num2 = teclado.nextInt();
		// Tratamiento de la informaci�n y salida por pantalla
		if (num1 > num2)
			System.out.println("El n�mero " + num1 + " es mayor que el " + num2);
		else if (num2 > num1)
			System.out.println("El n�mero " + num2 + " es mayor que el " + num1);
		// Cierre del scanner.
		teclado.close();
	}

}
