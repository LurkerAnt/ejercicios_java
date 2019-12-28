package asignacionOperadoresCasting;

import java.util.Scanner;

public class A1xHolaMundoCuadrado {

	public static void main(String[] args) {
		// System.out.println("Hola Mundo!!!");
		// entorno
		Scanner teclado = new Scanner(System.in);
		int base, altura;
		float area;
		// inicio
		// entrada
		System.out.println("Valor de la base: ");
		base = teclado.nextInt();
		System.out.println("Valor de la altura: ");
		altura = teclado.nextInt();
		// procceso
		area = base * altura / 2f;
		// el 2f es para convertir el 2 en float y que si en el resultado incluye en un
		// decimal lo enseñe y no
		// aparezca x.00
		// en cualquier caso siempre hay que tener un numero que sea float o real
		// salida
		System.out.println("El area es " + area);
		teclado.close();
	}

}
