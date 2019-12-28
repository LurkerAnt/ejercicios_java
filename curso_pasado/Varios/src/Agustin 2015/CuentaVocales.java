package bucles;

public class CuentaVocales {

	static int[] cuentaVocales(String cadena){
		int[] aVocales= new int[5];
		String sVocales= "aeiou";
		int indice= 0;
		int caracter;
		while(indice < cadena.length()){
			caracter= sVocales.indexOf(cadena.charAt(indice));
			if(caracter != -1)
				aVocales[caracter]++;
			indice++;
		}
		return aVocales;
	}
	public static void main(String[] args) {
		int[]nV;
		nV= cuentaVocales("Esto es un cadena");
	}

}
