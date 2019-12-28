package funciones;

public class Binomio {
	static long factorial(int n){
		long f;
		for(f= 1, n= n ;n > 0;n--){
			f = f * n;
		}
		return f;
	}
	public static void main(String[] args) {
		int n;
		int m;
		float resultado;
		n= 4;
		m= 3;
		resultado= factorial(n)/(factorial(m)*factorial( n - m));
		System.out.println(resultado);
	}

}
