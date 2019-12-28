package personaClase;

import java.util.Arrays;

import och1_fecha.Fecha;

public class AlumnoClase extends PersonaClase{
	private Integer numMatricula;
	private Integer curso;
	private String grupo;
	private Integer[] notas;
		
	public AlumnoClase(String nombre, String nif, Fecha fechaNacimiento, Integer numMatricula, Integer curso, String grupo, Integer[]notas) {
		super(nif, nombre, fechaNacimiento);
		this.numMatricula = numMatricula;
		this.curso = curso;
		this.grupo = grupo;
		this.notas = notas;
	}
	
	public void setNumMatricula(Integer numMatricula) {
		this.numMatricula =numMatricula;
	}
	public Integer getNumMatricula() {
		return numMatricula;
	}
	
	public void setCurso(Integer curso) {
		this.curso = curso;
	}
	public Integer getCurso() {
		return curso;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getGrupo() {
		return grupo;
	}
	
	public void setNotas(Integer[]notas) {
		this.notas = notas;
	}
	public Integer[] getNotas() {
		return notas;
	}

	@Override
	public String toString() { //Alumno
		return "AlumnoClase [numMatricula=" + super.toString() + numMatricula + ", curso=" + curso + ", grupo=" + grupo + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	public String ptoString() { //Persona
		return "AlumnoClase [numMatricula=" + numMatricula + ", curso=" + curso + ", grupo=" + grupo + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	
	public String getFicha() {
		return "AlumnoClase [numMatricula=" + numMatricula + ", curso=" + curso + ", grupo=" + grupo + ", notas="
				+ Arrays.toString(notas) + ", toString()=" + super.toString() + "]";
	}
	
}

