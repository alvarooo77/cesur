package practicas;

public class SimuladorLista {

	public static void main(String[] args) {
		MiArray yo = new MiArray(100);
		for (int i=0; i<100;i++) {
			yo.insertarValor(i+10);
			System.out.println(yo.getIntMiArray(i));
		}
		System.out.println(yo.getNumElem());
		
	}
	
}

//Almacena enteros positivos
class MiArray {
		
	// Atributos
	public int[] miArray;
	public int numElem;
	public static final int LONG_DEFAULT = 10;
		
	// Constructor
	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
			
		for(int i = 0; i < longitud; i++) {
			miArray[i] = 0;
		}
	}
		
		MiArray() {
	    numElem = 0;
	    miArray = new int[LONG_DEFAULT];
	    for(int i = 0; i < miArray.length; i++) {
			miArray[i] = 0;
		}
	}
	    
	// Metodos
	public int getNumElem() {
		return numElem;
	}
	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}
		
	public int[] getmiArray() {
		return miArray;
	}
	
	public int getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return -1;
		}
	}
		
	public void resetear() {
		for(int i = 0; i < miArray.length; i++) {
			miArray[i] = 0;
			numElem = 0;
		}
	}
	
	public void insertarValor( int valor) {
		if (numElem == miArray.length) {
			System.out.println("El array esta lleno");
		}else {
			miArray[numElem] = valor;
			numElem++;
		}
	}
	
	
	
} // Cierre miArray
























