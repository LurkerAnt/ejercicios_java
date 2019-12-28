package asignacionOperadoresCasting;

// Calcular los factores primos de un número. Descomposicion factorial de un número en sus factories primos.

public class B2xFactoresPrimos {
	static boolean esPrimo(int n) {
		return true;
	}

	static boolean esFactorPrimo(int n, int f) {
		return n % f == 0;
	}

	static void factoresPrimos(int n) {
		int factor = 2;
		System.out.println("Factores primos del " + n);
		while (n > 1) {
			if (esPrimo(factor)) {
				while (esFactorPrimo(factor, n)) {
					System.out.printf("%d ", factor);
					n = n / factor;
				}
			}
			factor++;
		}
	}

	public static void main(String[] args) {
		factoresPrimos(8);
	}

}
