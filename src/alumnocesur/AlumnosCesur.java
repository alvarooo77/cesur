package alumnocesur;
import practicas.Creator;

public class AlumnosCesur {
	
	public static void main(String[] args) {

		// creo objeto llamado alumno
		Alumno alvaro;
		alvaro = new Alumno("alvaro", 18, "DAM");
		Alumno juanCarlos = new Alumno("juan carlos", 24, "DAM");
		Alumno fran = new Alumno("fran", 18, "DAM");
		Alumno andre = new Alumno("andre", 20, "DAM");
		Alumno santiago = new Alumno("santiago", 22, "DAM");
		Alumno janhin = new Alumno("janhin", 27, "DAM");
		Alumno ramon = new Alumno("ramon", 24, "DAM");
		Alumno sinran = new Alumno("sinri", 23, "DAM");
		Alumno ale = new Alumno("ale", 23, "DAM");
		Alumno joseRamon = new Alumno("jose ramon", 39, "DAM");
		Alumno dario = new Alumno("dario", 17, "DAM");
		Alumno adrian = new Alumno("adrian", 25, "DAM");
		Alumno juanantonio = new Alumno("juan antonio",23,"DAW");
	
		
		// Creo objeto clase premiun plus
		Clase premiunplus;
		premiunplus = new Clase("premiunplus");
		
		
		for (int i = 0; i < 15; i++) {
			premiunplus.add(new Alumno(Creator.newName(), Creator.newAge(), "DAM"));
			System.out.println(premiunplus.getAlumnos()[i]);
		}
	
		
		System.out.println("Alumnos de DAM:");
		for(int i=0; i<premiunplus.getNumAlumno(); i++) {
			if(premiunplus.getAlumnos()[i].getNombre()=="dario") {
				premiunplus.getAlumnos()[i].setEdad(18);
			}
			if(premiunplus.getAlumnos()[i].getCurso()=="DAM") {
				System.out.println(premiunplus.getAlumnos()[i]);
			}
		}
		System.out.println();
		System.out.println("Alumnos de DAW:");
		for(int i=0; i<premiunplus.getNumAlumno(); i++) {
			if(premiunplus.getAlumnos()[i].getCurso()=="DAW") {
				System.out.println(premiunplus.getAlumnos()[i]);
			}
		}
		
	}
	
}





















