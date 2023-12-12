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
		int indice=0;
		boolean encontrado = false;
		
		
		while(!encontrado &&(indice<numAlumno)) {
			if(alumnos[indice].getNombre() == nombre) {
				encontrado = true;
			}else {
				indice++;
			}
		}
		if(indice<numAlumno) {
			
			for(int i=0; i<(numAlumno-indice); i++) {
				alumnos[indice]=alumnos[indice+1];
			}
			numAlumno--;
			
		}else {
			System.out.println("no se ha encontrado al alumno");
		}
		
	} // fin delete
	
	public void listadoAlumnos() {
		System.out.println("Listado alumnos de la clase: " + nombreClase);
		for (int i = 0; i < numAlumno; i++) {
			System.out.println(alumnos[i]);
		}
	}
	
}