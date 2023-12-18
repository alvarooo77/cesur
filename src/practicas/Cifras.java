package practicas;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		Scanner escaner=new Scanner(System.in);
		int num;
		int comparador=10;
		int contador=1;
		boolean bandera=false;
		
		
		do {
			System.out.println("Introduzca un numero:");
			num = escaner.nextInt();
		} while (num<0);
		
		while(bandera==false) {
			if(num>=comparador) {
				contador++;
				comparador=comparador*10;
			}else {
				bandera=true;
			}
		}
		System.out.println("El numero tiene "+contador + " cifras.");
	
		System.out.println("la ultima cifra es "+ Cifras.ultima(num));
		
		System.out.println("la primera cifra es " + Cifras.primera(num));
		
		escaner.close();
	}
	
	public static int ultima(int num) {
		num= num % 10;
		return num;
	}
	
	public static int primera(int num) {
		int contador=1;
		while((num/10)!=0) {
			num=num/10;
			contador++;
		}
		return num;
	}
}


























