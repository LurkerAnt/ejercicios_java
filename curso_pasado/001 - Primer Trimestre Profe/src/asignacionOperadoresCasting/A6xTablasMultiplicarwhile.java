package asignacionOperadoresCasting;

public class A6xTablasMultiplicarwhile {

	public static void main(String[] args) {
		int mdo, mdor, producto, contador;

		mdo = 1;
		while (mdo <= 10) {
			System.out.println("Tabla de multiplicar: " + " " + mdo);
			mdor = 1;
			while (mdor <= 10) {
				// producto=mdo*mdor;
				producto = 0;
				contador = 1;
				while (contador <= mdor) {
					producto += mdo;
					contador++;
				}
				System.out.printf("%3d *%3d =%4d\n", mdo, mdor, producto);
				mdor++;
			}
			mdo++;
		}
	}
}
