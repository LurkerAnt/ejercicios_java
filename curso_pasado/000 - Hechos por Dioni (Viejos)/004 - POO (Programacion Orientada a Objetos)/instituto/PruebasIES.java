package instituto;

public class PruebasIES {

	public static void main(String[] args) {
		// Alumno alumnoA = new Alumno();
		Persona[] alumnosClase = new Persona[3];
		Persona persona1 = new Persona("Dionisio", "Fernández", 1992, "123a");
		System.out.println(persona1.imprimeP());
		alumnosClase[0] = persona1;
		System.out.println(alumnosClase[0].getNombre());
		Alumno alumnoA = new Alumno("dionisio", "fernández", "1223a", 1992, 1593, 1, 3, "a", "a",
				new Integer[] { 1, 2, 2 }, 123);

	}

}
