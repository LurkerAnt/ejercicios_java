package ejerciciosComplejosSolo;

import java.util.Scanner;

public class EjemploArray {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		int N_ALUMNOS= 10;
		int [] edad;
		edad = new int[N_ALUMNOS];
		
		
		/*int [] array1= {1, 2, 3};
		int[] array2= new int[] {1, 2, 3};
		int [] arrayE;
		arrayE= new int [3];
		arrayE[0]= 1;
		arrayE[1]= 2;
		arrayE[2]= 3;
		
		*/
		
		//carga de array
		for(int alumno= 0; alumno < N_ALUMNOS; alumno++) {
			System.out.printf("Dame la edad del alumno %d: ", alumno + 1);
			edad[alumno-1]= T.nextInt();
		}
		
		//VISUALIZAR
		for(int alumno= 0; alumno < N_ALUMNOS; alumno++) {
			System.out.printf("La edad del alumno %d: %d \n", alumno + 1, edad[alumno]);
			
		}
		
		//TRATAR ARRAY
		int suma;
		float media;
		suma= 0;
		int edadmenor18, edadigual18, edadigual19, edadmayor19;
		edadmenor18= edadigual18= edadigual19= edadmayor19=0;
		
		
		int[]contadores={0,0,0,0};
		
		for(int alumno= 0; alumno < N_ALUMNOS; alumno++) {
			if(edad[alumno]<18) 
				contadores[0]++;
			else if(edad[alumno] ==18)
				contadores[1]++;
			else if(edad[alumno]==19)
				contadores[2]++;			
			else if(edad[alumno]>19)
				contadores[3]++;			
			suma = suma + edad[alumno];
		
		/*for(int alumno= 0; alumno < N_ALUMNOS; alumno++) {
			if(edad[alumno]<18) 
				edadmenor18++;
			else if(edad[alumno] ==18)
				edadigual18++;
			else if(edad[alumno]==19)
				edadigual19++;			
			else if(edad[alumno]>19)
				edadmayor19++;			
			suma = suma + edad[alumno];
		}
		*/
		System.out.println("Menor de 18 años: " + edadmenor18);
		media = (float)suma / N_ALUMNOS;
		System.out.println(media);
		
		
	//	edadmenor18= edadigual18= edadigual19= edadmayor19=0;
		//suma=0;
	//	for(int e; edad) {
		//	if (e <
//		}
		//System.out.println(nota);
		
	
	
	}

}
