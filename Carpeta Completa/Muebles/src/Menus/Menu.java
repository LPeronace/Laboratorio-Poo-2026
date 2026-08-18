package Menus;

import java.util.Scanner;

import modelo.Jugador;
import Utilidades.Utilidad;

public class Menu {
	private Scanner s = new Scanner(System.in);
	private Utilidad u = new Utilidad();
	private Jugador jugador = new Jugador(0,0,0,0);
	private MenuCocina menuCocina = new MenuCocina(jugador);
	private MenuSala menuSala = new MenuSala(jugador);
	private MenuPieza menuPieza = new MenuPieza(jugador);
	private MenuBaño menuBaño = new MenuBaño(jugador);
	
	public Menu() {
	}
	
	
	public void hacerMenu() {
		boolean salir = false;
		do{
			System.out.println("--------------Menu------------");
			System.out.println("| 1_ Ir a la cocina           |");
			System.out.println("| 2_ Ir a la sala   		  |");
			System.out.println("| 3_ Ir a la pieza  		  |");
			System.out.println("| 4_ Ir al baño     		  |");
			System.out.println("| 5_ Mostrar estado jugador   |");
			System.out.println("|_____________________________|");
			int opcionNumerica = u.comprobarNumero(s.nextInt(),5,1);
			
			switch(opcionNumerica) {
			case 1:
				menuCocina.menu();
				break;
			case 2:
				menuSala.menu();
				break;
			case 3:
				menuPieza.menu();
				break;
			case 4:
				menuBaño.menu();
				break;
			case 5:
				jugador.mostrarTodo();
				break;
			
			}
			
		}while(!salir); 
		
		
	}
	
	
	
	
}
