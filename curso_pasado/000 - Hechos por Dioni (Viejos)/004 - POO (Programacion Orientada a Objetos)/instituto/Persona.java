package instituto;

public class Persona {
	private String nombre;
	private String apellidos;
	private Integer anhoNacimiento;
	private String nif;

	public Persona() {

	}

	public Persona(String nombre, String apellidos, int anhoNacimiento, String nif) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anhoNacimiento = anhoNacimiento;
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAnhoNacimiento() {
		return anhoNacimiento;
	}

	public void setAnhoNacimiento(int anhoNacimiento) {
		this.anhoNacimiento = anhoNacimiento;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String imprimeP() {
		return ("Datos de Persona:\n Nombre:" + nombre + "\n Apellidos: " + apellidos + "\n Año de nacimiento: "
				+ anhoNacimiento + "\n DNI: " + nif);
	}
}
