package MueblesCocina;
import java.util.ArrayList;

import Utilidades.Calidad;
import Utilidades.Estado;
import Utilidades.Posicion;
import Utilidades.Zona;

public final class Heladera extends Cocina{
	
	private ArrayList<Comida> comidaGuardada = new ArrayList<Comida>();

	
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
			System.out.println("-10 de felicidad....");
			System.out.println("+10 de hambre....");
			
			
		}
		for(int i = 0; i<comidaGuardada.size(); i++) {
			System.out.println((i+1) + " "+ comidaGuardada.get(i).getNombre());
		}
	}
	
}
