package modelo;
import java.util.ArrayList;

public class Aeropuerto {
	private ArrayList<Vuelo> vuelos = new ArrayList<>();
	
	public Aeropuerto() {
		
	}
	
	public Persona laMasFuriosa(){
		Vuelo vueloConPersonaFuriosa = vuelos.get(0);
		Persona persona = vueloConPersonaFuriosa.mayorTiempoEsperadoPersona();
		for(Vuelo v: vuelos) {
			if(v.conseguirPersonaMayorTiempo() < vueloConPersonaFuriosa.conseguirPersonaMayorTiempo()) {
				persona = v.mayorTiempoEsperadoPersona();
			}
		}
		return persona;
		
	}
	public ArrayList<Vuelo> losLowCost() {
		ArrayList<Vuelo> vuelosBaratos = new ArrayList<>();
		
		for(Vuelo v: vuelos) {
			if(v.esLowCost()) {
				vuelosBaratos.add(v);
			}
		}
		return vuelosBaratos;
	}
	
	public float recaudacionTotal() {
		float total = 0f;
		for(Vuelo v: vuelos) {
			total += v.gananciaTotal();
		}
		return total;
	}
	
	public void setVuelos(ArrayList<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	public ArrayList<Vuelo> getVuelos(){
		return vuelos;
	}
	
	
}
