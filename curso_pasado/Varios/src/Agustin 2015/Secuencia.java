package arrays;

public class Secuencia {

	public static void main(String[] args) {
		int []a1= {1,2,3,4,5,6};
		int []a2= {7,8,9,10,11,12};
		int []a3= new int[a1.length * 2];
		int iA1, iA2, iA3;
		iA1= iA2= iA3= 0;
		int i;
		int c;
		i= 0;
		while(i < a1.length / 3){
			c= 0;
			while(c < 3){
				a3[iA3]= a1[iA1];
				iA1++;
				iA3++;
				c++;
			}
			c= 0;
			while(c < 3){
				a3[iA3]= a2[iA2];
				iA2++;
				iA3++;
				c++;
			}	
			i++;
		}
		System.out.println();
	}

}
