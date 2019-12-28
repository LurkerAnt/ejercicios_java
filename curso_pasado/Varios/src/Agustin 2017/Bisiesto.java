
public class Bisiesto {

	public static void main(String[] args) {
		int anho;		
		boolean bisiesto;
		
		anho= 2100;
		/*
		bisiesto= false;
		if(anho % 4 == 0){
			bisiesto= true;
			if(anho % 400 == 0)
				bisiesto= true;
			else
				if(anho % 100 == 0)
					bisiesto= false;
		}
		*/
		
		bisiesto= (anho % 4 == 0) && ((anho % 100 != 0) || (anho % 400 == 0)) ;
		
		System.out.println(bisiesto ? anho + " es bisiesto" : anho + " no bisiesto");
		System.out.println(anho + (bisiesto ? " es bisiesto" : " no bisiesto"));
		if(bisiesto == true)
			System.out.println(anho + " es bisiesto");
		else
			System.out.println(anho + " no bisiesto");
		
	}

}









