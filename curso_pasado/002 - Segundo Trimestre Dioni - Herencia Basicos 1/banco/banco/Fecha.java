package banco;

import java.util.Calendar;

//Las propiedades privadas dia, mes y año de tipo entero las tres.

public class Fecha {
	Integer dia;
	Integer mes;
	Integer year;
//Los constructores que creas necesarios.

	public Fecha() {
		this.dia = Calendar.DAY_OF_MONTH;
		this.mes = Calendar.MONTH;
		this.year = Calendar.YEAR;
	}

	public Fecha(Integer dia, Integer month, Integer year) {
		this.dia = dia;
		this.mes = month;
		this.year = year;

		if (!fechaCorrecta()) {
			this.dia = Calendar.DAY_OF_MONTH;
			this.mes = Calendar.MONTH;
			this.year = Calendar.YEAR;
		}
	}

	// Métodos getter y setter: dar y poner fecha.

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	// Método toString.
	@Override
	public String toString() {
		return "Fecha: " + this.dia + "/" + this.mes + "/" + this.year;
	}

	// Metodo para comprobar si el año es bisiesto.
	public boolean esBisiesto() {
		return (this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0));
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
