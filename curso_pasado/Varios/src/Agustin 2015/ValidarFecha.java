package alternativas;

public class ValidarFecha {

	public static void main(String[] args) {
		int dia= 29, mes= 2, anio=2000;
		boolean correcta= false;
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
			if(dia >= 1 && dia <= 30)
				correcta= true;
			/*else
				correcta= false;*/
		}
		else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			if(dia >= 1 && dia <= 31)
				correcta= true;
			/*else
				correcta= false;*/
		}
		else if( mes == 2){//bisiesto
			if(dia >= 1 && dia <= 28)
				correcta= true;
			/*else
				correcta= false;*/
		}
		//if(correcta == true)
		if(correcta)
			System.out.printf("%d/%d/%d es correcta", dia, mes, anio);
		else
			System.out.printf("%d/%d/%d NO es correcta", dia, mes, anio);			
	}

}
