package MueblesDescanso;

import Utilidades.Calidad;
import Utilidades.Estado;
import Utilidades.Posicion;
import Utilidades.Zona;

public final class Cama extends Descanso {
	public Cama(String nombre, Posicion posicion,
			String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima, int comodidad, int proteccionContraFrio) 
	{
		super(nombre, posicion, 0,0,material, calidad, estado, zona, cargaMaxima, comodidad, proteccionContraFrio);
	}
	
	
}
