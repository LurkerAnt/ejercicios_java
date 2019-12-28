package complejo;

public class Complejo {
	private double real;
	private double imaginario;
	
	
	public Complejo() {
		this.real=0.0;
		this.imaginario=0.0;
	}
	
	public Complejo (double real, double imaginario) {
		this.real=real;
		this.imaginario=imaginario;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginario() {
		return imaginario;
	}
	
	public void setImaginario(double imaginario) {
		this.imaginario=imaginario;
	}
	
	public void setReal(double real) {
		this.real=real;
	}

	@Override
	public String toString() {
		return real + "+" + imaginario + "i.";
	}
	
	public void sumar (Complejo a) {
		this.real+=a.real;
		this.imaginario+=a.imaginario;
	}
	
	public void restar (Complejo a) {
		this.real-=a.real;
		this.imaginario-=a.imaginario;
	}
	
	
}
