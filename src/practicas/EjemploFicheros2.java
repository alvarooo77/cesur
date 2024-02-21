package practicas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import animales.Animal;

public class EjemploFicheros2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectOutputStream salida = null;
		
		Animal perro;
		perro = new Animal("perro",13);
		Animal gato=new Animal("gato",17);
		
		try {
			salida = new ObjectOutputStream( new BufferedOutputStream(new FileOutputStream("ficheroObjetos.txt")));
			salida.writeObject(perro);
			salida.writeObject(gato);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(salida!=null) {
				salida.close();
			}
		}
		
		ObjectInputStream entrada = null;
		
		Animal generico; 
		
		try {
			entrada = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ficheroObjetos.txt")));
			
			generico = (Animal) entrada.readObject();
			System.out.println(generico.getNombre());
			
			generico = (Animal) entrada.readObject();
			System.out.println(generico.getNombre());
			
			generico.setTpoVida(16);
			System.out.println(generico.getTpoVida());
			System.out.println(perro.getTpoVida());
			System.out.println(gato.getTpoVida());
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			if(entrada!=null) {
				entrada.close();
			}
		}
		
	}
}

	
		
	
			





























