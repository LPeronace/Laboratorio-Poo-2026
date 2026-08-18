package Menus;
import modelo.Jugador;

import java.util.Scanner;

import Utilidades.Utilidad;
public class MenuSala {
	private Jugador jugador;
	private Scanner s = new Scanner(System.in);
	private Utilidad u = new Utilidad();
	
	
	public MenuSala(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public void menu() {
		System.out.println("Entraste a la sala, elija que hacer");
		System.out.println("|     1_ Sentarse en la silla     |");
		System.out.println("|     2_ Sentarse en el sillon    |");
		System.out.println("|     3_ Dormir en el piso        |");
		System.out.println("|     4_ Dormir en la silla       |");
		System.out.println("|     5_ Dormir en el sillon      |");
		System.out.println("|_________________________________|");
		int opcionNumerica = u.comprobarNumero(s.nextInt(),5,1);
		
		switch(opcionNumerica) {
		case 1:
			System.out.println("Te sentaste en la silla ");
			jugador.cambiarMasEnergia(10);
			System.out.println("+10 energia..");
			break;
		case 2:
			System.out.println("Te sentaste en el sillon");
			jugador.cambiarMasEnergia(15);
			System.out.println("+15 energia..");
			break;
		case 3:
			System.out.println("Te dormiste en el piso");
			System.out.println("+30 energia...");
			System.out.println("-10 felicidad...");
			jugador.cambiarMasEnergia(30);
			jugador.cambiarMenosFelicidad(10);
			break;
		case 4:
			System.out.println("Te dormiste en la silla");
			System.out.println("+20 energia..");
			jugador.cambiarMasEnergia(20);
			
			break;
		case 5:
			System.out.println("Te dormiste en el sillon");
			System.out.println("+40 energia..");
			jugador.cambiarMasEnergia(40);
			break;
		}
	}
}
