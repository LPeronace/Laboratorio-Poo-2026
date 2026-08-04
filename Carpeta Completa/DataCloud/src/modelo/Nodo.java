package modelo;

public class Nodo {
	
	private int consumoElectrico;
	private Disco disco;
	
	public Nodo(int consumoElectrico, Disco disco) {
		this.consumoElectrico = consumoElectrico;
		this.disco = disco;
	}
	public Nodo(Disco disco) {
		this.disco = disco;
	}
	
	//Aca agarro la velocidad de transferencia del disco para que quede mas limpio el codigo en Centro
	public int conseguirVelocidadDisco() {
		return disco.getTasaTransferencia();
	}
	
	
	//Aca aplico la formula para sacar el consumo total del nodo, para despues usarlo en centro
	public float consumoElectricoNodo() {
		return((consumoElectrico*1.5f) + conseguirVelocidadDisco());
	}
	
	
	//Aca veo si el disco que tiene asociado el nodo esta en riesgo
	public boolean esNodoCritico() {
		return disco.estaEnRiesgo();
	}
	
	//Todos los get y sets necesarios
	
	
	public int getConsumoElectrico() {
		return consumoElectrico;
	}

	public void setConsumoElectrico(int consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}
	
}
