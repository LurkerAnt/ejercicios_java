package examen;

import java.util.Arrays;

public class Dias {
	public static String elMenor(String[] cadena) {
		String menor = cadena[0];
		for (int i = 0; i < cadena.length; i++)
			// if (cadena[i] < menor) < esto con strings no funciona
			if (cadena[i].compareTo(menor) < 0)
				menor = cadena[i];
		return menor;
	}

	static final int SIETE = 7;

	public static boolean longitud(int[] array) {
		return array.length == SIETE;
	}

	static boolean comprueba(int[] numero) {
		final int SIETE = 7;
		boolean correcto = true;
		if (numero.length != SIETE)
			correcto = false;
		return correcto;

	}

	public static void main(String[] args) {

		String[] dias;
		dias = new String[] { "viernes", "miercoles", "martes", "lunes", "jueves" };
		// Arrays.sort(dias);
		System.out.println(elMenor(dias));
	}

}
