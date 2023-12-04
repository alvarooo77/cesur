package learning_java;

public class hola{
	public static void main(String[] args) {
		String[] cadenaInicial = new String[10];
		for (int i=0; i<3; i++) {
			cadenaInicial[i]=("hola");
		}
		ListaFijaCadena cadena;
		cadena = new ListaFijaCadena(4,cadenaInicial);
		System.out.println("num elemento: "+ cadena.getNumE());
		for(int i = 0; i<cadena.getNumE(); i++) {
			System.out.println(cadena.getListaArray()[i]);
		}
	}
}

class ListaFijaCadena{
	
	// atributos
	
	private int numE;
	private String[] listaArray = new String[maxNumE];
	private static final int maxNumE=10;
	
	
	// metodos
	
	public int getNumE() {
		return numE;
	}
	
	public ListaFijaCadena(int numE, String[] listaArray) {
		this.numE=numE;
		this.listaArray=listaArray;
	}

	public void setNumE(int numE) {
		this.numE = numE;
	}
	
	public String[] getListaArray() {
		return listaArray;
	}
	
	public void setListaArray(String[] listaArray) {
		this.listaArray = listaArray;
	}
	
	public int getMaxNumE() {
		return maxNumE;
	}
}


