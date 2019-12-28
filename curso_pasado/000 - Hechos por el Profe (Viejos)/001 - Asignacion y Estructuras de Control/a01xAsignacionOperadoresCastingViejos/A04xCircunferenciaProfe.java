package a01xAsignacionOperadoresCastingViejos;

import java.util.Scanner;

public class A04xCircunferenciaProfe {

	public static void main(String[] args) {
		int radio;
		float longitud;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el radio: ");
		radio = teclado.nextInt();

		longitud = (float) (2 * radio * Math.PI);
		teclado.close();

		System.out.println("circunferencia:" + longitud);
		System.out.println("Sup: " + Math.PI * Math.pow((radio), 2));
		System.out.println("Volumen: " + 4 * Math.PI * Math.pow(radio, 3) / 3);

		/*
		 * int radio; float longitud; Scanner t= new Scanner(System.in);
		 * System.out.println("Valor del radio: "); radio= t.nextInt(); if(radio > 0){
		 * longitud= (float) (2 * radio * Math.PI);
		 * System.out.println("circunferencia: " + longitud); System.out.println("Sup: "
		 * + Math.PI * Math.pow(radio, 2)); System.out.println("Volumen: " +
		 * (4*Math.PI*Math.pow(radio, 3))/3); } else{ //if(radio <= 0){
		 * System.out.println("error em la entrada"); }
		 * 
		 * t.close(); }
		 */
	}

}
