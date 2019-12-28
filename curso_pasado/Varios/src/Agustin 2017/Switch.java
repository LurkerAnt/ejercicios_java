
public class Switch {

	public static void main(String[] args) {
		String diaSemana;
		int dia;
		boolean laborable;
		diaSemana= "miercoles";
		switch (diaSemana) {
		case "lunes":
			laborable= true;
			break;
		case "martes":
			laborable= true;
			break;
			
		case "miercoles":
			laborable= true;
			break;

		default:
			dia= 0;
			break;
		}
		/*
		if(diaSemana == "lunes")
			dia= 1;
		else
			if(diaSemana == "martes")
				dia= 2;
		//...
		 * 
		 */
	}
	

}
