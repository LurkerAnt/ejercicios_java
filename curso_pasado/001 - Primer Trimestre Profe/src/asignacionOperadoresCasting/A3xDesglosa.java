package asignacionOperadoresCasting;

public class A3xDesglosa {

	public static void main(String[] args) {
		int numero = 3746;
		int unidades, decenas, centenas, miles, numAux;
		unidades = numero % 10;// 6
		decenas = numero % 100 / 10;
		centenas = numero % 1000 / 100;
		miles = numero % 10000 / 1000;

		unidades = numero % 10;
		numero = numero / 10;
		decenas = numero % 10;
		numero = numero / 10;
		centenas = numero % 10;
		numero = numero / 10;
		miles = numero % 10;

	}

}
