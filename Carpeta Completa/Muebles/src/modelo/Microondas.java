package modelo;

public final class Microondas extends Cocina{
	public Microondas(String nombre, Posicion posicion, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima, int tempMinima) {
		super(nombre, posicion, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona, tempMaxima, tempMinima);
	}
}
