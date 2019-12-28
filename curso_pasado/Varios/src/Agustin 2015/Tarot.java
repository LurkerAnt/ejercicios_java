package funciones;

public class Tarot {
	
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
		
	static int sumaDigitos(int n){
		int suma= 0;
		while (n > 0){
			suma += n % 10;
			n /= 10;
		}
		return suma;
	}
	
	static int tarot(int d, int m, int a){
		int numero;
		if(fechaCorrecta(d, m, a)){
			numero= d + m + a;
			do{
				numero= sumaDigitos(numero);
			}while(numero > 9);
			return numero;
		}else
			return -1;
	}

	public static void main(String[] args) {
		int numero= tarot(29, 2, 2016);
		if( numero != -1)	
			System.out.println(numero);
		else
			System.out.println("error de fecha");
	}

}
