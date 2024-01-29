package formulaUno;

public class Persona {
	
	// Atributos 
	private int edad;
	private String nombre;
	private int dni;
	
	
	//constructor
	public Persona(String nombre, int dni, int edad) {
		super();
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	// Metodos
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}
	
}
