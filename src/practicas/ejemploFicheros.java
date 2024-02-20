package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ejemploFicheros {
	
	public static void main (String[]args) throws IOException {
		BufferedReader entrada = null;
		BufferedWriter salida2 = null;
		PrintWriter salida = null;
		
		FileReader entradaFichero = null;
		try {
			entrada = new BufferedReader(new FileReader("texto.txt"));
			salida = new PrintWriter(new FileWriter("copiaFichero.txt"));
			salida2 = new BufferedWriter(new FileWriter("copiaFichero2.txt"));
			String lineaPar;
			String lineaImpar;
			int numLinea = 3;
			
			while(numLinea > 0) {
				
				
				
				if(numLinea%2==0) {
					lineaPar = entrada.readLine();
					salida.println(lineaPar);
					numLinea--;
				}else {
					lineaImpar = entrada.readLine();
					salida.println(lineaImpar);
					numLinea--;
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(entrada!=null) {
				entrada.close();
			}
			if(salida2!=null) {
				salida2.close();
			}
			if(salida!=null) {
				salida.close();
			}
		}
		
	}
}



























