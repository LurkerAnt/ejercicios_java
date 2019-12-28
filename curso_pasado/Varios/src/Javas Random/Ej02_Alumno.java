package estudios;

public class Ej02_Alumno {
	private int matricula;
	private String nombre;
	private String nif;
	private Integer []nota;
	
	public Ej02_Alumno() {
		this.matricula= 1;
		this.nombre= "";
		this.nif= "";
		nota = new Integer[3];
	}
	
	public Ej02_Alumno(Integer m, String n, String ni, Integer []no) { // constructor general
		this.matricula= m;
		this.nombre= n;
		this.nif= ni;
		this.nota = no;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponAlumnos(Integer m, String n, String ni, Integer []no) {
		matricula = m;
		nombre = n;
		nif = ni;
		nota = no;
	}
	
	// para retornar toda la información del alumno
	
	public String getFicha() {
		String ficha = String.format("Matricula: %d \n %s", matricula, nombre);
		return ficha;
	}
	
	public String toString() {
		String ficha = String.format("Matricula: %d \n %s", matricula, nombre);
		return ficha;
	}
}
