
public class Ventas {
	
	static int[] mejorCaja(int [][]ventas) {
		//toda la matriz
		int mes, dia;
		mes= dia= 0;
		for (int m = 0; m < ventas.length; m++) {
			for (int d = 0; d < ventas[m].length; d++) {
				if(ventas[m][d] > ventas[mes][dia]) {
					mes= m; 
					dia= d;
				}					
			}
		}
		int []caja= {mes, dia};
		return caja;
		//return ventas[mes][dia];
		//System.out.printf("La mejor caja fue el dia %d mes %d: ", dia, mes);
		//System.out.println("y se vendió " + ventas[mes][dia]);
	}
	
	static Caja mejorCajaObjeto(int [][]ventas) {
		//toda la matriz
		int mes, dia;
		mes= dia= 0;
		for (int m = 0; m < ventas.length; m++) {
			for (int d = 0; d < ventas[m].length; d++) {
				if(ventas[m][d] > ventas[mes][dia]) {
					mes= m; 
					dia= d;
				}					
			}
		}
		Caja caja= new Caja(dia + 1, mes + 1, ventas[mes][dia]);
		return caja;
	}
	static void mejorCaja(int []vector) {
		// {2, 3, 4, 5} vector[2]= 55
	}
	static void mejorCaja(int primitivo) {
		// 4 primitivo= 77
	}
	

	public static void main(String[] args) {
		int [][]ventas= {{22, 3, 4, 5},//88 55
						 {6, 4, 9, 2},
						 {5, 6, 7, 8}};
		int []caja= mejorCaja(ventas);
		int mes= caja[0];
		int dia= caja[1];
		System.out.printf("La mejor caja fue el dia %d mes %d: ", caja[1] + 1, caja[0] + 1);
		System.out.println("y se vendió " + ventas[ mes ][ dia ]);
		Caja laCaja= mejorCajaObjeto(ventas);
		System.out.printf("La mejor caja fue el dia %d mes %d: %d ", laCaja.getDia(), laCaja.getMes(), laCaja.getVenta());
		
	}

}
