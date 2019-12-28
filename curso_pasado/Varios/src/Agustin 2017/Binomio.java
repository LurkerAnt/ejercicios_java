
public class Binomio {
	public static long factorial(int numero) {
		long cF= 1;
		while(numero > 0)
			cF *= numero--;
		/*
		for(int factor= 1; factor <= numero; factor++)
			cF *= factor;
		*/
		return cF;
	}
	public static double binomio(int m, int n) {
		return (double)factorial(m) / (factorial(n) * factorial(m - n)); 
	}
	
	public static void main(String[] args) {
				
		System.out.println(binomio(6, 2));
		
	}

}








