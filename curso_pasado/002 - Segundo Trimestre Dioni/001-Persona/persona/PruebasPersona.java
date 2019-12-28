package persona;

public class PruebasPersona {

	public static void main(String[] args) {
		Persona uno = new Persona("Pepe Billuela", 22, 1.24);
		uno.mostrarDatos(uno);
		Persona dos = new Persona();
		dos.mostrarDatos(dos);
	}

}
