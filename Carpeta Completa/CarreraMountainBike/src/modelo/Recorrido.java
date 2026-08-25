package modelo;

public abstract class Recorrido {
	private float distancia;
	private float puntaje;
	
	public Recorrido(float distancia) {
		this.distancia = distancia;
	}
	
	public abstract float calcularTiempo();
	
	
	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public float getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(float puntaje) {
		this.puntaje = puntaje;
	}
}
