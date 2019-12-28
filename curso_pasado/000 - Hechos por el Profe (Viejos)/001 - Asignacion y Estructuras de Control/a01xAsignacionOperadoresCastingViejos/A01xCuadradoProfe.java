package a01xAsignacionOperadoresCastingViejos;

import java.util.Scanner;

public class A01xCuadradoProfe {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numero;
		int cuadrado;

		System.out.println("Introduce un Número: ");
		numero = t.nextInt();

		cuadrado = (int) Math.pow(numero, 2);

		System.out.printf("El cuadrado de %d es %d \n", numero, cuadrado);
		t.close();
		/*
		 * int numero, cuadrado; double raiz;
		 * 
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.println("Introduce un número "); numero= teclado.nextInt();
		 * cuadrado= (int) Math.pow (numero, 2); raiz= (float) Math.pow(numero, 1/3f);
		 * 
		 * teclado.close();
		 * 
		 * System.out.println("El cuadrado de " + numero + " es " + cuadrado);
		 * System.out.println("Y su raíz es " + raiz);
		 */
	}

}
