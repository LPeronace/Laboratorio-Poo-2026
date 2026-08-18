package Menus;
import java.util.Scanner;

import Utilidades.Utilidad;
import modelo.Jugador;
public class MenuPieza {
	private Jugador jugador;
	private Scanner s = new Scanner(System.in);
	private Utilidad u = new Utilidad();
	
	public MenuPieza(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public void menu() {
		System.out.println("Entraste en la pieza, elija que hacer..");
		System.out.println("|      1_ Acostarse en la cama       |");
		System.out.println("|      2_ Dormir en la cama          |");
		System.out.println("|____________________________________|");
		
		int opcionNumerica = u.comprobarNumero(s.nextInt(),2,1);
		
		switch(opcionNumerica) {
		case 1: 
			System.out.println("Te acostaste en la cama");
			System.out.println("-20 energia...");
			jugador.cambiarMenosEnergia(20);
			break;
		case 2:
			System.out.println("Te dormiste en la cama");
			System.out.println("+60 energia...");
			System.out.println("+10 felicidad...");
			jugador.cambiarMasEnergia(60);
			jugador.cambiarMasFelicidad(10);
			break;
		}
	}
}
