package learning_java;

import java.util.Scanner;

public class Frases {

	static final int CANTIDAD = 10;
	static String[] cadenas = new String[CANTIDAD];
	static String nuevaCadena;

	public static void main(String[] args) {

		Scanner escaner;
		escaner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("introduzca para la posicion " + i + ": ");
			nuevaCadena = escaner.nextLine();
			setValue(cadenas, i, nuevaCadena);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(getValue(cadenas, i));
		}

		escaner.close();
	}

	static String getValue(String[] cadenas, int posicion) {

		return cadenas[posicion];
	}

	String getValue(int posicion) {

		return cadenas[posicion];
	}

	static void setValue(String[] cadenas, int posicion, String nuevaCadena) {

		cadenas[posicion] = nuevaCadena;

	}

	void setValue() {

	}
}
