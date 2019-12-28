
public class SumaPrimeros {

	public static void main(String[] args) {
		int hasta;
		int numero;
		int suma;
		
		hasta= 10;
		
		suma= 0;
		//numero= 1;
		for(numero= hasta; numero >= 1; numero--){
			suma= suma + numero; 
			//numero++;
		}
		System.out.printf("Suma de los %d primeros: %d", hasta, suma);
	}

}
