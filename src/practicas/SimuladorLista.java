package practicas;
import java.util.Random;

public class SimuladorLista {

	public static void main(String[] args) {
		
		
		MiArray yo = new MiArray(10);
		Random aleatorio = new Random();
	
		// Rellena el array
		for(int x = 0; x<10;x++) {
			yo.insertarValor(aleatorio.nextInt(10));
			System.out.print(yo.getIntMiArray(x)+" ");
		}
		System.out.println();
		
		
		MiArray pares = new MiArray(yo.numDePares());
		MiArray impares = new MiArray(yo.getNumElem()-yo.numDePares());
		
		
		
		//separa par e impar
		for(int x = 0; x<yo.getNumElem(); x++) {
			if((yo.getIntMiArray(x)%2)==0) {
				pares.insertarValor(yo.getIntMiArray(x));
			}else {
				impares.insertarValor(yo.getIntMiArray(x));
			}
		}
		
		
		//muestra par e impar por pantalla
		System.out.println("Array de pares:");
		for(int x = 0; x<pares.getNumElem();x++) {
			System.out.print(pares.getIntMiArray(x)+" ");
		}
		System.out.println();
		System.out.println("Array de impares:");
		for(int x = 0; x<impares.getNumElem();x++) {
			System.out.print(impares.getIntMiArray(x)+" ");
		}
		
		
		
		yo.resetear();
		
		//par e impar alternando
		for(int x = 0; x<(pares.getNumElem()+impares.getNumElem()); x++) {
			if (x<pares.getNumElem()) {
				yo.insertarValor(pares.getIntMiArray(x));
			}
			if (x<impares.getNumElem()) {
				yo.insertarValor(impares.getIntMiArray(x));
			}
		}
		
		//muestra el array ordenado
		System.out.println();
		System.out.println("Array ordenado:");
		for(int x = 0; x<yo.getNumElem();x++) {
			System.out.print(yo.getIntMiArray(x)+" ");
		}
		
		
		
	}

} // cierra SimuladorLista
	// almacena enteros postivos

class MiArray {
	// atributos
	private int[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = -1;
		}

	}

	MiArray() {
		numElem = 0;
		miArray = new int[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = -1;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {
		return miArray;
	}

	public int getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return -1; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = -1;
			numElem=0;
		}
		
	}

	public void insertarValor(int valor) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = valor;
			numElem++;
		}
	}

	public int sacarValorUltimo() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			numElem--;
			temp=miArray[numElem];
			miArray[numElem]=-1;
			return temp;

		}
	}

	public int sacarValorPrimero() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			temp=miArray[0];
			// reducir en 1 numElem y meter los valores en la posicion anterior.
			for (int i=0; i<numElem-1;i++) {
				miArray[i]=miArray[i+1];
			}
			miArray[numElem-1]=-1;
			numElem--;
			
			return temp;
		}
	}

	public int numDePares(){
		int numPares=0;
		for(int i = 0; i<numElem; i++) {
			if((getIntMiArray(i)%2)==0) {
				numPares++;
			}
		}
		return numPares;
	}

	 
	
	
	
	
	
} // cierra MiArray










