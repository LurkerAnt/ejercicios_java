package alternativas;

public class DiaSemana {

	public static void main(String[] args) {
		String dia="Martes";
		int nDia;
		switch(dia){
		case "Lunes":
			nDia= 1;
			break;
		case "Martes":
			nDia= 2;
			break;
		case "Miércoles":
			nDia= 3;
			break;
		default:
			nDia= 0;
		}
		if (nDia == 0)
			System.out.println("error");
		else
			System.out.println(dia + " se corresponde con el " + nDia);
	}

}
