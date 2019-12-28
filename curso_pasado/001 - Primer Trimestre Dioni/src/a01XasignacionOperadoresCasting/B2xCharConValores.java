package a01XasignacionOperadoresCasting;

/**
 * Definir una variable de tipo char. Convertirla a una variable de tipo entero
 * e imprimir su valor asociado. Probarlo con lo caracteres ‘a’, ‘b’ , ‘A’ y
 * ‘B’.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class B2xCharConValores {
	public static void main(String[] Args) {
		char carac1, carac2, carac3, carac4;
		int entero;
		carac1 = 'a';
		carac2 = 'b';
		carac3 = 'A';
		carac4 = 'B';

		entero = (int) carac1;
		System.out.println("La 'a' equivale a " + entero);
		entero = (int) carac2;
		System.out.println("La 'b' equivale a " + entero);
		entero = (int) carac3;
		System.out.println("La 'A' equivale a " + entero);
		entero = (int) carac4;
		System.out.println("La 'B' equivale a " + entero);

	}
}
