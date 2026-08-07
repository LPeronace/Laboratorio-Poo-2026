package modelo;

public class Descanso extends Mueble{
	
	private int comodidad;
	private final int cargaMaxima;
	private int proteccionContraFrio;
	private int cargaActual;
	
	public Descanso(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima, int comodidad, int proteccionContraFrio) 
	{
		
		super(nombre, posicionX, posicionY, posicionZ, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona);
		
		this.cargaMaxima = cargaMaxima;
		this.proteccionContraFrio = proteccionContraFrio;
		this.comodidad = comodidad;
	}
	
	public void rompersePorCarga() {
		if(getCapacidadPersonasActual() > cargaMaxima) {
			setEstado(Estado.ROTO);
		}
	}
	
	
	

}
