package practicas;

public class diassemana {
	public static void main(String[] args) {

		int diasS = 0;
		int semana = 0;
		int mes = 0;

		while (mes < 12) {
			
			switch (mes) {
			case 0:
				System.out.print("Enero:");
				System.out.print("");
				break;
			case 1:
				System.out.print("Febrero:");
				System.out.print("");
				break;
			case 2:
				System.out.print("Marzo:");
				System.out.print("");
				break;
			case 3:
				System.out.print("Abril:");
				System.out.print("");
				break;
			case 4:
				System.out.print("Mayo:");
				System.out.print("");
				break;
			case 5:
				System.out.print("Junio:");
				System.out.print("");
				break;
			case 6:
				System.out.print("Julio:");
				System.out.print("");
				break;
			case 7:
				System.out.print("Agosto:");
				System.out.print("");
				break;
			case 8:
				System.out.print("Septiembre:");
				System.out.print("");
				break;
			case 9:
				System.out.print("Octubre:");
				System.out.print("");
				break;
			case 10:
				System.out.print("Noviembre:");
				System.out.print("");
				break;
			case 11:
				System.out.print("Diciembre:");
				System.out.print("");
				break;
			}
			
			while (semana < 4) {
				while (diasS < 7) {

					switch (diasS) {
					case 0:
						System.out.print("[");
						System.out.print("L");
						System.out.print(" ");
						break;
					case 1:
						System.out.print("M");
						System.out.print(" ");
						break;
					case 2:
						System.out.print("X");
						System.out.print(" ");
						break;
					case 3:
						System.out.print("J");
						System.out.print(" ");
						break;
					case 4:
						System.out.print("V");
						System.out.print(" ");
						break;
					case 5:
						System.out.print("S");
						System.out.print(" ");
						break;
					case 6:
						System.out.print("D");
						System.out.print("]");
						System.out.print(" ");
						break;
					}
					diasS++;
				}
				if (diasS == 7) {
					diasS = 0;
				}
				semana++;
			}
			System.out.println("");
			if (semana == 4) {
				semana = 0;
				}
			mes++;
		}
	}
}
