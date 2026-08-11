package modelo;

public abstract class Descanso extends Mueble{
	
	protected int comodidad;
	protected final int cargaMaxima;
	protected int proteccionContraFrio;
	protected int cargaActual;
	
	public Descanso(String nombre,Posicion posicion, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima, int comodidad, int proteccionContraFrio) 
	{
		super(nombre, posicion, cantidadPersonasActual, gradoSuciedad,
			material, calidad, estado, zona);
		
		this.cargaMaxima = cargaMaxima;
		this.proteccionContraFrio = proteccionContraFrio;
		this.comodidad = comodidad;
	}
	
	
	
	public void rompersePorSobrecarga() {
		if(getCapacidadPersonasActual() > cargaMaxima) {
			setEstado(Estado.ROTO);
		}
	}
	
	
	

}
