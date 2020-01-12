package bombillsd;

import java.io.Serializable;

import excepciones.ExcepcionBombilla;

public class Bombilla implements Comparable<Bombilla>, Serializable{

	private boolean estado;
	private String color;
	private int potencia;
	private int tiempoVida;

	public Bombilla() throws ExcepcionBombilla {
		this.estado = false;
		this.color = "calido";
		this.potencia = 60;
		this.tiempoVida = 2000;
		validaBombilla();
	}

	public Bombilla(boolean estado, String color, int potencia, int vidaUtil) throws ExcepcionBombilla {
		this.estado = estado;
		this.color = color;
		this.potencia = potencia;
		this.tiempoVida = vidaUtil;
		validaBombilla();
	}

	private void validaBombilla() throws ExcepcionBombilla {
		if (!color.equalsIgnoreCase("calido")){
			throw new ExcepcionBombilla ("Color incorrecto");
			
		} else if (potencia<20||potencia>60) {
			throw new ExcepcionBombilla ("Valor en la portencia no valido");
			
		} else if (!(getTiempoVida()>1000 && getTiempoVida()<3000)) {
			throw new ExcepcionBombilla ("Tiempo de vida erroneo");
		}
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	

	public int getTiempoVida() {
		return tiempoVida;
	}

	public void setTiempoVida(int tiempoVida) {
		this.tiempoVida = tiempoVida;
	}
	
	@Override
	public int compareTo(Bombilla bomb) {
		if (this.isEstado() || bomb.isEstado()) {
			return -1;

		} else if (this.isEstado() == bomb.isEstado()) {
			return 0;

		} else if (!this.isEstado() || !bomb.isEstado()) {

			return -1;
		} else if (!this.isEstado() && bomb.isEstado()) {

			return 1;
		}
		return -1;

	}
	
	public void 
	
}
