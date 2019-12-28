package centralita;

import java.util.ArrayList;

public class Centralita {
	private ArrayList<Llamada> registroLlamadas = new ArrayList<Llamada>();
	private Integer llamadasRegistradas;
	private Double precioTotalLLamadas;
	private Double precioLLamadasProvinciales;
	private Double precioLlamadasLocales;

	public void añadirLlamadaCentralita(Llamada llamada) {
		this.registroLlamadas.add(llamada);
		this.llamadasRegistradas++;
		this.precioTotalLLamadas += llamada.getPrecioLlamada();
	}

	public void añadirLlamadaLocalCentralita(LlamadaLocal llamadaLocal) {
		this.registroLlamadas.add(llamadaLocal);
		this.llamadasRegistradas++;
		this.precioTotalLLamadas += llamadaLocal.getPrecioLlamada();
	}

	public void añadirLlamadaProvincial(LlamadaProvincial llamadaProvincial) {
		this.registroLlamadas.add(llamadaProvincial);
		this.llamadasRegistradas++;
		this.precioTotalLLamadas += llamadaProvincial.getPrecioLlamada();
	}

	public Integer getNumeroLlamadasRealizadas() {
		return this.llamadasRegistradas;
	}

	public Double getPrecioTotalDeLlamadas() {
		return this.precioTotalLLamadas;
	}

	public Double getPrecioTotalLlamadasLocales() {
		for (int i = 0; i < registroLlamadas.size(); i++) {
			if (registroLlamadas.get(i).getTipoLlamada() == 'l') {
				this.precioLlamadasLocales += registroLlamadas.get(i).getPrecioLlamada();
			}
		}
		return this.precioLlamadasLocales;
	}

	public Double getPrecioTotalLlamadasProvinciales() {
		for (int i = 0; i < registroLlamadas.size(); i++) {
			if (registroLlamadas.get(i).getTipoLlamada() == 'p') {
				this.precioLLamadasProvinciales += registroLlamadas.get(i).getPrecioLlamada();
			}
		}
		return this.precioLLamadasProvinciales;
	}
}
