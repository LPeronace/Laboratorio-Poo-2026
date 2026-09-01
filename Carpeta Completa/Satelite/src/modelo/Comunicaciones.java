package modelo;

//Lautaro Peronace 5°3
public abstract class Comunicaciones extends Satelite{

	public Comunicaciones(int x, int y, int z, Propulsor propulsor, Paneles panel, int antena, long capacidadCarga,
			float cargaActual,Identificador identificador) {
		super(x, y, z, propulsor, panel, antena, capacidadCarga, cargaActual,identificador);
	}
	//Hago lo mismo que en ciencia, hago la carga y despues la sumo a la carga actual(primero haciendo el checkeo de limite)
	public void cargarCelula() {
		float sumaCarga = 1000000000 * getPanel().multi;
		comprobarLimites(sumaCarga);
		
	}
	
	public void comprobarLimites(float sumaCarga)
	{

		if((sumaCarga + getCargaActual()) > getCapacidadCarga()) {
			setCargaActual(getCapacidadCarga());
		}
		else {
			setCargaActual(getCargaActual()+sumaCarga);
		}
	}
	
	public void enrutarComunicaciones() {
		
		setCargaActual(getCargaActual() - 10000000000l);	
	}
	
}
//Lautaro Peronace 5°3