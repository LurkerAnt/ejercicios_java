package och1_fecha;

public class FechaTest {

	public static void main(String[] args) {
		Fecha f = new Fecha();
		System.out.println(f.toString());

		Fecha f2 = new Fecha(23, 2, 2018);
		System.out.println(f2.toString());

		Fecha f3 = new Fecha(30, 2, 2018);
		System.out.println(f3.toString());

	}

}
