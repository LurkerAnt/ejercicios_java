package a01XasignacionOperadoresCasting;

/**
 * 3. Hacer lo contrario, definir un entero y convertirlo a un car�cter.
 * Imprimirlo por pantalla. Probarlo con el 97, 126 y 128.
 * 
 * @author Dionisio Fern�ndez Ortiz
 *
 */

public class B3xEnteroEnChar {
	public static void main(String[] Args) {
		int numero1, numero2, numero3;
		char caracter;

		numero1 = 97;
		numero2 = 126;
		numero3 = 128;

		caracter = (char) numero1;
		System.out.println("El n�mero 97 equivale a: " + caracter);
		caracter = (char) numero2;
		System.out.println("El n�mero 126 equivale a: " + caracter);
		caracter = (char) numero3;
		System.out.println("El n�mero 128 equivale a: " + caracter);
	}
}
