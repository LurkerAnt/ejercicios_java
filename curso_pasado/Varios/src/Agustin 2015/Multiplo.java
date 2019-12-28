package alternativas;

public class Multiplo {

	public static void main(String[] args) {
		int n1= 20;
		int n2= 40;
		if(n1 >= n2){
			if(n1 % n2 == 0)
				System.out.printf("%d es múltiplo de %d", n1, n2);
			else
				System.out.printf("%d NO es múltiplo de %d", n1, n2);
		}
		else{
			if(n2 % n1 == 0)
				System.out.printf("%d es múltiplo de %d", n2, n1);
			else
				System.out.printf("%d NO es múltiplo de %d", n2, n1);
		}
	}

}
