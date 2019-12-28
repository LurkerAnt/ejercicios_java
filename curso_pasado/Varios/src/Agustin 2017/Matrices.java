import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
	static Scanner teclado = new Scanner(System.in);
	static final int ALUMNOS = 2;
	static final int MODULOS = 3;

	static void visualizaMedias(String []nombre, float []aMedia) {
		System.out.println("Lista de notas media");
		for (int i = 0; i < aMedia.length; i++) {
			System.out.printf("Alumno %s: %.2f\n", nombre[i], aMedia[i]);			
		}
	}

	static float calculoMedia(int [][]array, int columna) {
		return 0;
	}
	
	static float calculoMedia(int []array) {
		int suma;
		suma= 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return (float)suma/array.length;
	}
	public static void main(String[] args) {

		//int []nota1= {1,2,3,4,5};
		//float laMedia= calculoMedia(nota1);
		
		int[][] nota = new int[ALUMNOS][MODULOS];
		String []nombre= {"Juan", "Antonio"};
		
		for (int alumno = 0; alumno < nota.length; alumno++) {
			System.out.println("Proceso alumno " + (alumno + 1) + nombre[alumno]);
			for (int modulo = 0; modulo < nota[alumno].length; modulo++) {
				System.out.print("Nota módulo " + (modulo + 1) + ":");
				nota[alumno][modulo] = teclado.nextInt();
			}
		}
		System.out.println("Listado notas");
		for (int alumno = 0; alumno < nota.length; alumno++) {
			System.out.println("Proceso alumno " + (alumno + 1));
			for (int modulo = 0; modulo < nota[alumno].length; modulo++) {
				// System.out.println("Nota módulo " + (modulo + 1) + ": " +
				// nota[alumno][modulo] );
				System.out.print(nota[alumno][modulo] + "\t");
			}
			System.out.println();
		}
		System.out.println("notas media");
	//suma= 0;
			/*
			for (modulo = 0; modulo < nota[alumno].length; modulo++) {
				suma = suma + nota[alumno][modulo];
			}			
			media = (float) suma / nota[alumno].length;
			*/
		int suma;
		float media;
		float []aMedia;
		int alumno;
		int modulo;
		aMedia= new float [ALUMNOS];
		for (alumno = 0, suma= 0; alumno < nota.length; alumno++) {
			media= calculoMedia(nota[alumno]);
			aMedia[alumno]= media;
		}
		
		visualizaMedias(nombre, aMedia);
		Arrays.sort(aMedia);
		visualizaMedias(nombre, aMedia);
		
		System.out.println();

		for (modulo = 0, suma= 0; modulo < nota[0].length; modulo++) {
			//suma= 0;
			for (alumno = 0; alumno < nota.length; alumno++) {
				suma = suma + nota[alumno][modulo];
			}
			media = (float) suma / nota.length;
			System.out.printf("Media de módulo %d: %f\n", modulo + 1, media);
		}
		System.out.println();
		
	}

}







