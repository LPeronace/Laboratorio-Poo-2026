package modelo;
import java.util.ArrayList;
public class Carrera {
	private ArrayList<Ciclista> ciclistas = new ArrayList<>();
	
	public Carrera() {
		
	}
	
	
	public void agregarCiclistas(Ciclista ...ciclistaAAñadir ) {
		for(Ciclista c: ciclistaAAñadir) {
			ciclistas.add(c);
		}
	}
	
	public ArrayList<Ciclista> mayoresA30(){
		ArrayList<Ciclista> ciclistasConMasDe30Puntos = new ArrayList<>();
		
		for(Ciclista c: ciclistas) {
			if(c.mayorA30Puntos()) {
				ciclistasConMasDe30Puntos.add(c);
			}
		}
		
		
		return ciclistasConMasDe30Puntos;
	}
	
	public Ciclista ciclistaConMayorTiempo() {
		Ciclista mayorTiempo = ciclistas.get(0);
		
		for(Ciclista c: ciclistas) {
			if(mayorTiempo.calcularTiempoEstimadoTotal() < c.calcularTiempoEstimadoTotal()) {
				mayorTiempo = c;
			}
		}
		
		return mayorTiempo;
	}
	
	public boolean hayCiclistaConMenosDe2Horas() {
		boolean hay = false;
		int i = 0;
		do{
			Ciclista c = ciclistas.get(i);
			if(c.rendimientoMenorA2Horas()) {
				hay = true;
			}
			
			i++;
		}while(!hay);
		
		return hay;
	}
	
}
