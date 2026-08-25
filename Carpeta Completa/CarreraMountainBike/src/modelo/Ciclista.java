package modelo;
import java.util.ArrayList;
public class Ciclista {
	private int velocidadPromedio;
	private ArrayList<Recorrido> recorridosElegidos = new ArrayList<>();
	
	public Ciclista(int velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
		
	}
	
	public void agregarRecorridos(Recorrido ...recorridosAAñadir ) {
		for(Recorrido r: recorridosAAñadir) {
			recorridosElegidos.add(r);
		}
	}
	
	public boolean mayorA30Puntos() {
		float puntajeTotal = 0f;
		boolean mayorA30 = false;
		for(Recorrido r: recorridosElegidos) {
			puntajeTotal += r.getPuntaje();
		}
		
		if(puntajeTotal > 30) {
			mayorA30 = true;
		}
		return mayorA30;
	}
	
	public float calcularTiempoEstimadoTotal() {
		float tiempoEstimadoTotal = 0f;
		
		for(Recorrido r: recorridosElegidos) {
			tiempoEstimadoTotal += r.calcularTiempo();
		}
		
		return tiempoEstimadoTotal;
	}
	public float calcularDistanciaTotal() {
		float distanciaTotal = 0;
		
		for(Recorrido r: recorridosElegidos) {
			distanciaTotal = r.getDistancia(); 
		}
		
		
		return distanciaTotal;
	}
	
	public boolean rendimientoMenorA2Horas() {
		 boolean rendimientoMenor = false;
		 
		 float rendimiento = calcularDistanciaTotal()/velocidadPromedio;
		 
		 if(rendimiento < 2) {
			 rendimientoMenor = true;
		 }
		 
		 
		 return rendimientoMenor;
	}
}
