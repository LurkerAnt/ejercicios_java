package personaClase;

public class PruebasCentro {

	public static void main(String[] args) {
		PersonaClase p1;
		PersonaClase []array = new PersonaClase[3];
		PersonaClase persona = new PersonaClase("1", "persona1", null);
		AlumnoClase alumno = new AlumnoClase("2", "alumno2", null, null, null, null, null);
		Profesor profesor = new Profesor ("3", "profesor 3", null, null, null);
		System.out.println(persona);
		System.out.println(alumno);
		System.out.println(profesor);
		
		p1=persona;
		p1=alumno;
		((AlumnoClase)p1).getGrupo();
		p1=profesor;
		
		array[0] = persona; 
		array[1] = alumno;
		array[1] = profesor;
		
		for (PersonaClase p: array)
			//System.out.println(p.getFicha());
			System.out.println(((AlumnoClase)p).getGrupo());
			
		/*
		System.out.println(array[0].getFicha());
		System.out.println(array[1].getFicha());
		System.out.println(array[2].getFicha());
		*/


		
	}

}
