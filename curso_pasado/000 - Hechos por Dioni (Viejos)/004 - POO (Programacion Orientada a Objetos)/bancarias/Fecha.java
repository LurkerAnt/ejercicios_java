package bancarias;

import java.time.LocalDate;
import java.Class.Calendar;

public class Fecha {
	private int dia;
	private int mes;
	private int year;

	public Fecha(int dia, int mes, int year) {
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean comprobarFecha(int dia, int mes, int year) {
		boolean esCorrecta = false;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia <= 30) {
				esCorrecta = true;
			}
		} else if (mes == 1 || mes == 3 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia <= 31) {
				esCorrecta = true;
			}

		} else if (mes == 2) {
			if (dia <= 28) {
				esCorrecta = true;
			} else {
				if (dia == 29) {
					if (year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0))) {
						esCorrecta = true;
					}
				}
			}
		}
		return esCorrecta;
	}

	public String toString(boolean esCorrecta) {
		if (esCorrecta = false) {

			LocalDate diaDeHoy = LocalDate.now();
			String incorrecta = "Fecha incorrecta" + diaDeHoy;
			return incorrecta;
		} else {
			return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + year + "]";
		}
	}
}
