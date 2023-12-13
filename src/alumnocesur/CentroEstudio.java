package alumnocesur;

public class CentroEstudio {

	// Atributo
	private String nombre;
	private Administrativo[] administrativos;
	private Clase[] clases;
	private final int MAX_ADMIN;
	private final int MAX_CLASES;

	// Constructor
	public CentroEstudio(String nombre, int mAX_ADMIN, int mAX_CLASES) {
		this.nombre = nombre;
		MAX_CLASES = mAX_ADMIN;
		MAX_ADMIN = mAX_CLASES;
		administrativos = new Administrativo[mAX_ADMIN];
		clases = new Clase[mAX_CLASES];
	}

	public CentroEstudio(String nombre) {
		this.nombre = nombre;
		MAX_CLASES = 10;
		MAX_ADMIN = 10;
		administrativos = new Administrativo[MAX_ADMIN];
		clases = new Clase[MAX_CLASES];
	}
	
	
	// Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Administrativo[] getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}

	public Clase[] getClases() {
		return clases;
	}

	public void setClases(Clase[] clases) {
		this.clases = clases;
	}

	public int getMAX_ADMIN() {
		return MAX_ADMIN;
	}

	public int getMAX_CLASES() {
		return MAX_CLASES;
	}
	
	
	// ToString
	public String toString() {
		return ("[Centro:" + nombre + ", CAPACIDAD {clases:" + MAX_CLASES + " Administradores:" + MAX_ADMIN + "]");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
