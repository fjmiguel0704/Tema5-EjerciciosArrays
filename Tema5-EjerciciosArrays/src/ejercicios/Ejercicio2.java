package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int inicio=0, fin=0;
		int table[]=new int [55];
		
		for (int i = 1; i<=10; i++) {
			Arrays.fill(table, inicio, fin+i , i);
			inicio=fin+i;
			fin=fin+i;
		}
		System.out.println(Arrays.toString(table));
	}
}