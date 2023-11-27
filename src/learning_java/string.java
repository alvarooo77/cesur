package learning_java;

import java.util.Scanner;

public class string {
	public static void main(String[] args) {

		String cadena;
		int indice;
		Scanner escaner;
		escaner = new Scanner(System.in);

		System.out.println("Introduzca la cadena");
		cadena = escaner.nextLine();

		for (indice = 0; indice < cadena.length(); indice++) {

			if (cadena.charAt(indice) == ' ') {
				System.out.println("*");
			} else if (indice % 2 == 0) {
				hola(cadena.toUpperCase(), indice);
			} else {
				hola(cadena.toLowerCase(), indice);
			}
		}
	}


	public static void hola(String cadena, int indice) {
		System.out.println(cadena.charAt(indice));
	}
}
