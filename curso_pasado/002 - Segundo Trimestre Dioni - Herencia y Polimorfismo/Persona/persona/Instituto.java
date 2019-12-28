package persona;

public class Instituto {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno();
		Profesor profesor1 = new Profesor();

		alumno1.rellenarDatosAlumno();
		profesor1.cargarDatosProfesor();

		System.out.println(alumno1.toString());
		System.out.println(profesor1.toString());
	}

}
