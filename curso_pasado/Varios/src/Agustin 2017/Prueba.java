import java.util.Random;

public class Prueba {
	static final int SEG= 5;
	public static int diferencia(long tiempo){
		return (int)(System.currentTimeMillis() - tiempo)/1000;
	}
	public static void main(String[] args) {
		long fin;
		long inicio;
		
		Random aleatorio= new Random();
		System.out.println(aleatorio.nextInt(100));
		System.out.println(aleatorio.nextInt(100));
		System.out.println(aleatorio.nextInt(100));
		System.out.println(aleatorio.nextInt(100000));
		inicio = System.currentTimeMillis();
		fin= 0;
		System.out.println(inicio);
		while(fin < SEG) {
			fin = diferencia(inicio);
		}
		System.out.println(System.currentTimeMillis());
	}

}









