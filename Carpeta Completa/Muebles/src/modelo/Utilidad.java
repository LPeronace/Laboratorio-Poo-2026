package modelo;
import java.util.Scanner;
public class Utilidad {
	//Comprobacion de strings
	private Scanner s = new Scanner(System.in);

	
	public Utilidad() {
		
	}
	
	public int comprobarNumero(int numeroElegido, int maximo, int minimo) {
		boolean salir = false;
		do {
			if(numeroElegido > maximo || numeroElegido < minimo) {
				System.out.print("Numero fuera de rango, elija otro:");
				numeroElegido = s.nextInt();
				salir = false;
			}
			else {
				salir = true;
			}
		}while(!salir);
		return numeroElegido;
	}
	
}
