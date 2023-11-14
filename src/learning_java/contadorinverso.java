package learning_java;

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
	}
}
