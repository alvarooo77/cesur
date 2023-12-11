package alumnocesur;

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