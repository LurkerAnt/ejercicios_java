package funciones;

public class ValidarFechaSw {
	public static boolean esBisiesto(int anio){
		return (anio % 4 == 0) && (!(anio % 100 == 0) || (anio % 400 == 0));
	}
	static boolean fechaCorrecta(int dia, int mes, int anio){
		boolean correcta = false;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >= 1 && dia <= 30)
				correcta = true;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			correcta = dia >= 1 && dia <= 31;
			break;
		case 2:
			correcta= (dia >= 1 && dia <= 28) || (dia == 29 && esBisiesto(anio));			
			break;
		default:
			correcta = false;
		}
		return correcta;
	}
	public static void main(String[] args) {
		int dia = 29, mes = 2, anio = 2000;

		if (fechaCorrecta(29, 2, 2000))
			System.out.printf("%d/%d/%d es correcta", dia, mes, anio);
		else
			System.out.printf("%d/%d/%d NO es correcta", dia, mes, anio);
	}

}
