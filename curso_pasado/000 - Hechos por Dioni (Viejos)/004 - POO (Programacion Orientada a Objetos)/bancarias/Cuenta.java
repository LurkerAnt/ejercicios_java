package bancarias;

public class Cuenta {
	private String nombre;
	private String apellidos;
	private String noIdentificacion;
	private int edad;

	public Cuenta(String nombre, String apellidos, String noIdentificacion, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.noIdentificacion = noIdentificacion;
		this.edad = edad;
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

	public String getNoIdentificacion() {
		return noIdentificacion;
	}

	public void setNoIdentificacion(String noIdentificacion) {
		this.noIdentificacion = noIdentificacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
