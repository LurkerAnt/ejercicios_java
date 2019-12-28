package teachermade002;

public class FechaCorrectaProfe {

	public static void main(String[] args) {

		int anno, mes, dia;
		boolean correcta;
		
		dia = 1; //1..31
		mes = 2; //1..12
		anno = 2017; //>=0
		
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia >= 1 && dia <= 30 )
				correcta= true;
			break;
		case 4:
		case 6:
		case 9:
		case 11: 
			if (dia >=1 && dia <= 30)
				correcta = true;ç
			break;
		case 2: 
			if (dia >= 1 && dia <= 28)
				correcta = true;
		default:
			correcta = false;
	}
		
		System.out.println(dia + );
		
		}

}}

}
