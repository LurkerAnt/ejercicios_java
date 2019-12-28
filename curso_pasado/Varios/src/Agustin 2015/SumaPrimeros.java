package bucles;

public class SumaPrimeros {

	public static void main(String[] args) {
		int contador;
		int acumulador;
		int fin= 10;
		
		contador= 1;
		acumulador= 0;
		while(contador <= fin){
			acumulador = acumulador + contador;
			contador++;
		}
		System.out.println("Suma primeros naturales: " + acumulador);
		
		contador= 0;
		acumulador= 0;
		while(contador <= fin/2){
			int par= contador * 2;
			System.out.println(par);
			acumulador = acumulador + par;
			contador++;
		}
		System.out.println("Suma pares naturales hasta: " + fin + ": " + acumulador);
		
		
	}

}
