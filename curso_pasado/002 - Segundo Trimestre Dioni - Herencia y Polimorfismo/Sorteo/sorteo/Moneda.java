package sorteo;

public class Moneda {
	public String lanzar() {
		if (Math.random() > 0.5) {
			return "Cara";
		} else {
			return "Cruz";
		}
	}
}
