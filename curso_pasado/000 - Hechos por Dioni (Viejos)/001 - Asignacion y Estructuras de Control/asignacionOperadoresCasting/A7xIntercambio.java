package asignacionOperadoresCasting;

public class A7xIntercambio {

	public static void main(String[] args) {
		int caja1, caja2, cajaAux;
		caja1 = 1;
		caja2 = 2;
		cajaAux = caja1;
		caja1 = caja2;
		caja2 = cajaAux;

		System.out.printf("Caja 1: %d, Caja 2: %d", caja1, caja2);
	}

}
