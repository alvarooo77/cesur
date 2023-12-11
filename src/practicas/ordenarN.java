package practicas;
import java.util.Scanner;

public class ordenarN {

	public static void main(String[] args) {

		int a, b, c, d;

		Scanner escaner;
		escaner = new Scanner(System.in);

		System.out.println("Introduzca el primer numero:");
		a = escaner.nextInt();

		System.out.println("Introduzca el segundo numero:");
		b = escaner.nextInt();

		System.out.println("Introduzca el tercero numero:");
		c = escaner.nextInt();

		System.out.println("Elija el metodo 1 o 2:");
		System.out.println("1. descendente");
		System.out.println("2. ascendente");
		d = escaner.nextInt();

		if (d == 1) {
			if (a >= b) {
				if (a >= c) {
					System.out.print(a + " ");
					if (b >= c) {
						System.out.println(b + " " + c);
					} else {
						System.out.println(c + " " + b);
					}
				} else if (a < c) {
					System.out.println(c + " " + a + " " + b);
				} else {
					System.out.println(a + " " + c + " " + b);
				}

			} else if (b > a) {
				if (b > c) {
					System.out.print(b + " ");
					if (a > c) {
						System.out.println(a + " " + c);
					} else {
						System.out.println(c + " " + a);
					}
				} else if (c > b) {
					System.out.println(c + " " + b + " " + a);
				}

			}
		} else if(d == 2){
			System.out.println("hola");
			if (a >= b) {
				if (a >= c) {

					if (b >= c) {
						System.out.println(c + " " + b + " " + a);

					} else {
						System.out.println(b + " " + c + " " + a);
					}
				} else if (a < c) {
					System.out.println(b + " " + a + " " + c);
				} else {
					System.out.println(b + " " + c + " " + a);
				}

			} else if (b > a) {
				if (b > c) {

					if (a > c) {
						System.out.println(c + " " + a + " " + b);
					} else {
						System.out.println(a + " " + c + " " + b);
					}
				} else if (c > b) {
					System.out.println(a+ " " + b + " " + c);
				}

			}

		}

		escaner.close();
	}
}
