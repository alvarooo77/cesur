package learning_java;
import java.util.Scanner;


public class impuestos {

	public static void main(String[] args) {
		
		double tramo1=0.1;
		double tramo2=0.15;
		double tramo3=0.2;
		double salario;
		String x;
		double impuesto;
		Scanner escaner;
		escaner = new Scanner(System.in);
		
		
		do {
			do {
				System.out.println("Introduzca el salario anual:");
				salario = escaner.nextInt();
			} while (salario < 0);
			
			if (salario < 30001) {
				System.out.println("se le aplicara en 10% de tasa impositiva");
				impuesto = salario * tramo1;
			} else if (salario < 50001) {
				System.out.println("se le aplicara en 15% de tasa impositiva");
				impuesto = salario * tramo2;
			} else {
				System.out.println("se le aplicara en 20% de tasa impositiva");
				impuesto = salario * tramo3;
			}
			System.out.println("Impuestos a pagar: " + impuesto + " euros.");
			System.out.println("si desea repetir el programa pulse a, si no es el caso pulse cualquier otra tecla:");
			x = escaner.nextLine();
			x = escaner.nextLine();
			
			impuestos.cambio(x);
			
			
			
		} while (x.charAt(0) == 'a');
		escaner.close();
	}
	
	public static char cambio(String x) {
		return x.charAt(0);
		
	}

}
