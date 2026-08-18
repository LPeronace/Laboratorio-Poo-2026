package Menus;
import modelo.Jugador;

import java.util.Scanner;

import Utilidades.Utilidad;
public class MenuBaño {
	private Jugador jugador;
	private Scanner s = new Scanner(System.in);
	private Utilidad u = new Utilidad();
	
	
	public MenuBaño(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public void menu() {
		System.out.println("Entraste al baño y saliste porque no hay muebles");
		System.out.println("-20 de energia...");
		System.out.println("-50 de felicidad...");
		System.out.println("-70 de higiene...");
		jugador.cambiarMenosFelicidad(50);
		jugador.cambiarMenosEnergia(20);
		jugador.cambiarMenosHigiene(70);
	}
}