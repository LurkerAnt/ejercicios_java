package arrays01;

public class MetodosArrays {
	static int buscaSecuencial(int [] vector, int clave) {
		boolean encontrado=false;
		int actual;
		for (actual=0; encontrado ==false && actual < vector.length;) {
			if (clave ==vector[actual])
				encontrado=true;
			else
				actual++;
		}
		return encontrado == true ? actual : -1;
	}
	static int buscaSecuencial(String [] vector, String clave) {
		boolean encontrado=false;
		int actual;
		for (actual=0; encontrado ==false && actual < vector.length;) {
			if (clave.compareToIgnoreCase(vector[actual])==0)
				encontrado=true;
			else
				actual++;
		}
		return encontrado == true ? actual : -1;
	}
	static int buscaSecuencialOrdenado (int[]vector, int clave) {
		//esto falla por todos lados. Arreglalo.
		int actual;
		actual= 0;
		//{4,7,7,8,8,12,19} contenido del array
		while (actual<vector.length&& clave>=vector[actual]) {
			actual++;
		}
		return clave== vector[actual] ? actual : -1;
	}
	public static void main(String[] args) {
		
		System.out.printf("Posición: %d", buscaSecuencialOrdenado(vector, clave));
		
	}

}
