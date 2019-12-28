
public class Potencia {
	public static  float potencia(int base, int exponente) {
		// 5 ** 3 = 5 * 5 * 5
		float resultado= 1;
		//if(mdo != 0 && mdor != 0) {
		for(int s= 1; s <= Math.abs(exponente); s++) {
			resultado *= base;
			System.out.println(resultado);
		}
		//}
		if(exponente < 0)
			resultado= 1f/resultado;
		return resultado;
	}
	public static long potencia10(int exponente) {
		return (long)potencia(10, exponente);
	}
	
	
	public static void main(String[] args) {
		System.out.println(potencia10(5));
	}

}
