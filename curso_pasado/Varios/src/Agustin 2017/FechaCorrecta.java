
public class FechaCorrecta {

	public static void main(String[] args) {
		int dia, mes, anho;	
		boolean correcta= false;
		boolean bisiesto;
		
		dia= 29; // 1..31
		mes= 2; // 1..12
		anho= 2000; // >=0
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia >= 1 && dia <= 31)
				correcta= true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia >= 1 && dia <= 30)
				correcta= true;
			break;
		case 2: 
			if(dia >= 1 && dia <= 28 )
				correcta= true;
			break;
		default:
			correcta= false;
		}
		System.out.println(dia + " " + mes + " " + anho);
		if(correcta)
			System.out.println("correcta");
		else
			System.out.println("no correcta");
		
		bisiesto= (anho % 4 == 0) && ((anho % 100 != 0) || (anho % 400 == 0)) ;
		
		System.out.println(bisiesto ? anho + " es bisiesto" : anho + " no bisiesto");
		System.out.println(anho + (bisiesto ? " es bisiesto" : " no bisiesto"));
		if(bisiesto == true)
			System.out.println(anho + " es bisiesto");
		else
			System.out.println(anho + " no bisiesto");
		
	}

}

