package a01XasignacionOperadoresCasting;

/**
 * 1. Declarar dos variables de tipo entero (int) con valores 15 y 6. Sumarlas y
 * restar 1 al resultado, almacen�ndolo en una tercera variable. Imprimir el
 * resultado almacenado en esa variable por la salida est�ndar.
 * 
 * @author Dionisio Fern�ndez Ortiz.
 *
 */

public class B1xSumaResta {
	public static void main(String[] Args) {
		// Declaraci�n de variables
		int numero1, numero2, resultado;
		// Asignaci�n de valores
		numero1 = 15;
		numero2 = 6;
		// Obtenci�n del resultado
		resultado = (numero1 + numero2) - 1;
		// Salida por pantalla
		System.out.println("El resultado es " + resultado);
	}
}
