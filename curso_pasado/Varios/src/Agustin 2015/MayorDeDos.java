package funciones;

public class MayorDeDos {
	
	static int daMayor(int n1, int n2){
		return n1 > n2 ? n1 : n2;
	}
		
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int mayor;

		a= 10;
		b= 40;
		c= 6;
		d= 43;
				
		//mayor= daMayor(a, b);
		//mayor= daMayor(daMayor(a, b), c);
		mayor= daMayor(daMayor(daMayor(a, b), c), d);
		mayor= daMayor(a, b);
		mayor= daMayor(mayor, c);
		mayor= daMayor(mayor, d);
		System.out.println(mayor);
		
	}

}
