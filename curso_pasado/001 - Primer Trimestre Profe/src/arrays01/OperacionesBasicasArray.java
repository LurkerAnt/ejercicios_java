package arrays01;

import java.util.Scanner;

public class OperacionesBasicasArray {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int nAlumnos;
		double[] notasProgramacion;
		// creación
		System.out.println("Dame el número de Alumnos: ");
		nAlumnos = t.nextInt();
		notasProgramacion = new double[nAlumnos];

		// carga del array
		for (int a = 0; a < notasProgramacion.length; a++) {
			System.out.printf("Nota del alumno número %d:", a + 1);
			notasProgramacion[a] = t.nextDouble();
		}
		// visualiza
		for (int a = 0; a < notasProgramacion.length; a++) {
			System.out.printf("Nota del alumno número %d:", a + 1);
			System.out.printf("%.2f\n", notasProgramacion[a]);
		}
		// procesamiento de un array
		// media de notas
		double media, acumNotas = 0;
		for (int a = 0; a < notasProgramacion.length; a++) {
			acumNotas += notasProgramacion[a];
		}
		media = acumNotas / notasProgramacion.length;
		System.out.printf("La media de las notas es: %.2f", media);

		t.close();
	}

}
