package formulaUno;

import java.util.Random;

public class Ingeniero extends Persona{
	
	// Atributos
	private final int inteligencia;
	private int experiencia;
	private final int innovacion;
	
	
	// Constructor
	public Ingeniero(String nombre, int dni, int edad) {
		super(nombre, dni, edad);
		Random aleatorio = new Random();
		inteligencia = aleatorio.nextInt(10);
		experiencia = aleatorio.nextInt(10);
		innovacion = aleatorio.nextInt(10);
		
	}
	
	
	// Metodos 
	public int getInteligencia() {
		return inteligencia;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public int getInnovacion() {
		return innovacion;
	}
	
	public int trabajo() {
		return (inteligencia+experiencia+innovacion)/3;
	}
}
