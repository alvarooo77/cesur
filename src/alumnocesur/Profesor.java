package alumnocesur;

public class Profesor extends Persona {

	// atributos
	private String curso;

	// constructor
	public Profesor(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}

	// getter and setter
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return ("[" + super.getNombre() + "]");
	}
}
