package punto;

public class Punto {

	private double x;
	private double y;

	public Punto() {
		this(0d, 0d);
	}

	public Punto(Punto p) {
		this(p.x, p.y);
	}

	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void situa(Double x, Double y) {
		this.setX(x);
		this.setY(y);
	}

	public void situa(Punto p) {
		situa(p.x, p.y);
	}

	public void desplaza(Double x, Double y) {
		this.setX(this.x + x);
		this.setY(this.y + y);
	}

	public Double distanciaEntre(Punto p) {
		Double o1 = Math.pow(this.x - p.x, 2);
		Double o2 = Math.pow(this.y - p.y, 2);

		return Math.pow(o1 + 02, 1 / 2d);
	}

	public Double distanciaEntre(Punto p, Punto p1) {
		return p1.distanciaEntre(p);
		// Double o1 = Math.pow(p1.x - p.x, 2);
		// Double o2 = Math.pow(p1.y - p.y, 2);

		// return Math.pow(Math.pow (o1 + 02, 1/2d);
	}

	@Override
	public String toString() {
		return "(" + this.getX() + "," + y + ")";
	}
}
