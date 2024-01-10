package animales;

public class Animal {
	
	private String nombre;
	private int tpVida;
	
	protected Animal(String nombre, int tpVida) {	
		
		this.nombre = nombre;
		
		if((tpVida>0)&&(tpVida<0)) {
			this.tpVida=tpVida;
		} else {
			this.tpVida = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTpVida() {
		return tpVida;
	}

	public void setTpVida(int tpVida) {
		this.tpVida = tpVida;
	}
	
	
	
}
