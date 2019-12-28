package bucles;

public class Factorial {

	public static void main(String[] args) {
		int n= 0;
		int factor; // contador
		float factorial; // acumulador
		// 1*2*3*4*5
		factor= 1;
		factorial= 1;
		while(factor <= n){
			factorial = factorial * factor;
			factor++;
		}
		System.out.printf("%d!= %f", n, factorial);
		
		System.out.println();
		// 5*4*3*2*1
		int aux= n;
		factorial= 1;
		while(n > 0){
			factorial = factorial * n;
			System.out.print(n + "*");
			n--;
		}
		System.out.println();
		System.out.printf("%d!= %f", aux, factorial);
	}

}
