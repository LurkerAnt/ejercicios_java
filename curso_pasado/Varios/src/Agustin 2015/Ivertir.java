package arrays;

import java.lang.reflect.Array;

public class Ivertir {
	static void visualiza(int[]vector){
		for(int i= 0; i < vector.length; i++)
			System.out.printf("posición [%d]: %d\n", i, vector[i]);
		}
	static void visualiza2(int[]vector){
		System.out.println();
		for(int i= 0; i < vector.length; i++)
			System.out.printf("%4d", vector[i]);
		}
	static void invertir(int []vector){
        int aux;
        int i, j;
        
        for(i= 0, j= vector.length - 1; i < j; i++, j--){
        	aux= vector[i];
        	vector[i]= vector[j];
        	vector[j]= aux;
        }
        /*
        for(i= 0; i < vector.length / 2; i++){
        	aux= vector[i];
        	vector[i]= vector[vector.length - i - 1];
        	vector[vector.length - i - 1]= aux;
        }
        */
        /*
        aux= vector[1];
        vector[1]= vector[8];
        vector[8]= aux;

        aux= vector[2];
        vector[2]= vector[7];
        vector[7]= aux;
        */
	}
	public static void main(String[] args) {
		int []array= new int[]{7, 6, 7, 8, 2, 3, 8, 8, 3, 4};
		
		visualiza2(array);
		invertir(array);
		visualiza2(array);
		
	}

}
