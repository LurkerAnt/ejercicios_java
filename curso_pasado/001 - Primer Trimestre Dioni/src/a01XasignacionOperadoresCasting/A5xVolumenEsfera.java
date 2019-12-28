package a01XasignacionOperadoresCasting;

/**
 * 5. Programa que calcula el volumen de una esfera dando su radio por teclado.
 * @author Dionisio Fern�ndez Ortiz.
 */
import java.util.Scanner;

public class A5xVolumenEsfera {

	public static void main(String[] args) {
		// Creaci�n del Scanner Teclado.
		Scanner Teclado = new Scanner(System.in);
		// Declaraci�n de Variables.
		int radio;
		double volumen, area;
		System.out.println("Dame el radio de la Esfera: ");
		radio = Teclado.nextInt();
		// C�lculo del Area
		area = (Math.PI * 4) * Math.pow(radio, 2);
		// C�lculo del Volumen.
		volumen = ((Math.PI * 4) * Math.pow(radio, 3)) / 3;
		// Salida por pantalla de Area y Volumen
		System.out.println("El Area de la esfera es: " + area);
		System.out.println("El Volumen de la esfera es: " + volumen);
		// Cierre de Scanner Teclado.
		Teclado.close();
	}
}
