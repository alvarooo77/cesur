package alumnocesur;

class Clase {
	

	// Atributos
	private String nombre;
	private int numAlumno;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;
	private Profesor[] profesor;
	private String nombreClase;

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
	
	public Profesor[] getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor[] profesor) {
		this.profesor = profesor;
	}

	public String toString() {
		return ("[Clase:" + nombre + "Profesor: " + profesor + "NumAlumno:" + numAlumno + "]");
	}
	
	public void add(Alumno nuevoAlumno) {
		
		if (numAlumno<TOTALALUMNOS) {
			alumnos[numAlumno] = nuevoAlumno;
			numAlumno++;
		}
	}
	
	public void delete(String nombre) {
		// solo hay un alumno con el mismo nombre.
		int indice = 0;
		while ((alumnos[indice].getNombre() != nombre) && (indice < alumnos.length)) {
			indice++;
		}
		if (indice < alumnos.length) {
			numAlumno--;
			for (int i = indice; i < numAlumno; i++) {
				alumnos[i] = alumnos[i + 1];
			}
			alumnos[numAlumno] = null;

		} else { // recorrido array sin encontrar el objeto.
			System.out.println("El alumno [" + nombre + "] no se encuentra en la clase [" + nombreClase + "]");
		}

	} // fin delete
	
	
}