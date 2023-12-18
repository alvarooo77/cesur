package practicas;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1=1;
		int num2=1;
		int num3;
		
		System.out.print(num1);
		System.out.print(" ");
		System.out.print(num2);
		System.out.print(" ");
		
		while(num2<100) {
			System.out.print(num1+num2);
			System.out.print(" ");
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}	
}
