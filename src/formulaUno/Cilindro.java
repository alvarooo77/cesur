package formulaUno;
import java.util.Random;

public class Cilindro {
	
	// Atributos
	private final int idCilindro;
	private final int capacidad;
	private final int material;
	private Ingeniero ingeniero;
	
	
	// Constructor
	public Cilindro(Ingeniero ingeniero, int idCilindro) {
		super();
		Random aleatorio = new Random();
		this.ingeniero = ingeniero;
		this.idCilindro = idCilindro;
		capacidad = aleatorio.nextInt(10);
		material = aleatorio.nextInt(10);
	}


	// Metodos
	public Ingeniero getIngeniero() {
		return ingeniero;
	}


	public void setIngeniero(Ingeniero ingeniero) {
		this.ingeniero = ingeniero;
	}


	public int getIdCilindro() {
		return idCilindro;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public int getMaterial() {
		return material;
	}
	
	
	public int trabajoIng() {
		return (capacidad+material+ingeniero.trabajo())/3;
	}
}
