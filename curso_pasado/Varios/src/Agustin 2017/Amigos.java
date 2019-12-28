
public class Amigos {

	public static int sumaDivisores(int numero) {		
		int suma;
		suma = 0;
		for (int divisor = 1; divisor <= numero / 2; divisor++)
			if (numero % divisor == 0)
				suma += divisor;
		suma += numero;
		//System.out.println(suma);
		return suma;
	}

	public static  boolean amigos(int numero1, int numero2) {
		int sumaPrimero= sumaDivisores(numero1) - numero1;
		int sumaSegundo = sumaDivisores(numero2) - numero2;	

		return sumaPrimero == numero2 && sumaSegundo == numero1;
	}

	
	
	
	
	public static void main(String[] args) {
		int a, b;
		a = 220;
		b = 284;
		//Amigos a= new Amigos();
		if(amigos(a, b))
			System.out.println(" SI amigos");
		else
			System.out.println(" NO amigos");
			
	}

}















