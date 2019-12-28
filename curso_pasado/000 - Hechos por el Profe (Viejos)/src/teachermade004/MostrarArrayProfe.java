package teachermade004;

import java.util.Scanner;

public class MostrarArrayProfe {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int N_ALUMNOS = 10;
		int[] edad;
		edad = new int[N_ALUMNOS];

		/*
		 * int [] array1= {1, 2, 3}; int[] array2= new int[] {1, 2, 3}; int [] arrayE;
		 * arrayE= new int [3]; arrayE[0]= 1; arrayE[1]= 2; arrayE[2]= 3;
		 * 
		 */

		// carga de array
		for (int alumno = 0; alumno < N_ALUMNOS; alumno++) {
			System.out.printf("Dame la edad del alumno %d: ", alumno + 1);
			edad[alumno - 1] = T.nextInt();
		}

		// VISUALIZAR
		for (int alumno = 0; alumno < N_ALUMNOS; alumno++) {
			System.out.printf("La edad del alumno %d: %d \n", alumno + 1, edad[alumno]);

		}

		for (int alumno = edad.length - 1; alumno >= 0; alumno--) {
			System.out.printf("La edad del alumno %d: %d \n", alumno + 1, edad[alumno]);
		}
	}

}
