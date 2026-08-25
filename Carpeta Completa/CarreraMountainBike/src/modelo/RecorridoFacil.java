package modelo;

public class RecorridoFacil extends Recorrido {
	
	public RecorridoFacil(int distancia) {
		super(distancia);
		setPuntaje(1);
	}

	@Override
	public float calcularTiempo() {			
		return getDistancia()/30;
	}
}
