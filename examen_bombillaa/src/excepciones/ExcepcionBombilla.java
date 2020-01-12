package excepciones;

public class ExcepcionBombilla extends Exception {

	public ExcepcionBombilla () {
		super("Error al crear la bombilla");
	}
	
	public ExcepcionBombilla(String msn) {
		super(msn);
	}
	
}
