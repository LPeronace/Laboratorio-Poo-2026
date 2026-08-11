package modelo;

public class Microondas extends Cocina{
	public Microondas(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima, int tempMinima) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona, tempMaxima, tempMinima);
	}
}
