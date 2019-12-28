package persona;

//Crea una clase Alumno con las propiedades: número de matrícula, curso, grupo, notas de tres asignaturas, nif, nombre, fecha nacimiento, ...

public class Alumno extends Persona {
	private String numeroMatricula;
	private Character curso;
	private Character grupo;
	private Double[] notasAsignaturas = new Double[3];

	public Alumno(String nombre, String apellido, String NIF, Fecha fechaNacimiento, String numeroMatricula,
			Character curso, Character grupo, Double[] notasAsignaturas) {
		super.setNombre(nombre);
		super.setApellido(apellido);
		super.setNIF(NIF);
		super.setFechaNacimiento(fechaNacimiento);
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
		this.grupo = grupo;
		this.notasAsignaturas = notasAsignaturas;
	}
	
	public Alumno() {
		
	}

	public void rellenarDatosAlumno() {
		super.setNombre();
		super.setApellido();
		super.setNIF();
		super.setFechaNacimiento();
		this.setNumeroMatricula();
		this.setCurso();
		this.setGrupo();
		this.setNotasAsignaturas();
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public void setNumeroMatricula() {
		System.out.println("Introduce el Número de Matrícula");
		this.numeroMatricula = teclado.next();
	}

	public String getNumeroMatricula() {
		return this.numeroMatricula;
	}

	public void setCurso(Character curso) {
		this.curso = curso;
	}

	public void setCurso() {
		System.out.println("Introduce el Curso: ");
		this.curso = teclado.next().charAt(0);
	}

	public Character getCurso() {
		return this.curso;
	}

	public void setGrupo(Character grupo) {
		this.grupo = grupo;
	}

	public void setGrupo() {
		System.out.println("Introduce el Grupo: ");
		this.grupo = teclado.next().charAt(0);
	}

	public Character getGrupo() {
		return this.grupo;
	}

	public void setNotasAsignaturas() {
		for (int i = 0; i < this.notasAsignaturas.length; i++) {
			System.out.printf("Introduce la Nota nº /d: ", i + 1);
			this.notasAsignaturas[i] = teclado.nextDouble();
		}
	}

	public void setNotasAsignaturas(Double nota1, Double nota2, Double nota3) {
		this.notasAsignaturas[0] = nota1;
		this.notasAsignaturas[1] = nota2;
		this.notasAsignaturas[2] = nota3;
	}

	public Double[] getNotasAsignaturas() {
		return this.notasAsignaturas;
	}
	
	public String toStringNotas() {
		return " Notas: \n" + "   Asignatura 1 :" + this.notasAsignaturas[0] + "\n   Asignatura 2: " + this.notasAsignaturas[1] 
				+ "\n   Asignatura 3: " + this.notasAsignaturas[2];  
	}
	
	@Override
	public String toString() {
		return "Datos del Alumno: \n Nombre: " + super.getNombre() + "\n Apellidos: " + this.getApellido() + "\n NIF: " + this.getNIF() + "\n Fecha Nacimiento:"
				 + super.toStringFecha() + "\n Numero de Matrícula: " + this.numeroMatricula + "\n Curso: " + this.curso 
				 + "\n Grupo: " + this.grupo + this.toStringNotas();
	}
	
}
