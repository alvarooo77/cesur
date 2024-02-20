package practicas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejemploFicheros {
	
	
	
	
	public static void main (String[] args) throws IOException {
		
		FileReader entrada = null;
		
		Scanner escaner = new Scanner(System.in);
		
		
		
		try {
			entrada = new FileReader("texto.txt");
			char caracter;
			caracter=(char)entrada.read();
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} finally {
			if(entrada!=null) {
				
				entrada.close();
			}
		}
		
		entrada = null;
		//pedir cuantas lineas a leer e imprimir las lineas q pide
		
		try {
			
			System.out.println("Numero de lineas a imprimir");
			int lineas;
			int contador = 0;
			lineas = escaner.nextInt();
			
			escaner.close();
			
			entrada = new FileReader("texto.txt");
			char caracter;
			caracter = (char)entrada.read();
			
			
			if (caracter != (char)-1) {
				while (contador < lineas || caracter == (char)-1) {
					caracter = (char) entrada.read();
					System.out.print(caracter);
					if (caracter == '\n') {
						contador++;
					}

				}
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		} finally {
			if(entrada!=null) {
				entrada.close();
			}
		}
		
	
		
		
	}

}
