import java.util.Scanner;

public class EstadisticaEdad {

	public static void main(String[] args) {
		final int MAYOR_EDAD= 18;
		Scanner t= new Scanner(System.in);
		int nAlumnos;
		int edad;
		int sumaEdades;
		int alumno;
		int aMayores18;
		int aMenores18;
		float edadMedia;
		
		System.out.print("Número alumnos: ");
		nAlumnos= t.nextInt();
		
		alumno= 1;
		aMayores18= 0;
		aMenores18= 0;
		sumaEdades= 0;		
		while(alumno <= nAlumnos){
			System.out.print("Edad del alumno " + alumno + ": ");
			edad= t.nextInt();
			
			if(edad >= MAYOR_EDAD)
				aMayores18++;
			else
				aMenores18++;
			
			sumaEdades= sumaEdades + edad;
			alumno++;
		}
		System.out.println("Mayores edad: " + aMayores18);
		System.out.println("Menores edad: " + aMenores18);
		edadMedia= (float)sumaEdades / nAlumnos;
		System.out.println("La media es: " + edadMedia);
	}

}







