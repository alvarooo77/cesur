package reto4;

public class Combate extends Avion{
	
	// Atributos
	private boolean esFurtivo;

	
	// Constructor
	public Combate(String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;
	}

	
	// Metodos
	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}
	
	
	
	
}
