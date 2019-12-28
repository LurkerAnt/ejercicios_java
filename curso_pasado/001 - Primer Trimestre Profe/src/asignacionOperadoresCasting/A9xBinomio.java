package asignacionOperadoresCasting;

public class A9xBinomio {

	static double factorial(int n) {
		double elFactorial = 1;
		for (int factor = 1; factor <= n; factor++)
			elFactorial = elFactorial * factor;
		return elFactorial;
	}

	static double factorial1(int n) {
		double elFactorial = 1;
		while (n >= 1) {
			elFactorial = elFactorial * n;
			n--;
		}

		return elFactorial;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
