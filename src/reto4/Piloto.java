package reto4;

public class Piloto { 
	
	// Atributos
	static private int idPiloto = 0;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;
	
	
	// Constructor
	public Piloto(String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		super();
		
		idPiloto++;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;
	}
	
	
	// Metodos
	public void mostrarPiloto() {
		System.out.println("Id del piloto: " + idPiloto);
		System.out.println("Nombre del piloto: " + nomPiloto);
		System.out.println("Horas de vuelo: " + horasVueloPiloto);
		System.out.println("Rango del piloto: " + rangoPiloto);
	}


	public int getIdPiloto() {
		return idPiloto;
	}


	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}


	public String getNomPiloto() {
		return nomPiloto;
	}


	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}


	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}


	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}


	public String getRangoPiloto() {
		return rangoPiloto;
	}


	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}
	
	
	
}
