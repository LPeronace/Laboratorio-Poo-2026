package modelo;

public class RecorridoDificil extends Recorrido{
	private int cantObstaculos;
	
	
	public RecorridoDificil(float distancia,int cantObstaculos) {
		super(distancia);
		this.cantObstaculos = cantObstaculos;
		setPuntaje(distancia*0.5f);
	}
	
	@Override
	public float calcularTiempo() {
		return ((getDistancia()/20) * cantObstaculos);
	}
}
