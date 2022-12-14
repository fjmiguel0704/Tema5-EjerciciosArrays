package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n, m;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el tamaño de posiciones de la tabla: ");
		n=read.nextInt();
		System.out.println("Introduce el valor de cada posición: ");
		m=read.nextInt();
		
		int tabla[] = new int [n];
		Arrays.fill(tabla, m);
		System.out.println(Arrays.toString (tabla));
		
		read.close();
	}

}
