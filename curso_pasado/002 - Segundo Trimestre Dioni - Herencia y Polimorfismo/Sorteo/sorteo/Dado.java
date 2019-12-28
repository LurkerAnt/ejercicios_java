package sorteo;

public class Dado extends Sorteo{
	public String lanzar() {
		posibilidades=Integer.toString((int)(Math.random()*6)+1);		
		return posibilidades;
	}
}
