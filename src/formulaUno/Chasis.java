package formulaUno;
import java.util.Random;

public class Chasis {
	
	// Atributo
	private final int idChasis;
	private int material;
	private Ingeniero ingeniero;
	private final int trabajoIng;
	
	
	// constructor
	public Chasis(int idChasis,Ingeniero ingeniero) {
		super();
		Random aleatorio = new Random();
		this.idChasis = idChasis;
		material = aleatorio.nextInt(10);
		this.ingeniero = ingeniero;
		trabajoIng = ingeniero.trabajo();
	}

	
	// Metodos 
	public int getMaterial() {
		return material;
	}


	public void setMaterial(int material) {
		this.material = material;
	}


	public Ingeniero getIngeniero() {
		return ingeniero;
	}


	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}


	public int getIdChasis() {
		return idChasis;
	}
	
	
	public int trabajoIng()	{
		return (material+ingeniero.trabajo())/2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
