
public class EaX {
	static long factorial(int numero) {
		long factorial = 1;
		while (numero > 0) {
			factorial = factorial * numero--;
		}
		return factorial;
	}
	public static float potencia(int base, int exponente) {
		float resultado= 1;
		for(int s= 1; s <= Math.abs(exponente); s++) {
			resultado *= base;
		}
		if(exponente < 0)
			resultado= 1f/resultado;
		return resultado;
	}
	public static double exponencial(int x, int n) {
		double sumatorio, p, f, termino;
		sumatorio= 0;
		for(int t= 0; t <= n; t++) {
			p= potencia(x, t);
			f= factorial(t);
			termino= p/f;
			sumatorio = sumatorio + termino;
		}
		return sumatorio;
	}
	public static double exponencial(int x, float e) {
		double sumatorio, p, f, termino;
		termino= 1;
		sumatorio= 0;
		for(int t= 0; termino > e; t++) {
			p= potencia(x, t);// p=p*x
			f= factorial(t);//f=f*t
			termino= p/f;
			sumatorio = sumatorio + termino;
		}
		return sumatorio;
	}
	public static void main(String[] args) {
		System.out.println(exponencial(4, 0.0000000000001f));
		int n= 4;
		System.out.println(exponencial(n, 20));
	}

}









