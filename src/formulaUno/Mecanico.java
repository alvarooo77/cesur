package formulaUno;

public class Mecanico extends Persona {
	
	//ATRIBUTOS.
	
	private int velocidad;
	private int experiencia;
	
	//CONSTRUCTOR
	
	public Mecanico(String nombre, int dni, int edad, int velocidad, int experiencia) {
		super(nombre, dni, edad);
		this.velocidad = velocidad;
		this.experiencia = experiencia;
	}
	
	//GETTERS Y SETTERS

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
	

}