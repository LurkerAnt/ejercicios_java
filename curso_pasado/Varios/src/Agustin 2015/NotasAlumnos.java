package arrays;
import java.util.Scanner;

// Filas: alumnos
// Columnas: módulos
public class NotasAlumnos {
	static Scanner teclado= new Scanner(System.in);
	static void cargaFilas(int [][] notas){
		int nota;
		System.out.println("Notas de alumnos:");
		for(int a= 0; a < notas.length; a++){
			System.out.println("Alumno " + a + ":");
			for(int m= 0; m < notas[a].length; m++ ){
				System.out.println("Módulo " + m +":");
				nota= teclado.nextInt();
				notas[a][m]= nota;
			}
		}
	}	static void cargaColumnas(int [][] notas){
		int nota;
		System.out.println("Notas de alumnos:");
		for(int m= 0; m < notas[m].length; m++){
			System.out.println("Módulo " + m + ":");
			for(int a= 0; a < notas.length; a++ ){
				System.out.println("Alumno " + a +":");
				nota= teclado.nextInt();
				notas[a][m]= nota;
			}
		}
	}
	public static void main(String[] args) {
		int [][] notas= new int [5][3];
		cargaColumnas(notas);
		
	}

}
