package instituto;

public class Alumno extends Persona {
	private Integer numMatricula;
	private Integer curso;
	private Integer numAsignaturas;
	private String clase;
	private String grupo;
	private Integer[] notas;
	private Integer numAlumno;

	public Alumno(String nombre, String apellidos, String nif, Integer anhoNacimiento, Integer numMatricula,
			Integer curso, Integer numAsignaturas, String clase, String grupo, Integer[] notas, Integer numAlumno) {
		super(nombre, apellidos, anhoNacimiento, nif);
		this.numMatricula = numMatricula;
		this.curso = curso;
		this.numAsignaturas = numAsignaturas;
		this.clase = clase;
		this.grupo = grupo;
		this.numAlumno = numAlumno;
		this.notas = notas;
	}

	public Integer getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(Integer numMatricula) {
		this.numMatricula = numMatricula;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public Integer getNumAsignaturas() {
		return numAsignaturas;
	}

	public void setNumAsignaturas(Integer numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Integer[] getNotas() {
		return notas;
	}

	public void setNotas(Integer[] notas) {
		this.notas = notas;
	}

	public Integer getNumAlumno() {
		return numAlumno;
	}

	public void setNumAlumno(Integer numAlumno) {
		this.numAlumno = numAlumno;
	}

	@Override
	public String imprimeP() {
		return ("Datos de Alumno:\n Nombre:" + super.getNombre() + "\n Apellidos: " + super.getApellidos()
				+ "\n Año de nacimiento: " + super.getAnhoNacimiento() + "\n clase:" + clase + "\n grupo: " + grupo
				+ "\n Notas: " + notas[numAlumno]);
	}

}
