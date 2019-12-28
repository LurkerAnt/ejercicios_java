package alternativas;

public class Multiplo2 {

	public static void main(String[] args) {
		int n1= 5;
		int n2= 20;
		int auxiliar;
		/*
		 * 
		 */
		if(n1 < n2){
			auxiliar= n1;
			n1= n2;
			n2= auxiliar;
		}
		if(n1 % n2 == 0)
			System.out.printf("%d es múltiplo de %d", n1, n2);
		else
			System.out.printf("%d NO es múltiplo de %d", n1, n2);
	}

}
