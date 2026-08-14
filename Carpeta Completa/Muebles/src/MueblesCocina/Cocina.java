package MueblesCocina;

import Utilidades.Calidad;
import Utilidades.Estado;
import Utilidades.Posicion;
import Utilidades.Zona;
import modelo.Mueble;

public abstract class Cocina extends Mueble{

	private final int tempMaxima;
	private final int tempMinima;
	
	
	public Cocina(String nombre, Posicion posicion, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima, int tempMinima) {
		
		super(nombre, posicion, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona);
		
		this.tempMaxima = tempMaxima;
		this.tempMinima = tempMinima;
	}
	
	public void rompersePorDestruccionFisica() {
		if(getEstado() == Estado.SANO) {
			System.out.println("Me rompieron");
			setEstado(Estado.ROTO);	
		}
	}
	
	public void rompersePorQuemaduraElectrica() {
		if(getEstado() == Estado.SANO) {
			System.out.println("Me rompi");
			setEstado(Estado.ROTO);	
		}
	}
	
	public void cocinar() {
		System.out.println("Estoy cocinando");
	}
	
	
}
