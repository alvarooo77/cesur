package practicas;


public class metodos2 {

	public static void main(String[] args) {
		String cadena1;
		cadena1="hola ";
		String cadena2;
		cadena2="mundo ";
		String cadena;
		cadena= "hola mundo";
		char caracter='a';
		String cadena3;
		String cadena4;
		cadena3 = "adios ";
		cadena4="mundo ";
		String cadena5;
	
		System.out.println(uneCadenas("primero", uneCadenas("segundo", uneCadenas("tercero","cuarto"))));
		
		
		
		
		
		
		System.out.println(numOcurrenciasChar(cadena, caracter));
		
		
	}
	
	static String uneCadenas(String cadena1, String cadena2) {
		return cadena1+cadena2;
	}
	
	static void PasoCadenaA(String cadena, boolean mayusculas) {
		if (mayusculas) {
			cadena=cadena.toUpperCase();
		}else {
			cadena=cadena.toLowerCase();
			
		}
		
	}
	
	static int numOcurrenciasChar(String cadena, char caracter) {
		
		int x=0;
		
		for(int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i)==caracter) {
				x++;
			}
		}
		return x;
	}
	
}
