package animales;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

public class UsoAnimales {

	public static void main(String[] args) {
		// Crear arry de 10 enteros
		Random ale = new Random();
		int[] enteros;
		enteros = new int[10];
		
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = ale.nextInt(10);
			System.out.print(enteros[i]);
		}
		
		System.out.println();
		
		boolean encontrado=false;
		int numero = ale.nextInt(10);
		int i =0;
		System.out.println(numero);
		
		while (encontrado==true && i<10) {
			if(numero==enteros[i]) {
				encontrado=true;
			}
			i++;
		}
		
		System.out.println("encontrado "+ numero + encontrado);
		
		
	}

}