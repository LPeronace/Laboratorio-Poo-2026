package modelo;
import java.util.ArrayList;
public class Aeropuerto {
	private ArrayList<Vuelo> vuelos = new ArrayList<>();
	
	public Aeropuerto() {
	}
	
	public void agregarVuelos(Vuelo ...vuelosAAñadir ) {
		for(Vuelo v: vuelosAAñadir) {
			vuelos.add(v);
		}
	}
	
	
	public float recaudacionTotal() {
		float sumatoriaTotal = 0f;
		
		for(Vuelo v: vuelos) {
			sumatoriaTotal += v.sumaTotal();
		}
		
		
		return sumatoriaTotal;
	}
	
	public ArrayList<Vuelo> losLowCost(){
		ArrayList<Vuelo> losLowCost = new ArrayList<>();
		
		for(Vuelo v: vuelos) {
			if(v.esLowCost()) {
				losLowCost.add(v);
			}
		}
		
		
		return losLowCost;
	}
	
	public Pasajero laMasFuriosa() {
		Pasajero pasajeroMasFuriosa= vuelos.get(0).getPasajeros()[0];
		
		for(Vuelo v: vuelos) {
			Pasajero p = v.masFuriosoDelVuelo();
			if(p.getMinutosEsperando() > pasajeroMasFuriosa.getMinutosEsperando()) {
				pasajeroMasFuriosa = p;
			}
		}
		
		return pasajeroMasFuriosa;
	}
	
}
