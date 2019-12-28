package personaClase;

import och1_fecha.Fecha;

public class PersonaClase {
	protected String nombre;
	protected String nif;
	protected Fecha fechaNacimiento;
	
	public PersonaClase (String nombre, String nif, Fecha fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNif() {
		return nif;
	}
	
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Fecha getFechaNacimeinto() {
		return fechaNacimiento;
	}
	
	public String getFechaNacimientoString() { //QUE ES???
		return fechaNacimiento.getDia() + "/" + fechaNacimiento.getMes() + "/" + fechaNacimiento.getAnio();
	}
	
	@Override
	public String toString() {
		return "Persona = nombre: " + this.nombre + ", dni: " +this.nif + ", fecha: " + this.fechaNacimiento; //getFechaNacimientoString me da otro formato????
	}
	public String getFicha() {
		return "Persona = nombre: " + this.nombre + ", dni: " +this.nif + ", fecha: " + this.fechaNacimiento;
	}

}















