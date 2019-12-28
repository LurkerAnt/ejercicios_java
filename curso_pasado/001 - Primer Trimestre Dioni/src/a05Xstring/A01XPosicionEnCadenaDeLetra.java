package a05Xstring;

/**
 * 1. Escribe un programa que solicite una cadena y una letra y nos devuelva las
 * posiciones que ocupa esa letra en la cadena.
 * 
 * @author Dionisio Fernández Ortiz
 *
 */

public class A01XPosicionEnCadenaDeLetra {
	public static int darPosiciones(String cadena, char c) {
		int posicion = cadena.indexOf(c);
		int cuenta = 0;
		while (posicion != -1) {
			cuenta++;
			posicion = cadena.indexOf(c, posicion + 1);
		}
		return cuenta;

	}

	public static void main(String[] args) {
		String cadena1 = new String("una cadena");
		int posicion = 0;
		while (darPosiciones(cadena1, 'a') != -1) {
			posicion = darPosiciones(cadena1, 'a');
			System.out.println(posicion);
		}
	}

}
