package reto4;

public class Avion {
	
	// Atributos
	private static int idAvion=0;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;
	
	
	// Constructor
	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super();
		this.idAvion = idAvion;
		idAvion++;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}
	
	
	// Metodos
	public void mostrarAvion() {
		System.out.println("Id del avion: " + idAvion);
		System.out.println("Modelo del Avión: " + modAvion);
		System.out.println("Capacidad de ocupantes: " + capAvion);
		System.out.print("Informacion del piloto: ");
		piloto.mostrarPiloto();
	}


	public int getIdAvion() {
		return idAvion;
	}


	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}


	public String getModAvion() {
		return modAvion;
	}


	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}


	public int getCapAvion() {
		return capAvion;
	}


	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}


	public Piloto getPiloto() {
		return piloto;
	}


	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	
	
	
	
	
	
}
