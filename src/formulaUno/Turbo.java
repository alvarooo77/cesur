package formulaUno;

public class Turbo {
	
	// Atributos
	private final int idTurbo;
	private final int rpm;
	private final int tamaño;
	private Ingeniero ingeniero;
	private final int trabajoIng;
	
	
	// Constructor
	public Turbo(int idTurbo, int rpm, int tamaño, Ingeniero ingeniero) {
		super();
		this.idTurbo = idTurbo;
		this.rpm = rpm;
		this.tamaño = tamaño;
		this.ingeniero = ingeniero;
		trabajoIng = ingeniero.trabajo();
	}
	
	
	// Metodos
	public Ingeniero getIngeniero() {
		return ingeniero;
	}


	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}


	public int getIdTurbo() {
		return idTurbo;
	}


	public int getRpm() {
		return rpm;
	}


	public int getTamaño() {
		return tamaño;
	}
	
	
	public int trabajoIng() {
		return (rpm+tamaño+ingeniero.trabajo())/3;
	}

}
