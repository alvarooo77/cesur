package alumnocesur;
import practicas.Creator;

public class AlumnosCesur {
	
	public static void main(String[] args) {

		
		// Creo objeto clase premiun plus
		Clase premiunplus;
		premiunplus = new Clase("premiunplus");
		
		// Creo los alumnos 
		for (int i = 0; i < 15; i++) {
			premiunplus.add(new Alumno(Creator.newName(), Creator.newAge(), "DAM"));
		}
	
		
		System.out.println("Alumnos de DAM:");
		System.out.println();
		for(int i=0; i<premiunplus.getNumAlumno(); i++) {
			if(premiunplus.getAlumnos()[i].getCurso()=="DAM") {
				System.out.println(premiunplus.getAlumnos()[i]);		//muestra los alumnos por pantalla que pertenecen a DAM
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Alumnos de DAW:");
		for(int i=0; i<premiunplus.getNumAlumno(); i++) {
			if(premiunplus.getAlumnos()[i].getCurso()=="DAW") {			//Muestra por pantalla los alumnos de DAW
				System.out.println(premiunplus.getAlumnos()[i]);
			}
		}
	}
	
}





















