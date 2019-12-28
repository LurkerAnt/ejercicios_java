
public class MostrarDosOrdenados {

	public static void main(String[] args) {
		int n1, n2;
		int auxiliar;
		boolean multiplo;
		n1 = 3;
		n2 = 5;
		
		System.out.println(n1 + " " + n2);
		if( n1 < n2){
			auxiliar = n1;
			n1 = n2;
			n2 = auxiliar;
		}

		System.out.println(n1 + " " + n2);
		if (n1 % n2 == 0)
			System.out.println(n1 + " es múltiplo de " + n2);
		else
			System.out.println(n1 + " NO es múltiplo de " + n2);
		
		
		
		
		
		
		
		
		/*
		if (n1 < n2){
			if (n2 % n1 == 0)
				System.out.println(n2 + " es múltiplo de " + n1);
			else
				System.out.println(n2 + " NO es múltiplo de " + n1);
		}else
		if (n1 >= n2){
			if (n1 % n2 == 0)
				System.out.println(n1 + " es múltiplo de " + n2);
			else
				System.out.println(n1 + " NO es múltiplo de " + n2);
		}
		/*
		 * else if(n1 == n2) if(n2 % n1 == 0) System.out.println(n1 +
		 * " es múltiplo de " + n2);
		 */
	}

}
