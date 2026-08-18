package MueblesCocina;
import java.util.ArrayList;
import java.util.Scanner;

import Utilidades.Calidad;
import Utilidades.Estado;
import Utilidades.Posicion;
import Utilidades.Zona;
import Utilidades.Utilidad;
public final class Heladera extends Cocina{
	
	private ArrayList<Comida> comidaGuardada = new ArrayList<Comida>();
	private Scanner s = new Scanner(System.in);
	private Utilidad u = new Utilidad();
	
	public Heladera(String nombre, Posicion posicion, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima, int tempMinima) {
		
		super(nombre, posicion, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona, tempMaxima, tempMinima);
	}
	

	public void guardarCosas(Comida comida){
		comidaGuardada.add(comida);
	}
	
	public void mostrarCosasEnLaHeladera() {
		if(comidaGuardada.isEmpty()) {
			System.out.println("No hay comida guardada :(");
			
		}
		for(int i = 0; i<comidaGuardada.size(); i++) {
			System.out.println((i+1) + "_ "+ comidaGuardada.get(i).getNombre());
		}
	}
	public void sacarCosas() {
		mostrarCosasEnLaHeladera();
		if(!comidaGuardada.isEmpty()) {
			System.out.println("¿Que queres sacar?");
			int opcionNumerica = u.comprobarNumero(s.nextInt(),comidaGuardada.size(),1);
			System.out.println("Sacaste un/una:"+ comidaGuardada.get(opcionNumerica-1).getNombre());
			comidaGuardada.remove(opcionNumerica-1);
		}
		

	}
	
}
