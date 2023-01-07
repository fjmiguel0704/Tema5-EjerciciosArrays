 package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int aleatorios [] = new int [1000];
		
		for (int i = 0; i<aleatorios.length; i++) {
			aleatorios[i]= (int) (Math.random()*100);
		}
		
		int numero;
		System.out.println("Introduce un número comprendido entre 0 y 99: ");
		numero=read.nextInt();
		
		
		
	}

}
