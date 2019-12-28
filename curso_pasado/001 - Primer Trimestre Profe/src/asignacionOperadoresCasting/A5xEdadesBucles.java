package asignacionOperadoresCasting;

import java.util.Scanner;

public class A5xEdadesBucles {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int nAlumnos, edad, suma, contador;
		double media;
		int edadMenos18, edad18, edad19, edadMayor19;
		System.out.println("Dame el numero de Alumnos: ");
		nAlumnos = t.nextInt();
		edadMenos18 = edad18 = edad19 = edadMayor19 = 0;
		suma = 0;
		contador = 0;
		media = 0;
		while (contador < nAlumnos) {
			contador++;
			System.out.printf("Da la edad de alimno número %d: ", contador);
			edad = t.nextInt();
			suma += edad;
			if (edad < 18)
				edadMenos18++;
			else if (edad == 18)
				edad18++;
			else if (edad == 19)
				edad19++;
			else
				edadMayor19++;
		}
		media = (double) suma / nAlumnos;
		System.out.printf("La edad media de los alumnos es: %f", media);
		System.out.println("Alumnos de menos de 18 años: " + edadMenos18);
		System.out.println("Alumnos de 18 años: " + edad18);
		System.out.println("Alumnos de 19 años: " + edad19);
		System.out.println("Alumnos de mas de 19 años: " + edadMayor19);
		t.close();
	}

}
