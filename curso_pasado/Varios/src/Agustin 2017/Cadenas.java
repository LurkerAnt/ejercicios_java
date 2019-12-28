
public class Cadenas {
	static int posiciones(String cadena, char c) {
		int posicion= cadena.indexOf(c);
		int cuenta= 0;
		while(posicion != -1) {
			//System.out.println(posicion);
			cuenta++;
			posicion= cadena.indexOf(c, posicion + 1);
		}
		return cuenta;
		
	}
	public static void main(String[] args) {
		String cadena1= new String("una cadena");
		posiciones(cadena1, 'a');
		
		/*
		
		
		
		
		String cadena2= new String("zna ");
		//cadena1= "una cadena";
		//cadena2= "otra cadena";
		
		System.out.println(cadena1.equals(cadena2));
		//cadena1= cadena2;
		System.out.println(cadena1 == cadena2);

		System.out.println(cadena1.compareTo(cadena2));
		for (int i = 0; i < cadena1.length(); i++) {
			System.out.println(cadena1.charAt(i));			
		}
		String cadena= "uno-dos,tres,cuatro,cinco,seis";
		String []palabras;
		int espacios, posicion, palabra;
		espacios= 0;
		posicion= cadena.indexOf(cadena);
		while(posicion != -1) {
			espacios++;
			posicion= cadena.indexOf(" ", posicion + 1);
		}
		palabras= new String[espacios];
		palabra= 0;
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != ' ')
				palabras[palabra] += cadena.charAt(i);
			else
				palabra++;
			
		}
		
		System.out.println(espacios); 
		
		String []palabras2;
		palabras2= cadena.split(",");
		System.out.println(palabras2.toString());
		*/
	}

}











