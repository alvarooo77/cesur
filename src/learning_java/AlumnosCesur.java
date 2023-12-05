package learning_java;

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
	
		
		Clase premiunplus;
		premiunplus = new Clase("premiunplus");
		
		
		
		premiunplus.add(ale);
		premiunplus.add(alvaro);
		premiunplus.add(juanCarlos);
		premiunplus.add(fran);
		premiunplus.add(andre);
		premiunplus.add(santiago);
		premiunplus.add(janhin);
		premiunplus.add(ramon);
		premiunplus.add(sinran);
		premiunplus.add(joseRamon);
		premiunplus.add(dario);
		premiunplus.add(adrian);
		premiunplus.add(juanantonio);
		
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

class Alumno {

	// Atributos
	String nombre;
	int edad;
	String curso;

	// Constructor
	public Alumno(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}

	// Metodos getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// metodo toString
	public String toString() {
		return ("[Alumno:" + nombre + " edad:" + edad + " curso:" + curso + "]");

	}
}

class Clase {
	

	// Atributos
	private String nombre;
	private int numAlumno;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;

	// Constructor
	public Clase(String nombre) {
		this.numAlumno = 0;
		this.alumnos = new Alumno[TOTALALUMNOS];
		this.nombre=nombre;
		
	}

	// Metodos getters and setters
	public int getNumAlumno() {
		return numAlumno;
	}

	public void setNumAlumno(int numAlumno) {
		this.numAlumno = numAlumno;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return ("[Clase:" + nombre + " NumAlumno:" + numAlumno + "]");
	}
	
	public void add(Alumno nuevoAlumno) {
		
		if (numAlumno<TOTALALUMNOS) {
			alumnos[numAlumno] = nuevoAlumno;
			numAlumno++;
		}
	}
	
	public void delete(String nombreAlumno) {
		for (int i = 0; i <numAlumno; i++) {
			if(getAlumnos()[i].getNombre()==nombreAlumno) {
				
			}
		}
	}
}





















