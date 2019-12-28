package a03XbuclesDecisiones;

/**
 * 10. 	Programa que calcula las siguientes características de los alumnos de la clase:
 *		Edad media de los alumnos de una clase.
 *		¿Cuantos alumnos tienen menos de 18 años?
 *		¿Cuantos alumnos tienen 18 años?
 *		¿Cuantos alumnos tienen 19 años?
 *		¿Cuantos alumnos tienen más de 19 años?
 * @author Dionisio Fernández Ortiz
 *
 */

import java.util.Scanner;

public class B01xCalculosClase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numAlumnos, alumno, edad, edadMenor18, edad18, edad19, edadMayor19, acumEdad;
		double edadMedia, porcentaje;
		System.out.println("Dame el número de alumnos de clase: ");
		numAlumnos = teclado.nextInt();
		edadMenor18 = edad18 = edad19 = edadMayor19 = 0;
		for (alumno = 1, acumEdad = 0; alumno <= numAlumnos; alumno++) {
			System.out.printf("Dame la edad del alumno %d: ", alumno);
			edad = teclado.nextInt();
			acumEdad += edad;
			if (edad < 18) {
				edadMenor18++;
			} else if (edad == 18) {
				edad18++;
			} else if (edad == 19) {
				edad19++;
			} else if (edad > 19) {
				edadMayor19++;
			}
		}
		edadMedia = acumEdad / numAlumnos;

		System.out.printf("La edad media de la clase es %f", edadMedia);
		porcentaje = (edadMenor18 / numAlumnos) * 100;
		System.out.printf("Hay %d alumnos menores de 18 años, son el %f % de la clase", edadMenor18, porcentaje);
		porcentaje = (edad18 / numAlumnos) * 100;
		System.out.printf("Hay %d alumnos de 18 años, son el %f % de la clase", edad18, porcentaje);
		porcentaje = (edad19 / numAlumnos) * 100;
		System.out.printf("Hay %d alumnos de 19 años, son el %f % de la clase", edad19, porcentaje);
		porcentaje = (edadMayor19 / numAlumnos) * 100;
		System.out.printf("Hay %d alumnos mayores de 19 años, son el %f % de la clase", edadMayor19, porcentaje);
		teclado.close();
	}

}
