package modelo;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Tambo> empresa = new ArrayList<>();
	
	
	public Empresa(ArrayList<Tambo> empresa) {
		this.empresa = empresa;
	}
	
	public Tambo mostrarTamboMayorArea() {
		Tambo tamboMayor = empresa.get(0);
		
		for(Tambo t: empresa) {
			if(t.getSuperficie() > tamboMayor.getSuperficie()) {
				tamboMayor = t;
			}
		}
		
		return tamboMayor;
	}
	
	public int conseguirProduccionRecaudada() {
		int sumatoria = 0;
		for(Tambo t: empresa) {
			sumatoria += t.conseguirProduccionTotal();
		}
		return sumatoria;
	}
	
	
	public void hacerMugirAVacaMasProductora() {
		Tambo tamboConVacaMayor = empresa.get(0);
		Vaca mejorVaca = tamboConVacaMayor.getVacas()[0];
		
		for(Tambo t: empresa) {
			if(t.vacaMasProductoraTamboLeche() >tamboConVacaMayor.vacaMasProductoraTamboLeche()) {
				mejorVaca = t.vacaMasProductoraTambo();
			}
		}
		
		mejorVaca.mugir();
		
	}
	
}
