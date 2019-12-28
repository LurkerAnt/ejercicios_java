package bucles;

public class Amigos {
	public static void main(String[] args) {
		int numero1;
		int sumaDivisores1;
		int numero2;
		int sumaDivisores2;

		// suma todos los divisores
		numero1= 284;
		sumaDivisores1 = 0;
		for (int divisor = 1; divisor <= numero1 / 2; divisor++) {
			if (numero1 % divisor == 0)
				sumaDivisores1 += divisor;
		}
		sumaDivisores1 += numero1;
		System.out.println(numero1);
		//System.out.println(sumaDivisores1 + " es la suma de divisores del primero");

		// suma todos los divisores
		numero2= 220;
		sumaDivisores2 = 0;
		for (int divisor = 1; divisor <= numero2 / 2; divisor++) {
			if (numero2 % divisor == 0)
				sumaDivisores2 += divisor;
		}
		sumaDivisores2 += numero2;
		System.out.println(numero2);
		//System.out.println(sumaDivisores2 + " es la suma de divisores del segundo");

		int sDMN1 = sumaDivisores1 - numero1;
		int sDMN2 = sumaDivisores2 - numero2;
		if (sDMN1 == numero2 && sDMN2 == numero1)
				System.out.println(sDMN1 +" " + sDMN2 + " SI amigos");
			else
				System.out.println(" NO amigos");
	}

}
