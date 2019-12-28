import java.lang.reflect.Array;
import java.util.Arrays;

public class Ej {
	static int[] enteros(float[] arrayF) {
		int[] aEnteros;
		aEnteros= new int[arrayF.length];
		for (int i = 0; i < arrayF.length; i++) {
			aEnteros[i] = (int)arrayF[i];
		}
		return aEnteros;
	}
	public static String elMenor(String[]cadena) {
		String menor= cadena[0];
		for(int i= 1; i < cadena.length;i++)
			if(cadena[i].compareTo(menor) < 0)
				menor= cadena[i];
		
		return menor;
	}
	
	static final int SIETE= 7;
	public static boolean longitud(int[]array) {	
		return array.length == SIETE;
	}
	static boolean rango(int [] array) {
		boolean correcto= true;
		for (int i = 0; i < array.length && correcto ; i++) {
			if(array[i] < 1 || array[i] > 49)
				correcto= false;			
		}
		return correcto;
	}
	static boolean repetido(int [] array) {
		boolean repe= false;
		
		for (int i = 0; i < array.length && !repe; i++) {
			for (int j =  i + 1; j < array.length && !repe; j++) {
				if(array[i] == array[j]) {	
					//return repe; 
					repe= true;
					//break;
				}
			}
		}
		return repe;
	}

	static boolean comprueba(int[]numero) {
		boolean correcto= true;
		if(longitud(numero) && rango(numero) && !repetido(numero))
			correcto= true;
		else
			correcto= false;	
		return correcto;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String []dias;
		dias= new String[]{"viernes", "miércoles", "jueves", "martes", "lunes"};
		//Arrays.sort(dias);
		System.out.println(elMenor(dias));
	}
		
}
