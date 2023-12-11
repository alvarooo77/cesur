package alumnocesur;

class Alumno extends Persona{

	// Atributos
	String curso;

	// Constructor
	public Alumno(String nombre, int edad, String curso) {
		super(nombre, edad);									// "super" siempre primero
		this.curso = curso;
	}

	// Metodos getters and setters
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// metodo toString
	public String toString() {
		return ("[Alumno:" + super.getNombre() + " edad:" + super.getEdad() + " curso:" + curso + "]");

	}
}