package estudios;

public class Ej02_AlumnoTest {

	public static void main(String[] args) {
		Ej02_Alumno a1, a2;
		a1 = new Ej02_Alumno();
		a2 = new Ej02_Alumno();
		a1.ponAlumnos(1, "Juan", "1234", new Integer[] {1, 2, 3});
		a2.ponAlumnos(21, "Juan", "1234", new Integer[] {1, 2, 3});
		
		/*Integer m1 = a1.dameMatricula();
		System.out.println(m1);
		Integer m2 = a2.dameMatricula();
		System.out.println(m2);
		
		a2=a1; //se "pierde" la información del a2
		
		System.out.println(m1);
		System.out.println(m2);
		*/
		a1.setNombre("Luis");
		//a1.setMatricula(222); //modifico la información del objeto a través de la interfaz proporcionada
		String infoA = a1.toString();
		System.out.println(a1.getFicha());
		System.out.print(infoA);
		
	}

}

