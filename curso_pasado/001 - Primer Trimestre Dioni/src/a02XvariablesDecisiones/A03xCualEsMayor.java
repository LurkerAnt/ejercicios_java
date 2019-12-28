package a02XvariablesDecisiones;

import java.util.Scanner;

public class A03xCualEsMayor {

	public static void main(String[] args) {
		// Inicio del scanner.
		Scanner teclado = new Scanner(System.in);
		// Declaración de variables
		int num1, num2;
		// Petición de los valores
		System.out.println("Dame un número: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro número: ");
		num2 = teclado.nextInt();
		// Tratamiento de la información y salida por pantalla
		if (num1 > num2)
			System.out.println("El número " + num1 + " es mayor que el " + num2);
		else if (num2 > num1)
			System.out.println("El número " + num2 + " es mayor que el " + num1);
		// Cierre del scanner.
		teclado.close();
	}

}
