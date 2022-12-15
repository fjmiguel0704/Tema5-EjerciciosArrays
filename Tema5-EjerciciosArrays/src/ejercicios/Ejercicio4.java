package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		int aleatorios[]=new int [30];
		for(int i = 0; i<aleatorios.length; i++) {
			aleatorios[i]=(int)(Math.random()*10);
		}
		Arrays.sort(aleatorios);
		System.out.println(Arrays.toString(aleatorios));

	}

}
