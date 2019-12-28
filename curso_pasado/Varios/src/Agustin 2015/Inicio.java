package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inicio {

	static Scanner t= new Scanner(System.in);


//	static void carga(int notasAlumnos[], int nAlumnos){
	static void carga(int notasAlumnos[]){
		// carga array

//		for(int a= 0; a < nAlumnos; a++){			
		for(int a= 0; a < notasAlumnos.length; a++){			
			System.out.println("Alumno " + (a + 1));
			notasAlumnos[a]= t.nextInt();
		}
		
	}
	static float media(int [] notasAlumnos){
		int suma= 0;
		for(int nota: notasAlumnos){
			suma += nota;
		}
		return (float)suma/notasAlumnos.length;
	}

	//notas= new int[]{4, 6, 7, 8, 2, 3, 8, 8, 3, 7, 2};
	static int menorElto(int[]array){
		//int menor;
		int pos;
		//menor= array[0];
		pos= 0;
		for(int i= 1; i < array.length; i++){
			if(array[i] < array[pos]){
				pos= i;
			}
		}
		return pos;
	}
	static int mayorElto(int[]array){
		int pos;
		pos= 0;
		for(int i= 1; i < array.length; i++){
			if(array[i] > array[pos]){
				pos= i;
			}
		}
		return pos;
	}	
	static int mayorRepe(int[]array){
		int pos;
		int repe;
		pos= 0;
		repe= 1;
		
		for(int i= 1; i < array.length; i++){
			if(array[i] > array[pos]){
				pos= i;
				repe= 1;
			}
			else if(array[i] == array[pos])
				repe++;
		}
		return repe;
	}
	
	
	public static void main(String[] args) {
		int nAlumnos;
		int [] notas;
		/*
		System.out.println("nú al: " );
		nAlumnos= t.nextInt();
		*/
		notas= new int[]{4, 6, 7, 8, 2, 3, 8, 8, 3, 7, 2};
		
		//carga(notas);
		//float notaNedia= media(notas);
		
		int menor= menorElto(notas);
		System.out.println("Alumno " + menor + " nota " + notas[menor]);
		int mayor= mayorElto(notas);
		System.out.println("Alumno " + mayor + " nota " + notas[mayor]);
		System.out.println("elmay " + mayorRepe(notas));
		
		//int menor= menorPosElto(notas);
		
		//Arrays.sort(notas);
		/*
		for(int a= 0; a < nAlumnos; a++)
			System.out.printf("Nota del alumno %d: %d\n", (a + 1), notas[a]);
		*/
		
	}

}











