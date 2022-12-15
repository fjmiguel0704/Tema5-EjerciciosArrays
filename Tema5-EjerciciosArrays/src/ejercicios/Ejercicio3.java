package ejercicios;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
//		int numeros=0;
//		Scanner read = new Scanner (System.in);
//		System.out.println("Introduce 20 números enteros: ");
//		
//		int tabla []= new int [20];
//		for(int i = 0; i<tabla.length; i++) {
//			numeros=read.nextInt();
//			tabla[i]=numeros;
//		}
//
//		int primeros []= new int [10];
//		for (int i = 0; i<primeros.length; i++) {
//			primeros[i]=tabla[i];
//		}
//		
//		int segundos[]= new int [10];
//		for (int i = 0; i<segundos.length; i++) {
//			segundos[i]=tabla[9];
//		}
//		System.out.println(Arrays.toString(primeros));
//		System.out.println(Arrays.toString(segundos));
		
		Scanner read = new Scanner (System.in);
		int numeros;
		System.out.println("Introduce 20 números enteros: ");
		
		int primeros[]=new int [10];
		for (int i = 0; i<primeros.length; i++) {
			numeros=read.nextInt();
			primeros[i]=numeros;
		}
		int segundos[]=new int [10];
		for(int i = 0; i<segundos.length; i++) {
			numeros=read.nextInt();
			segundos[i]=numeros;
		}
		
		if (Arrays.equals(primeros,segundos)) {
			System.out.println("Ambas tablas son iguales");
		}
		
		else {
			System.out.println("No son iguales");
		}
	}

}
