package bucles;

public class Perfectos {

	public static void main(String[] args) {
		int sumaDivisores;

		for (int numero = 1; numero <= 100000; numero++) {
			// suma todos los divisores
			sumaDivisores = 0;
			for (int divisor = 1; divisor <= numero / 2; divisor++) {
				if (numero % divisor == 0)
					sumaDivisores += divisor;
			}
			sumaDivisores += numero;
			//System.out.println(sumaDivisores + " es la suma");

			int sDMN = sumaDivisores - numero;
			if (sDMN == numero)
				System.out.println(numero + " SI es perfecto");
			//lse
				//System.out.println(numero + " NO es perfecto");
		}
	}

}
