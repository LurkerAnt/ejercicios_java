package bucles;
import java.util.Scanner;
public class Estadistica {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int totalAlumnos;
		int edad;
		int cAlumnos;
		int aEdad;
		float edadMedia;
		int menor18;
		int iguales18;
		int iguales19;
		int mayor19;
		System.out.print("Número de alumnos: ");
		totalAlumnos = teclado.nextInt();
		cAlumnos = 1;
		aEdad= 0;
		menor18= iguales18= iguales19= mayor19= 0;
		while(cAlumnos <= totalAlumnos){
			System.out.print("Edad del alumno " + cAlumnos + ": ");
			edad = teclado.nextInt();
			aEdad = aEdad + edad;
			if(edad < 18)
				menor18++;
			else if(edad == 18)
				iguales18++;
			else if(edad == 19)
				iguales19++;
			else
				mayor19++;				
			cAlumnos++;
		}
		edadMedia= (float)aEdad / totalAlumnos;
		System.out.println("Edad media " + edadMedia);
		System.out.println("Menores 18: " + menor18);
		System.out.println("Iguales 18: " + iguales18);
		System.out.println("Iguales 19: " + iguales19);
		System.out.println("Mayores 19: " + mayor19);
	}
}
