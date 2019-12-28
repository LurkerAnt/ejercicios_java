package teachermade002;

public class Factorial {

	public static void main(String[] args) {

	/*	n! 1 n= 0
	*		1*2*3*... * (n-1)*n n>0
	*/
		int numero = 4;
		int factorial;
		int factor;
		
	
		numero=4;
		factorial = 1;
		factor= 1;
		
		while(factor <= numero) {
			factorial = factorial * factor;
			factor++;
		}
		
		System.out.printf("%d! = %d", numero,factorial);
		
	}

}


/*numero=4;
factorial = 1;
factor= 1;

while(numero > 0) {
	factorial = factorial * numero;
	numero--;
}