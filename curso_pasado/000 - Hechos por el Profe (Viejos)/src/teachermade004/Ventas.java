package teachermade004;

//dia y mes en el que se hizo la mejor caja
public class Ventas {

	static int[] mejorCaja(int[][] ventas) {
		// recibe toda la matriz
		// matriz[0][3]=88
		// encuentra el mayor elemento de la matriz
		int mes, dia;
		mes = dia = 0;
		for (int m = 0; m < ventas.length; m++) {
			for (int d = 0; d < ventas.length; d++) {
				if (ventas[m][d] > ventas[mes][dia]) {
					mes = m;
					dia = d;
				}
			}
		}
		int[] caja = { mes, dia };
		return caja;
		// System.out.printf("La mejor caja fue el dia %d y el mes %d", dia, mes);
		// System.out.println("y se vendió: " + ventas[mes][dia]);
	}

	static void mejorCajaObjeto(int[][] ventas) {
		//recibe { 2, 3, 4, 5 }
		//vector [2]=55
		int mes, dia;
		mes=dia=0;
		for(int m=0;m<ventas.length;m++) {
			for (int d=0;d<ventas)
		}
	}

	static void mejorCaja(int primitivo) {
		// recibe 4
	}

	public static void main(String[] args) {

		int[][] ventas = { { 2, 3, 4, 5 }, { 6, 4, 9, 2 }, { 5, 6, 7, 8 } }; // { 2, 3, 4, 5 } 5 pasa a ser 88 4 pasa a
																				// ser 55
		int[] caja = mejorCaja(ventas);
		int mes = caja[0];
		int dia = caja[1];
		System.out.printf("La mejor caja fue el dia %d mes %d: ", caja[1], caja[0]);
		System.out.println("y se vendió: " + ventas[mes][dia]);
		mejorCaja(ventas);
		mejorCaja(ventas[0]);
		mejorCaja(ventas[0][2]);
	}
}
