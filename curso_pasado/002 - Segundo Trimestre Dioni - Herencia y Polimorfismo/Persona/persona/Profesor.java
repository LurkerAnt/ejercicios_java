package persona;

public class Profesor extends Persona {
	private String especialidad;
	private Character turno;

	public Profesor(String nombre, String apellidos, String NIF, String especialidad, Character turno,
			Fecha fechaNacimiento) {
		super.setNombre(nombre);
		super.setApellido(apellidos);
		super.setNIF(NIF);
		super.setFechaNacimiento(fechaNacimiento);
		this.setEspecialidad(especialidad);
		this.setTurno(turno);
	}

	public Profesor() {

	}

	public void cargarDatosProfesor() {
		super.setNombre();
		super.setApellido();
		super.setNIF();
		super.setFechaNacimiento();
		this.setEspecialidad();
		this.setTurno();
	}

	public void setNombre() {
		System.out.println("Introduce el Nombre del Profesor: ");
		super.setNombre(teclado.next());
	}

	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	public String getNombre() {
		return super.getNombre();
	}

	public void setApellidos() {
		System.out.println("Introduce los Apellidos del Profesor: ");
		super.setApellido(teclado.next());
	}

	public void setApellidos(String apellidos) {
		super.setApellido(apellidos);
	}

	public String getApellidos() {
		return super.getApellido();
	}

	public void setNIF() {
		System.out.println("Introduce el NIF del Profesor: ");
		super.setNIF(teclado.next());
	}

	public void setNIF(String NIF) {
		super.setNIF(NIF);
	}

	public String getNIF() {
		return super.getNIF();
	}

	public void setFechaNacimiento() {
		super.setFechaNacimiento();
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		super.setFechaNacimiento(fechaNacimiento);
	}

	public Fecha getFechaNacimiento() {
		return super.getFechaNacimiento();
	}

	public void setEspecialidad() {
		System.out.println("Introduce la Expecialidad del Profesor: ");
		this.especialidad = teclado.next();
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setTurno() {
		System.out.println("Introduce el Turno del Profesor, Mañana o Tarde: ");
		this.turno = teclado.next().charAt(0);
	}

	public void setTurno(Character turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "\nDatos del Profesor: \n Nombre: " + super.getNombre() + "\n Apellidos: " + this.getApellido()
				+ "\n NIF: " + this.getNIF() + "\n Fecha Nacimiento:" + super.toStringFecha() + "\n Especialidad: "
				+ this.especialidad + "\n Turno: " + this.turno;
	}

}
