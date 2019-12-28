package teachermade003;

public class Metodos {

	public static int aleatorio(int a, int b) {
		int may = Math.max(a, b);
		int men = Math.min(a, b);
		return (int) (Math.random() * (may - men + 1) + men);
	}

	public static int resto(int ddo, int dsor) {
		if (dsor > 0)
			while (ddo >= dsor)
				ddo = (ddo - dsor);
	}

	public static void main(String[] args) {

	}

}
