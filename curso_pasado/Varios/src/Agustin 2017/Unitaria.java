
public class Unitaria {

	public static void main(String[] args) {
		int [][]unitaria= new int [5][5];
		/*for (int f = 0; f < unitaria.length; f++) {
			for (int c = 0; c < unitaria[f].length; c++) {
				
				//unitaria[f][c]= f == c ? 1 : 0;
				if(f == c || unitaria.length == f + c + 1)
					unitaria[f][c]= 1;
				else
					unitaria[f][c]= 0;
			}			
		}*/
		for (int f = 0; f < unitaria.length; f++) {
			//if()
			unitaria[f][f]= 1;
			unitaria[f][unitaria.length - f - 1]= 1;
		}
		System.out.println();
		for (int f = 0; f < unitaria.length; f++) {
			for (int c = 0; c < unitaria[f].length; c++) {
				System.out.printf("%3d", unitaria[f][c]);
			}			
			System.out.println();
		}
	}

}
