package learning_java;

import java.util.Scanner;

public class metodo {

	public static void main(String[] args) {
		int max=0;
		int min=0;
		int valor=0;
		metodo.comprobarNumeros(max, min, valor);
		
	}

	public static boolean comprobarValor(int max, int min, int valor) {

		if (valor > max) {
			return false;
		} else if (valor < min) {
			return false;
		}
		return true;
	}
	
	public static boolean comprobarMaxMin(int max, int min) {
		
		if (max<min) {
			return false;
		}
		return true;
	}
	
	public static void comprobarNumeros(int max, int min, int valor) {
		
		Scanner escaner;
		escaner = new Scanner(System.in);
		
		do {
			System.out.println("introduce el valor minimo:");
			min = escaner.nextInt();
			System.out.println("introuce el valor maximo");
			max = escaner.nextInt();
		} while(!metodo.comprobarMaxMin(max, min));
		
		do {
			System.out.println("introduce el valor:");
			valor = escaner.nextInt();
			System.out.println("el valor " + valor + " se ecnuentra entre el min " + min + " y el maximo " + max + "?");
			System.out.println(metodo.comprobarValor(max, min, valor));
		} while (!metodo.comprobarValor(max, min, valor));

		escaner.close();
	}
	
}
