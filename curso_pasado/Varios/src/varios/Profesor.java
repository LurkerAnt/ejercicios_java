package personaClase;

import och1_fecha.Fecha;

public class Profesor extends PersonaClase {
	private String turno;
	private String especilidad;

	public Profesor(String nombre, String nif, Fecha fechaNacimiento, String turno, String especilidad) {
		super(nombre, nif, fechaNacimiento);
		this.turno = turno;
		this.especilidad = especilidad;
	}

	@Override
	public String toString() {
		return "Profesor [turno=" + turno + ", especilidad=" + especilidad + ", toString()=" + super.toString() + "]";
	}

	public String getFicha() {
		return "Profesor [turno=" + turno + ", especilidad=" + especilidad + ", toString()=" + super.toString() + "]";
	}

}
