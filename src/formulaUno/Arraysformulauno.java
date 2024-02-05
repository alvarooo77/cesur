package formulaUno;

class MiArrayCoche {
	// atributos
	private Coche[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	MiArrayCoche(int longitud) {
		numElem = 0;
		miArray = new Coche[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	MiArrayCoche() {
		numElem = 0;
		miArray = new Coche[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Coche[] getMiArray() {
		return miArray;
	}

	public Coche getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem=0;
		}
		
	}

	public void insertarValor(Coche Coche) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = Coche;
			numElem++;
		}
	}
} // cierra MiArray


class MiArrayIngeniero {
	// atributos
	private Ingeniero[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	MiArrayIngeniero(int longitud) {
		numElem = 0;
		miArray = new Ingeniero[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	MiArrayIngeniero() {
		numElem = 0;
		miArray = new Ingeniero[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Ingeniero[] getMiArray() {
		return miArray;
	}

	public Ingeniero getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem=0;
		}
		
	}

	public void insertarValor(Ingeniero Ingeniero) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = Ingeniero;
			numElem++;
		}
	}
} // cierra MiArray


class MiArrayMecanico {
	// atributos
	private Mecanico[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	MiArrayMecanico(int longitud) {
		numElem = 0;
		miArray = new Mecanico[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	MiArrayMecanico() {
		numElem = 0;
		miArray = new Mecanico[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Mecanico[] getMiArray() {
		return miArray;
	}

	public Mecanico getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem=0;
		}
		
	}

	public void insertarValor(Mecanico Mecanico) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = Mecanico;
			numElem++;
		}
	}
} // cierra MiArray

class MiArrayPiloto {
	// atributos
	private Piloto[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	MiArrayPiloto(int longitud) {
		numElem = 0;
		miArray = new Piloto[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	MiArrayPiloto() {
		numElem = 0;
		miArray = new Piloto[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public Piloto[] getMiArray() {
		return miArray;
	}

	public Piloto getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem=0;
		}
		
	}
	
	public void insertarValor(Piloto Piloto) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = Piloto;
			numElem++;
		}
	}
} // cierra MiArray



class MiArrayJefeEscuderia {
	// atributos
	private JefeEscuderia[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	MiArrayJefeEscuderia(int longitud) {
		numElem = 0;
		miArray = new JefeEscuderia[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	MiArrayJefeEscuderia() {
		numElem = 0;
		miArray = new JefeEscuderia[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public JefeEscuderia[] getMiArray() {
		return miArray;
	}

	public JefeEscuderia getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem=0;
		}
		
	}

	public void insertarValor(JefeEscuderia JefeEscuderia) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = JefeEscuderia;
			numElem++;
		}
	}
} // cierra MiArray
