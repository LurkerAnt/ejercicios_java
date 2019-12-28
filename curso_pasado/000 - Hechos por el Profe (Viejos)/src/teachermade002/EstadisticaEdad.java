package teachermade002;

import java.util.Scanner;

public class EstadisticaEdad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Int MAYOR_EDAD; // EL ESTAR EN MAYUSCULAS ES UNA CONSTANTE
		int nAlumnos;
		int edad;
		int alumno;
		int may18;
		int men18;
		int suma;
		float edadMedia;

		System.out.println("Introduce el numero de alumnos: ");
		nAlumnos = teclado.nextInt();

		alumno = 1;
		suma = 0;
		may18 = 0;
		men18 = 0;
		MAYOR_EDAD = 18;
		while (alumno <= nAlumnos) {
			System.out.println("Edad del alumno " + alumno + ": ");
			edad = teclado.nextInt();

			if (edasd >= MAYOR_EDAD)
				may18++;
			else
				men18++;

			suma = suma + edad;
			alumno++;
		}
		System.out.println("mayores edad: " + may18);
		System.out.println("menoes de edad " + men18);
		edadMedia = suma / nAlumnos;
		System.out.println("La edad media es: " + edadMedia);
	}

}
