package figuras;

import java.util.Scanner;

public class Punto {
	private Double x;
	private Double y;
	Scanner T = new Scanner(System.in);

	public Punto() {
		this(0d, 0d);
	}

	public Punto(double x, double y) {
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

	public void situa() {
		System.out.println("Introduce la coordenada X: ");
		this.x = T.nextDouble();
		System.out.println("Introduce la coordenada Y: ");
		this.y = T.nextDouble();
	}

	public void desplaza() {
		System.out.println("Introduce el desplazamiento de X:");
		this.x = this.x + T.nextDouble();
		System.out.println("Introduce el desplazamiento de Y:");
		this.y = this.y + T.nextDouble();
	}

	public Double calcularDistanciaDesde(Punto a, Punto b) {
		Double distancia = Math.sqrt((Math.pow((a.x - b.x), 2)) + (Math.pow((a.y - b.y), 2)));
		return distancia;
	}
}
