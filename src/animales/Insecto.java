package animales;

public class Insecto extends Animal {
	private boolean alas;
	private boolean antenas;
	private Enemigo[] enemigos;
	public String atributo;
	
	public Insecto(String nombre, int tpoVida, boolean alas, boolean antenas) {
		super(nombre, tpoVida);
		this.alas = alas;
		this.antenas = antenas;
		atributo = "soy insecto";
		enemigos = new Enemigo[5];
	}
	public boolean isAlas() {
		return alas;
	}
	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	public boolean isAntenas() {
		return antenas;
	}
	public void setAntenas(boolean antenas) {
		this.antenas = antenas;
	}
	
	public Enemigo[] getEnemigos() {
		return enemigos;
	}
	public void setEnemigo(String enemigo) {
		enemigos[0]= new Enemigo(enemigo);
	}


	class Enemigo {
		private String nombre;

		public Enemigo(String nombre) {
			super();
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	}
	
	class MiArrayEnemigos {
		// atributos
		private int[] miArray;
		private int numElem;
		private static final int lONGITUD_DEFAULT = 10;
		private int longitud;

		// constructores
		MiArrayEnemigos(int longitud) {
			numElem = 0;
			miArray = new int[longitud];
			for (int i = 0; i < longitud; i = i + 1) {
				miArray[i] = -1;
			}

		}

		MiArrayEnemigos() {
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
	
}