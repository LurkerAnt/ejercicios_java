
public class IfSimple {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		n1= 12;
		n2= 12;
		
		if(n1 == n2)
			System.out.println(n1 + " y " + n2 + " son iguales");
		else //if(n1 != n2)
			System.out.println(n1 + " y " + n2 + " son distintos");

		if(n1 >= 0)
			System.out.println("positivo");
		else //if(n1 < 0)
			System.out.println("negativo");

		
		
		if (n1 == 0) {
			System.out.println("nulo");
			System.out.println("sentencia 2");
		} else if (n1 > 0) {
			System.out.println("positivo");
		} else {
			System.out.println("negativo");
		}

		if (n1 >= 0){
			if (n1 == 0)
				System.out.println("nulo");
			else
				System.out.println("positivo");
		}else
			System.out.println("negativo");
		
		
		
		
		
		System.out.println("el mayor es " + (n1 > n2 ? n1 : n2));
		if(n1 > n2)
			System.out.println(n1);
		if(n1 < n2)
			System.out.println(n2);
	}
	
	
	

}











