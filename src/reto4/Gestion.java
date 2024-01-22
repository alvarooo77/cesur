package reto4;
import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		String nomPiloto;
		int horasVueloPiloto;
		String rangoPiloto;
		String tipoAvion;
		int capAvion;
		Piloto piloto;
		boolean esFurtivo;
		int idA = 1;
		
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
			System.out.println("Introduzca los datos para crear un nuevo piloto");
			System.out.println("Introduzca el nombre:");
			nomPiloto=escaner.nextLine();
			System.out.println("Introduzca las horas de vuelo:");
			horasVueloPiloto=escaner.nextInt();
			System.out.println("Introduzca el rango");
			escaner.nextLine();
			rangoPiloto=escaner.nextLine();
			
			pilotos[i] = new Piloto(nomPiloto,horasVueloPiloto,rangoPiloto);
			
		}
		
		// Muestro la informacion de Maverick y Rooster
		Pete.mostrarPiloto();
		Bradley.mostrarPiloto();
		
		
		// Muestro la informacion de los 2 nuevos pilotos
		pilotos[0].mostrarPiloto();
		pilotos[1].mostrarPiloto();
		
		
		// Declaracion e instanciación de 3 aviones
		Entrenamiento avion1 = new Entrenamiento(idA,"Entrenamiento",2,Natasha,true);
		idA++;
		Combate avion2 = new Combate(idA,"Combate",1,Pete,true);
		idA++;
		Combate avion3 = new Combate(idA,"Combate",1,Bradley,false);
		idA++;
		
		
		// Pide los datos para 2 nuevos aviones
		for (int i = 0; i < 2; i++) {
			System.out.println("Introduzca los datos para crear un nuevo avion");
			System.out.println("Introduzca tipo de avion:");
			tipoAvion=escaner.nextLine();
			System.out.println("Introduzca la capacidad:");
			capAvion=escaner.nextInt();
			System.out.println("Es furtivo? (true o false):");
			escaner.nextLine();
			esFurtivo=escaner.nextBoolean();
			System.out.println("Introduzca el id del piloto (4 o 5):");
			escaner.nextLine();
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		escaner.close();
	}	
}
