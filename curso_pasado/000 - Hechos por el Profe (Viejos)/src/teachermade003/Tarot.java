package teachermade003;

public class Tarot {

	public static boolean esBisiesto(int year) {
		return true;

	}

	public static boolean fechaCorrecta ( int dia, int mes, int year) ´{
			return true;
		}

	public static int sumaDigitos(int numero) {
		int suma;
		suma = 0;
		for (; numero > 0; numero = numero / 10) {
			suma = suma + numero % 10;
		}
		return suma;
	}

	public static int tarot (int dia, int mes, int year) {
			int N = -1;
			int suma = 0;
			if (!fechaCorrecta (dia, mes, year)) {
				N = dia + mes + year;
				while (N>9) {
					N= sumaDigitos(N);
					}		
				}
			}return-1;return 0;

	}

	public static void main(String[] args) {

		int tarotNumber= tarot (1, 1, 2017);//2019, 12, 3
		if (tarotnumber>= 0)
			System.out.println(tarotNumber);
		else
			System.out.println("info incorrecta");
	}

}
