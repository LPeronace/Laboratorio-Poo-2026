package modelo;
//Lautaro Peronace 5°3
public abstract class Ciencia extends Satelite{
	
	private int medidorCiencia;


	public Ciencia(int x, int y, int z, Propulsor propulsor,Paneles panel, int antena, long capacidadCarga, float cargaActual,Identificador identificador) {
		super(x, y, z, propulsor, panel, antena, capacidadCarga, cargaActual,identificador);

	}

	//Hago la carga y checkeo si hace un experimento o no
	public void cargarCelula() {
		float sumaCarga = 0;
		if(haceExperimento()) {
			sumaCarga += (1000000000 * getPanel().multi) *0.4f;
		}
		else {
			sumaCarga += (1000000000 * getPanel().multi);
		}
		
		comprobarLimites(sumaCarga);
		
	}
	//Checkeo que no se pase del limite maximo, si no lo seteo como el maximo
	public void comprobarLimites(float sumaCarga)
	{

		if((sumaCarga + getCargaActual()) > getCapacidadCarga()) {
			setCargaActual(getCapacidadCarga());
		}
		else {
			setCargaActual(getCargaActual()+sumaCarga);
		}
	}
	//Veo si esa haciendo un experimento
	public boolean haceExperimento() {
		return ((medidorCiencia > 1000000000) && !estaHibernando());
	}
	
	//Lautaro Peronace 5°3
	
	public void generarCiencia() {	
		medidorCiencia += (10 * (getCargaActual()/ 3000000000l));
	}
	public int getMedidorCiencia() {
		return medidorCiencia;
	}

	public void setMedidorCiencia(int medidorCiencia) {
		this.medidorCiencia = medidorCiencia;
	}

	
}
