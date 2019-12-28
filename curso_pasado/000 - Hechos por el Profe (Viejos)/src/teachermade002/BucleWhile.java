package teachermade002;

public class BucleWhile {

	public static void main(String[] args) {

		int i = 0;
		int contador;
		final int CTE = 1;
		int vueltasTotales;

		vueltasTotales = 20;
		contador = 1; // inicializar el contador es indispensable JODIDAMENTE OBLIGATORIO, las cosas
						// tienen que empezar en algun sitio
		while (contador <= vueltasTotales) { // condicion que se ha de cumplir
			// if (contador % 2 == 0) ----muestra unicamente las vueltas pares.
			System.out.println(contador); // muestras la vuelta en la que estas y luego hechas las cuentas
			contador = contador + CTE; // CTE es una constante, se puede sumar o restar

		}

		// acumulador= acumulador +-*/ variable (se puede hacer cualquier operación)

	}
}
