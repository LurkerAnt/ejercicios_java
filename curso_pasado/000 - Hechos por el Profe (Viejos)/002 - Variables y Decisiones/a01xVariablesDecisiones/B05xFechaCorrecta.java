package a01xVariablesDecisiones;

public class B05xFechaCorrecta {

	public static void main(String[] args) {
		int dia = 29, mes = 2, anio = 2000;
		boolean correcta = false;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia >= 1 && dia <= 30)
				correcta = true;
			/*
			 * else correcta= false;
			 */
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia >= 1 && dia <= 31)
				correcta = true;
			/*
			 * else correcta= false;
			 */
		} else if (mes == 2) {// bisiesto
			if (dia >= 1 && dia <= 28)
				correcta = true;
			/*
			 * else correcta= false;
			 */
		}
		// if(correcta == true)
		if (correcta)
			System.out.printf("%d/%d/%d es correcta", dia, mes, anio);
		else
			System.out.printf("%d/%d/%d NO es correcta", dia, mes, anio);

		/*
		 * int anno, mes, dia; boolean correcta;
		 * 
		 * dia = 1; //1..31 mes = 2; //1..12 anno = 2017; //>=0
		 * 
		 * switch (mes) { case 1: case 3: case 5: case 7: case 8: case 10: case 12: if
		 * (dia >= 1 && dia <= 30 ) correcta= true; break; case 4: case 6: case 9: case
		 * 11: if (dia >=1 && dia <= 30) correcta = true;ç break; case 2: if (dia >= 1
		 * && dia <= 28) correcta = true; default: correcta = false; }
		 * 
		 * System.out.println(dia + );
		 * 
		 * }
		 * 
		 * }
		 */
	}

}
