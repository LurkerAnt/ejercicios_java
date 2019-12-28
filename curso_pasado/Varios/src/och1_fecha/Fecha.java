package och1_fecha;

import java.util.Calendar;
import java.util.TimeZone;

public class Fecha {
	protected Integer dia;
	protected Integer mes;
	protected Integer anio;

	public Fecha() {
		this.dia = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.DAY_OF_MONTH);
		this.mes = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.MONTH) + 1;
		this.anio = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.YEAR);
	}

	public Fecha(Integer dia, Integer mes, Integer anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

		if (!fechaCorrecta()) {
			this.dia = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.DAY_OF_MONTH);
			this.mes = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.MONTH) + 1;
			this.anio = Calendar.getInstance(TimeZone.getDefault()).get(Calendar.YEAR);
		}
	}

	public Integer getDia() {
		return this.dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return this.mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

	public boolean esBisiesto() {
		return (this.anio % 4 == 0) && ((this.anio % 100 != 0) || (this.anio % 400 == 0));
	}

	public boolean fechaCorrecta() {
		boolean correcta = false;
		switch (this.mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (this.dia >= 1 && this.dia <= 31)
				correcta = true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (this.dia >= 1 && this.dia <= 30)
				correcta = true;
			break;
		case 2:
			if ((this.dia >= 1 && (this.dia <= 28 || (this.dia == 29 && esBisiesto()))))
				correcta = true;
			break;
		default:
			correcta = false;
		}
		return correcta;
	}
}
