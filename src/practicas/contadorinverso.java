package practicas;
import java.util.Scanner;

public class contadorinverso {

	public static void main(String[] args) {
		
		//De 1200 a 600 de 20 en 20
		
		int x=1200;
		
		while(x>619) {
			System.out.print(x);
			System.out.print(" ");
			x=x-20;
		}
		
		System.out.println();
		
		x = 1200;
		do {
			System.out.print(x);
			System.out.print(" ");
			x=x-20;
		} while(x>619);
		
		System.out.println();
		
		for (x=1200;x>619;x=x-20) {
			System.out.print(x);
			System.out.print(" ");
		}
		
		System.out.println();
		
		int max;
		int min;
		int salto;
		int nsalt;
		int y=0;
		
		
		
		Scanner escaner;
		escaner= new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce el maximo:");
		max= escaner.nextInt();
		
		System.out.println("Introduce el minimo:");
		min=escaner.nextInt();
		
		System.out.println("Introduce el salto");
		salto=escaner.nextInt();
		} while(max<=min);
		
		
		for (x = max; x >= min; x = x - salto) {
			
			System.out.print(x);
			System.out.print(" ");
			y++;
			
			if(y>9) {
				System.out.println();
				y=0;
			}
				
		}
		
		
		
		
		escaner.close();
	}
}
