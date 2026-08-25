package modelo;

public class RecorridoIntermedio extends Recorrido{
	private float indice;
	
	
	public RecorridoIntermedio(float distancia,float indice) {
		super(distancia);
		this.indice = indice;
		setPuntaje(1+indice);
	}
	
	@Override
	public float calcularTiempo() {
		return ((getDistancia()/25)*indice);
	}
}
