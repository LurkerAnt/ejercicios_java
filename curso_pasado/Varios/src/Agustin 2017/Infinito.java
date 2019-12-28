
public class Infinito {

	public static void main(String[] args) {
		int i= 0;
		
		int contador;
		final int CTE= 1;
		int vueltasTotales;
		
		vueltasTotales= 20;
		contador= 1;
		while(contador <= vueltasTotales){
			if(contador % 2 == 0 || contador % 3 == 0)
				System.out.println(contador);
			contador= contador + 1;
		}
		
		//acumulador= acumulador +-*/ variable 
		/*
		while (i<10){
			System.out.println("NO Infinito");
			i++;
		}
		*/
	}
}
