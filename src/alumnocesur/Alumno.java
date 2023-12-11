package alumnocesur;

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