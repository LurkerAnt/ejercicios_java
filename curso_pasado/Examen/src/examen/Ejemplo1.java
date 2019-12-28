package examen;

public class Ejemplo1 {

	static int[] enteros(float[] arrayF) {
		int[] aEnteros;
		aEnteros = new int[arrayF.length];
		for (int i = 0; i < arrayF.length; i++) {
			aEnteros[i] = (int) arrayF[i];
		}
		return aEnteros;
	}

	public static void main(String[] args) {
		float [] aF= new float [] {1,2,3,4};
		enteros (aF);
		Arrays.sort
	}

}
