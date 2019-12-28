package teachermade003;

public class EaX {
	static long factorial(int numero) {
		long factorial = 1;
		while (numero > 0) {
			factorial = factorial * numero--;
		}
		return factorial;
	}

	public static float potencia(int base, int exponente) {
		float resultado = 1;
		for (int s = 1; s <= Math.abs(exponente); s++) {
			resultado *= base;
		}

		if (exponente < 0)
			resultado = 1f / resultado;
		return resultado;
	}

	public static double exponencial(int x, int n) {
		double sumatorio, p, f, termino;
		sumatorio = 1;
		for (int t = 0; t <= n; t++) {
			p = potencia(x, t);
			f = factorial(t);
			termino = p / f;
			sumatorio = sumatorio + termino;
		}
		return sumatorio;
	}

	public static double exponencial(int x, float e) {
		double sumatorio, p, f, termino;
		termino = 1;
		sumatorio = 1;
		for (int t = 0; termino > e; t++) {
			p = potencia(x, t);// p=p*x
			f = factorial(t);// f=f*t
			termino = p / f;
			sumatorio = sumatorio + termino;
		}
		return sumatorio;
	}

	public static void main(String[] args) {
		for (int t = 0; t < 20; t++)
			System.out.println(exponencial(3, 2));

	}

}
