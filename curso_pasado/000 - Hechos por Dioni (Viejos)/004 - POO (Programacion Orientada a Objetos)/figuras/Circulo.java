package figuras;

public class Circulo {

	private Punto a = new Punto();
	private Punto b = new Punto();

	public Circulo() {
		this.a.setX(0);
		this.a.setY(0);
		this.b.setX(0);
		this.b.setY(0);
	}

	public Circulo(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public Double getAx() {
		return a.getX();
	}

	public void setAx(Double a) {
		this.a.setX(a);
	}

	public Double getBx() {
		return b.getX();
	}

	public void setBx(Double b) {
		this.b.setX(b);
	}

	public Double getAy() {
		return a.getY();
	}

	public void setAy(Double x) {
		this.a.setY(x);
		;
	}

	public Double getBy() {
		return b.getY();
	}

	public void setBy(Double y) {
		this.b.setY(y);
	}

	public Double calcularDistanciaDesde(Punto a, Punto b) {
		Double distancia = Math.sqrt((Math.pow((a.getX() - b.getY()), 2)) + (Math.pow((a.getY() - b.getY()), 2)));
		return distancia;
	}

	public Double calcularArea() {
		Double area = 0.0;
		return area;
	}

	public Double calcularPerimetro() {
		Double perimetro = 0.0;
		return perimetro;
	}

}
