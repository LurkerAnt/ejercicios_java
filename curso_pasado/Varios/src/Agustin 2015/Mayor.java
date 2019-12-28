package alternativas;

public class Mayor {

	public static void main(String[] args) {
		int n1= 5;
		int n2= 2;
		int mayor;
		int auxiliar;
		mayor= n1 > n2 ? n1 : n2;
		System.out.printf("el mayor entre %d y %d es %d", n1, n2, mayor);

		if(n1 > n2){
			auxiliar= n1;
			n1= n2;
			n2= auxiliar;
		}
		System.out.printf("\n%d %d", n1, n2);
	
	}

}
