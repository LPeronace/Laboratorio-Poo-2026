package modelo;

public class Cocina extends Mueble{

	private final int tempMaxima;
	private final int tempMinima;
	
	
	public Cocina(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int tempMaxima, int tempMinima) {
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona);
		
		this.tempMaxima = tempMaxima;
		this.tempMinima = tempMinima;
	}
	
	public void rompersePorSobrecarga() {
		if(getEstado() == Estado.SANO) {
			System.out.println("Me rompi");
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
