package alumnocesur;

import java.util.Random;

import practicas.Creator;

public class AlumnosCesur {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		String nombreClaseTemp;
		CentroEstudio cesurEste = new CentroEstudio("Cesur el palo", 5, 4);
		Clase claseTemp;
		Administrativo administrativoTemp;
		
		for (int i = 0; i < 5; i++) {
			nombreClaseTemp = Creator.newClase();
			claseTemp = new Clase(nombreClaseTemp);
			claseTemp.setProfesor(new Profesor(Creator.newName(), Creator.newAge(), nombreClaseTemp));
			
			for (int x = 0; x < 15; x++) {
				claseTemp.addAlumno(new Alumno(Creator.newName(), Creator.newAge(), nombreClaseTemp));
				
			}
			
			cesurEste.getClases()[i] = claseTemp;
			
		}
		for (int i = 0; i < 4; i++) {
			administrativoTemp = new Administrativo(Creator.newName(), Creator.newAge(), aleatorio.nextBoolean());
		}

		CentroEstudio cesurPTA = new CentroEstudio("Cesur PTA", 5, 4);
		
	}
}
