
public class Tarot {

	public static boolean esBisiesto(int anho) {
		return (anho % 4 == 0) && ((anho % 100 != 0) || (anho % 400 == 0));
	}

	public static boolean fechaCorrecta(int dia, int mes, int anho) {
		boolean correcta= false;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			correcta= (dia >= 1 && dia <= 31);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >= 1 && dia <= 30)
				correcta = true;
			break;
		case 2:
			if (dia >= 1 && (dia <= 28 || (dia == 29 && esBisiesto(anho))))
				correcta = true;
			break;
		default:
			correcta = false;
		}

		return correcta;
	}

	public static int sumaDigitos(int numero) {
		int suma;
		suma = 0;
		for( ;numero > 0; numero = numero / 10) {
			suma = suma + numero % 10;					
		}
		return suma;
	}
	public static int tarot(int dia, int mes, int anho) {
		int n= -1;
		int suma;
		if(fechaCorrecta(dia, mes, anho)) {
			n= dia + mes + anho;
			while(n > 9) {											
				n= sumaDigitos(n);
			}
		}		
		return n;
	}

	public static void main(String[] args) {
		// System.out.println(esBisiesto(2000));
		int nT= tarot(1, 9, 2055);// 2019, 12, 3
		if(nT >= 0)
			System.out.println(nT);
		else
			System.out.println("inf incorrec");
	}

	
	
	
	
	
	
	
	
	
	
	
}
