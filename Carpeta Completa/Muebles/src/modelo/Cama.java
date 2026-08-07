package modelo;

public class Cama extends Descanso {
	public Cama(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima, int comodidad, int proteccionContraFrio) 
	{
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona);
	}
}
