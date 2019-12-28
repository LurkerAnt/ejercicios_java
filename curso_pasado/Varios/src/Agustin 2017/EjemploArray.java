import java.util.Scanner;

public class EjemploArray {
	static Scanner teclado = new Scanner(System.in);

	static public boolean e2g(int a, int b, int c, float []x) {
		return true;
	}

	static public float[] e2g(int a, int b, int c) {
		float []x= {0,0};
		
		return null;
	}
	
	
	
	
	// Carga de array
	public static void carga(int[] edad) {
		for (int alumno = 0; alumno < edad.length; alumno++) {
			System.out.printf("Edad del alumno %d: ", alumno + 1);
			edad[alumno] = teclado.nextInt();
		}
	}

	public static void proceso(int[] edad, int[] frecuencia) {
		
		//frecuencia = new int[]{ 0, 0, 0, 0 };
		for (int i= 0; i< frecuencia.length; i++) {
			frecuencia[i]= 0;
		}
		for (int alumno = 0; alumno < edad.length; alumno++) {
			if (edad[alumno] < 18)
				frecuencia[0]++;
			// edadMenor18++;
			else if (edad[alumno] == 18)
				frecuencia[1]++;
			// edadIgual18++;
			else if (edad[alumno] == 19)
				frecuencia[2]++;
			// edadIgual19++;
			else if (edad[alumno] > 19)
				frecuencia[3]++;
			// edadMayor19++;
			
		}

	}
	public static int[] proceso(int[] edad) {		
		int[] frecuencia = new int[4];
		for (int i= 0; i< frecuencia.length; i++) {
			frecuencia[i]= 0;
		}
		for (int alumno = 0; alumno < edad.length; alumno++) {
			if (edad[alumno] < 18)
				frecuencia[0]++;
			// edadMenor18++;
			else if (edad[alumno] == 18)
				frecuencia[1]++;
			// edadIgual18++;
			else if (edad[alumno] == 19)
				frecuencia[2]++;
			// edadIgual19++;
			else if (edad[alumno] > 19)
				frecuencia[3]++;
			// edadMayor19++;			
		}
		return frecuencia;
	}

	public static void main(String[] args) {
		int N_ALUMNOS = 3;
		int[] lasEdades;
		//int[] contadores= {1,1,1,1};
		lasEdades = new int[N_ALUMNOS];

		carga(lasEdades);
		int[] contadores;
		contadores= proceso(lasEdades);
		
		float[]x;
		x= e2g(1,1,1);
		if(x == null)
			System.out.println("imag");
		
		boolean r;
		x= new float[2];
		r= e2g(1,1,1,x);
		if(r == false)
			System.out.println("imag");

		
		/*
		// Visualizar
		for (int alumno = 0; alumno < N_ALUMNOS; alumno++) {
			System.out.printf("La edad del alumno %d: %d\n", alumno + 1, lasEdades[alumno]);
		}
		// for(int alumno= 0; alumno < N_ALUMNOS; alumno++) {
		for (int alumno = lasEdades.length - 1; alumno >= 0; alumno--) {
			System.out.printf("La edad del alumno %d: %d\n", alumno + 1, lasEdades[alumno]);
		}

		// Tratar array
		int suma;
		float media;
		int edadMenor18, edadIgual18, edadIgual19, edadMayor19;

		edadIgual18 = edadIgual19 = edadMayor19 = edadMenor18 = 0;

		suma = 0;
		int[] contadores = { 0, 0, 0, 0 };
		for (int alumno = 0; alumno < lasEdades.length; alumno++) {
			if (lasEdades[alumno] < 18)
				contadores[0]++;
			// edadMenor18++;
			else if (lasEdades[alumno] == 18)
				contadores[1]++;
			// edadIgual18++;
			else if (lasEdades[alumno] == 19)
				contadores[2]++;
			// edadIgual19++;
			else if (lasEdades[alumno] > 19)
				contadores[3]++;
			// edadMayor19++;
			suma = suma + lasEdades[alumno];
		}
		System.out.println("Menor de 18: " + contadores[0]);
		media = (float) suma / N_ALUMNOS;
		System.out.println(media);

		edadIgual18 = edadIgual19 = edadMayor19 = edadMenor18 = 0;
		suma = 0;
		for (int e : lasEdades) {
			if (e < 18)
				edadMenor18++;
			else if (e == 18)
				edadIgual18++;
			else if (e == 19)
				edadIgual19++;
			else if (e > 19)
				edadMayor19++;
			suma = suma + e;
		}
		System.out.println("Mayor de 19: " + edadMayor19);
		media = (float) suma / N_ALUMNOS;
		System.out.println(media);
*/
	}

}
