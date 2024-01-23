package reto4;
import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		String nomPiloto;
		int horasVueloPiloto;
		String rangoPiloto;
		int capAvion;
		Piloto piloto;
		boolean esFurtivo;
		
		Piloto[] pilotos;
		pilotos = new Piloto[2];
		
		Entrenamiento[] aviones;
		aviones = new Entrenamiento[2];
		
		// Declaracion e instanciación de 3 pilotos
		Piloto Pete = new Piloto("Pete Maverick",10000,"Capitán");
		Piloto Natasha = new Piloto("Natasha Phoenix",3000,"Teniente");
		Piloto Bradley = new Piloto("Bradley Rooster",3500,"Teniente");
		
		
		//pide los datos para 2 nuevos pilotos
		Scanner escaner = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.println();
			System.out.println("Introduzca los datos para crear un nuevo piloto");
			System.out.println("Introduzca el nombre del piloto: ");
			nomPiloto=escaner.next();
			System.out.println("Introduzca las horas de vuelo:");
			horasVueloPiloto=escaner.nextInt();
			System.out.println("Introduzca el rango");
			escaner.nextLine();
			rangoPiloto=escaner.nextLine();
			
			System.out.println();
			
			
			
			pilotos[i] = new Piloto(nomPiloto,horasVueloPiloto,rangoPiloto);
			
		}
		
		
		
		
		// Muestro la informacion de Maverick y Rooster
		Pete.mostrarPiloto();
		Bradley.mostrarPiloto();
		
		
		// Muestro la informacion de los 2 nuevos pilotos
		pilotos[0].mostrarPiloto();
		System.out.println();
		pilotos[1].mostrarPiloto();
		
		
		// Declaracion e instanciación de 3 aviones
		Entrenamiento avion1 = new Entrenamiento("Entrenamiento",2,Natasha,true);
		Combate avion2 = new Combate("Combate",1,Pete,true);
		Combate avion3 = new Combate("Combate",1,Bradley,false);
		
		
		// Pide los datos para 2 nuevos aviones
		for (int i = 0; i < 2; i++) {
			System.out.println();
			System.out.println("Introduzca los datos para crear un nuevo avion");
			System.out.println("Introduzca la capacidad:");
			capAvion=escaner.nextInt();
			System.out.println("Es furtivo? (true o false):");
			escaner.nextLine();
			esFurtivo=escaner.nextBoolean();
			System.out.println();
			
			aviones[i] = new Entrenamiento("Entrenamiento",capAvion,pilotos[i],esFurtivo);
			
		}
		
		// Muestro los aviones
		avion1.mostrarAvion();
		System.out.println();
		avion2.mostrarAvion();
		System.out.println();
		avion3.mostrarAvion();
		System.out.println();
		aviones[0].mostrarAvion();
		System.out.println();
		aviones[1].mostrarAvion();
		
		escaner.close();
	}	
}
