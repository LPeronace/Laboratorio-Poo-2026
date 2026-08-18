package Menus;

import java.util.Scanner;
import MueblesCocina.Comida;
import Utilidades.EstadoComida;
import MueblesCocina.Heladera;
import Utilidades.Calidad;
import Utilidades.Estado;
import Utilidades.Utilidad;
import Utilidades.Zona;
import Utilidades.Posicion;
import modelo.Jugador;
public class MenuCocina {
	private Scanner s = new Scanner(System.in);
	private Utilidad u = new Utilidad();
	private boolean salir = false;
	private Posicion posicion = new Posicion(30,0,10);
	private Heladera heladera = new Heladera("Rubi", posicion ,1,0,"Cuero", Calidad.BUENA, Estado.SANO,Zona.COCINA, 20, 1);
	private Comida churrasco = new Comida(EstadoComida.CRUDA, "churrasco");
	private Jugador jugador;
	
	
	public MenuCocina(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public void menu() {
		do {
			System.out.println("Estas en la cocina, elija una opcion");
			System.out.println("|         1_ Usar heladera          |");
			System.out.println("|         2_ Usar microondas        |");
			System.out.println("|         3_ Usar horno             |");
			System.out.println("|         4_ Salir             		|");
			System.out.println("|___________________________________|"); 
			int opcionNumerica = u.comprobarNumero(s.nextInt(),4,1);
			
			switch(opcionNumerica) {
			case 1:
				System.out.println("Abriste la heladera, que queres hacer?");
				System.out.println("|        1_ Comprar comida           |");
				System.out.println("|        2_ Sacar comida             |");
				System.out.println("|        3_ Ver la comida guardada   |");
				System.out.println("|____________________________________|");
				opcionNumerica = u.comprobarNumero(s.nextInt(),3,1);
				switch(opcionNumerica) {
				case 1:
					System.out.println("Elija una de las dos opciones de la lista para compras:");
					System.out.println("1- Churrasco");
					System.out.println("2- Churrasco");
					opcionNumerica = u.comprobarNumero(s.nextInt(),2,1);
					System.out.println("Compraste comida :))))))))");
					switch(opcionNumerica) {
					case 1,2:
						heladera.guardarCosas(churrasco);
						break;
					}
					jugador.cambiarMasHambre(20);
					System.out.println("+20 hambre..");
					break;
				case 2:
					heladera.sacarCosas();
					break;
				case 3:
					heladera.mostrarCosasEnLaHeladera();
					break;
				}
				break;
			case 2:
				System.out.println("Estas cocinando algo en el microondas..");
				break;
			case 3:
				System.out.println("Estas cocinando algo en el horno..");
				break;
			case 4:
				salir = true;
				break;
			}
		}while(!salir);
		
	}
}
