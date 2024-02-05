package formulaUno;
import java.util.Random;

public class Neumaticos {
	
	private enum tipoDureza {blando,medio,duro}
	// Atributos
	private final int idNeumatico;
	private int material;
	private Ingeniero ingeniero;
	private tipoDureza dureza;
	private final int trabajoIng;
	
	// Constructor 
	public Neumaticos(int idNeumatico, Ingeniero ingeniero) {
		super();
		Random aleatorio = new Random();
		this.idNeumatico = idNeumatico;
		material = aleatorio.nextInt(10);
		this.ingeniero = ingeniero;
		dureza = null;
		trabajoIng = ingeniero.trabajo();
	}

	// Metodos
	public Ingeniero getIngeniero() {
		return ingeniero;
	}

	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}

	public tipoDureza getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {
		switch (dureza) {
		case "blando":
			this.dureza= tipoDureza.blando;
			break;
		case "medio":
			this.dureza = tipoDureza.medio;
			break;
		case "duro":
			this.dureza = tipoDureza.duro;
			break;
		}
	}

	public int getIdNeumatico() {
		return idNeumatico;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}
	
	public int trabajoIng() {
		return (ingeniero.trabajo()+material)/2;	
	}
}
















