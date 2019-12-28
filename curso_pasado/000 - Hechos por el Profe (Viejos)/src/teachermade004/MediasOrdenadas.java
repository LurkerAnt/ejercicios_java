package teachermade004;

import java.util.Scanner;

public class MediasOrdenadas {

	static final int ALUMNOS = 2;
	static final int MODULOS = 3;

	static float media(int[] vector) {
		int suma;
		suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		return (float) suma / vector.length;

	}

	public static void main(String[] args) {

		int[][] nota = new int[ALUMNOS][MODULOS];
		Scanner T = new Scanner(System.in);

		for (int alumno = 0; alumno < nota[alumno].length; alumno++) {
			System.out.println("Proceso " + (alumno + 1));
			for (int modulo = 0; modulo < nota[0].length; modulo++) {
				System.out.println("Nota Modulo " + (modulo + 1) + ":");
				nota[0][modulo] = T.nextInt();
			}
		}

		System.out.println("Listado Notas");
		for (int alumno = 0; alumno < nota[alumno].length; alumno++) {
			System.out.println("Proceso " + (alumno + 1));
			for (int modulo = 0; modulo < nota[alumno].length; modulo++) {
				System.out.println(nota[alumno][modulo] + "\t");
			}
			System.out.println();
		}
		System.out.println("Notas medias");
		int suma;
		float media;
		float[] aMedia;

		int alumno = 0;
		int modulo;
		System.out.println("Media de notas del alumno: " + (alumno + 1));

		for (alumno = 0; alumno < nota.length; alumno++) {// incrementa alumnos
			suma = 0;
			for (modulo = 0; modulo < nota[alumno].length; modulo++) { // recorre los modulos
				suma = suma + nota[alumno][modulo];
				System.out.println(nota[alumno][modulo] + "\t");
			}
			media = (float) suma / nota[alumno].length;
			// System.out.println("media del alumno " + (alumno + 1) + ": " + media);
			System.out.printf("Media del alumno %d: %f\n", alumno + 1, media); // como se usa printf??? BUSCALO
		}
		for (int modulo = 0; modulo < nota[0].length; modulo++) { // recorre los modulos
			suma = 0;
			for (alumno = 0; alumno < nota.length; alumno++) {
				suma = suma + nota[alumno][modulo];
			}
			media = (float) suma / nota.length;
			System.out.printf("Media del modulo %d: %f\n", modulo + 1, media); // como se usa printf??? BUSCALO
		}
	}
}
