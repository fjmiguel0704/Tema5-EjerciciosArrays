package ejercicios;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeros=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce 20 números enteros: ");
		
		int tabla []= new int [20];
		for(int i = 0; i<tabla.length; i++) {
			numeros=read.nextInt();
			tabla[i]=numeros;
		}

		int primeros []= new int [10];
		for (int i = 0; i<primeros.length; i++) {
			primeros[i]=tabla[i];
		}
		
		int segundos[]= new int [10];
		for (int i = 0; i<segundos.length; i++) {
			
		}
		System.out.println(Arrays.toString(primeros));
		System.out.println(Arrays.toString(segundos));
	}

}
