package estructurasdControl2;

import java.util.Scanner;

public class B2EdadesAlumnosClase {

	public static void main(String[] args) {

		Scanner T = new Scanner(System.in);
		int alumnos, numAlumno, menos18, dieciocho, diecinueve, masDiecinueve, edad;
		System.out.println("Introduce el n�mero de alumnos: ");
		alumnos = T.nextInt();
		menos18 = dieciocho = diecinueve = masDiecinueve = 0;
		for (numAlumno = 1, edad = 0; numAlumno <= alumnos; numAlumno++) {
			System.out.printf("Introduce la edad del alumno n�mero %d: ", numAlumno);
			edad = T.nextInt();
			if (edad <= 17) {
				menos18++;
			}
			if (edad == 18) {
				dieciocho++;
			}
			if (edad == 19) {
				diecinueve++;
			}
			if (edad > 19) {
				masDiecinueve++;
			}
		}

		System.out.printf(
				"En la clase hay %d alumnos. Hay %d menores de 18, %d de 18 a�os, %d de 19 a�os y %d mayores de 19 a�os.",
				alumnos, menos18, dieciocho, diecinueve, masDiecinueve);
	}

}
