package formulaUno;

public class Coche {
	
	// Atributos
	private final String MODELO ;
	private Chasis chasis;
	private Neumaticos neumatico;
	private Motor motor;
	private final Ingeniero INGENIERO;
	private final int trabajoIng;
	
	
	// Constructor
	public Coche(String mODELO, Chasis chasis, Neumaticos neumatico, Motor motor, Ingeniero iNGENIERO) {
		super();
		MODELO = mODELO;
		this.chasis = chasis;
		this.neumatico = neumatico;
		this.motor = motor;
		INGENIERO = iNGENIERO;
		trabajoIng = INGENIERO.trabajo();
	}
	
	// Metodos
	public Chasis getChasis() {
		return chasis;
	}


	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}


	public Neumaticos getNeumatico() {
		return neumatico;
	}


	public void setNeumatico(Neumaticos neumatico) {
		this.neumatico = neumatico;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public String getMODELO() {
		return MODELO;
	}


	public Ingeniero getINGENIERO() {
		return INGENIERO;
	}


	public int getTrabajoIng() {
		return trabajoIng;
	}
	
	
	public int trabajoInt() {
		return (chasis.trabajoIng()+neumatico.trabajoIng()+motor.trabajoIng()+INGENIERO.trabajo())/4;
	}
	
	
	
}
