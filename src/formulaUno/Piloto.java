package formulaUno;
import java.util.Random;

public class Piloto extends Persona{
	
	// Atributos
	private final int reflejos;
	private final int inteligencia;
	private final int agresividad;
	private int experiencia;
	
	
	// Constructor
	public Piloto(String nombre, int dni, int edad) {
		super(nombre, dni, edad);
		Random aleatorio = new Random();
		inteligencia = aleatorio.nextInt(10);
		agresividad = aleatorio.nextInt(10);
		experiencia = aleatorio.nextInt(10);
		reflejos = aleatorio.nextInt(10);
	}


	
	// Metodos
	public int getReflejos() {
		return reflejos;
	}


	public int getInteligencia() {
		return inteligencia;
	}


	public int getAgresividad() {
		return agresividad;
	}


	public int getExperiencia() {
		return experiencia;
	}
	

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
}
