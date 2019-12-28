package complejo;

public class Numeros {

	public static void main(String[] args) {
		Complejo a = new Complejo (4.0,5.0);
		Complejo b = new Complejo (5.0,2.0);
		
		System.out.println(a.toString());
		a.sumar(b);
		System.out.println(a.toString());
		a.restar(b);
		System.out.println(a.toString());
		a.restar(b);
		System.out.println(a.toString());
		a.setReal(5.0);
		a.setImaginario(6.0);
		System.out.println(a.toString());
	}

}
