package modelo;

import java.util.Scanner;

public class Menu {
	
	private Scanner s = new Scanner(System.in);
	private Utilidad u = new Utilidad();
	public Menu() {
	}
	
	
	public void hacerMenu() {
		boolean salir = false;
		do{
			System.out.println("---------Menu--------");
			System.out.println("| 1_ Ir a la cocina |");
			System.out.println("| 2_ Ir a la sala   |");
			System.out.println("| 3_ Ir a la pieza  |");
			System.out.println("|___________________|");
			int opcionNumerica = u.comprobarNumero(s.nextInt(),3,1);
			
			
			//Ir a la cocina,pieza, sala de estar,
			switch(opcionNumerica) {
			case 1:
				System.out.println("Entraste a la cocina, elija una opcion");
				System.out.println("|          1_ Usar heladera          |");
				System.out.println("|          2_ Usar microondas        |");
				System.out.println("|          3_ Usar horno             |");
				System.out.println("|____________________________________|"); 
				opcionNumerica = u.comprobarNumero(s.nextInt(),3,1);
				
				switch(opcionNumerica) {
				case 1:
					System.out.println("Abriste la heladera, que queres hacer?");
					System.out.println("|          1_  guardar algo           |");
					System.out.println("|          2_  sacar algo             |");
					System.out.println("|_____________________________________|");
					opcionNumerica = u.comprobarNumero(s.nextInt(),2,1);
					break;
				case 2:
					System.out.println("Estas cocinando algo en el microondas..");
					break;
				case 3:
					System.out.println("Estas cocinando algo en el horno..");
					break;
				}
				break;
			case 2:
				System.out.println("Entraste a la sala, elija que hacer");
				System.out.println("|     1_ Sentarse en la silla     |");
				System.out.println("|     2_ Sentarse en el sillon    |");
				System.out.println("|     3_ dormir en el piso        |");
				System.out.println("|     4_ dormir en la silla       |");
				System.out.println("|     5_ dormir en el sillon      |");
				System.out.println("|_________________________________|");
				opcionNumerica = u.comprobarNumero(s.nextInt(),5,1);
				
				switch(opcionNumerica) {
				case 1:
					System.out.println("Te sentaste en la silla ");
					break;
				case 2:
					System.out.println("Te sentaste en el sillon");
					break;
				case 3:
					System.out.println("Te dormiste en el piso");
					break;
				case 4:
					System.out.println("Te dormiste en la silla");
					break;
				case 5:
					System.out.println("Te dormiste en el sillon");
					break;
				}
				
				break;
			case 3:
				System.out.println("Entraste en la pieza, elija que hacer..");
				System.out.println("|      1_ sentarse en la cama        |");
				System.out.println("|      2_ acostarse en la cama       |");
				System.out.println("|      3_ dormir en la cama          |");
				System.out.println("|____________________________________|");
				
				opcionNumerica = u.comprobarNumero(s.nextInt(),3,1);
				
				switch(opcionNumerica) {
				case 1: 
					System.out.println("Te sentaste en la cama y te pones a pensar en la vida mirando a la pared..");
					break;
				case 2:
					System.out.println("Te acostaste en la cama");
					break;
				case 3:
					System.out.println("Te dormiste en la cama, saliendo del menu..");
					salir = true;
					break;
				}
				break;
			}
			
		}while(!salir); 
		
		
	}
	
	
	
	
}
