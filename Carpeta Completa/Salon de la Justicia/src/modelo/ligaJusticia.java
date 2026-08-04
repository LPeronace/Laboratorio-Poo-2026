package modelo;
import java.util.ArrayList;
public class ligaJusticia {
	private ArrayList<Superheroe> liga = new ArrayList<>();
	
	public ArrayList<Superheroe> superheroesMasDe3Asistentes(){
		ArrayList<Superheroe> superheroesMasDe3 = new ArrayList<>();
		
		for(Superheroe s: liga) {
			if(s.masDe3Asistentes()) {
				superheroesMasDe3.add(s);
			}
		}
		
		return superheroesMasDe3;
	}
	
	public ArrayList<Superheroe> noLleganAFinDeMes(){
		ArrayList<Superheroe> noLlegan = new ArrayList<>();
		for(Superheroe s: liga) {
			if(!s.llegaAFinDeMes()) {
				noLlegan.add(s);
			}
		}
		
		
		return noLlegan;
	}
	public float presupuestoTotal() {
		float presupuesto = 0;
		
		for(Superheroe s: liga) {
			presupuesto += s.plataParaVaquita();		
		}
		return presupuesto;
	}
	
	public int contadorAsistenteMayorA60000() {
		int contadorAsistentes = 0;
		
		for(Superheroe s: liga) {
			contadorAsistentes += s.contadorAsistentesMayorA60000PorHeroe();
		}
		
		return contadorAsistentes;
	}
}
