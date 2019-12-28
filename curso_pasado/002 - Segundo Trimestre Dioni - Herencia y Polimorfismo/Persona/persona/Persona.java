package persona;

//Crea una clase Persona con las propiedades: nif, nombre, fecha nacimiento, ...

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellidos;
	private String NIF;
	private Fecha fechaNacimiento = new Fecha();
	Scanner teclado = new Scanner(System.in);

	public Persona(String nombre, String apellidos, String NIF, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.NIF = NIF;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona() {

	}

	public void cargarDatosPersona() {
		this.setNombre();
		this.setApellido();
		this.setNIF();
		this.fechaNacimiento.setFecha();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNombre() {
		System.out.println("Introduce el Nombre: ");
		this.nombre = teclado.next();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}

	public void setApellido() {
		System.out.println("Introduce el Apellido: ");
		this.apellidos = teclado.next();
	}

	public String getApellido() {
		return this.apellidos;
	}

	public void setNIF(String NIF) {
		this.NIF = NIF;
	}

	public void setNIF() {
		System.out.println("Introduce el NIF: ");
		this.NIF = teclado.next();
	}

	public String getNIF() {
		return this.NIF;
	}

	public void setFechaNacimiento() {
		this.fechaNacimiento = new Fecha();
		this.fechaNacimiento.setFecha();
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setFechaNacimiento(Integer dia, Integer mes, Integer year) {
		this.fechaNacimiento = new Fecha(dia, mes, year);
	}

	public Fecha getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + "Apellidos: " + this.apellidos + "NIF: " + this.NIF + "Fecha Nacimiento:"
				+ this.fechaNacimiento.toString();
	}

	public String toStringFecha() {
		return this.fechaNacimiento.toString();
	}
}
