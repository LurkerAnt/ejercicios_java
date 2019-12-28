package teachermade002;

public class SumaPrimeros {

	public static void main(String[] args) {
		int hasta;
		int numero;// aqui no se inicializan numeros, es un error grave
		int suma;

		hasta = 10;

		suma = 0; // inicializar un numero es esto, darle un valor inicial pa que arranque el
					// bucle
		numero = 1;
		while (numero <= hasta) {
			suma = suma + numero;
			numero++;

		}

		System.out.printf("La suuma de los %d primeros: %d", hasta, suma);

	}

}
