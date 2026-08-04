package modelo;
import java.util.ArrayList;
public class Amazonas {
	private ArrayList<Sector> sectores = new ArrayList<>();
	
	public Amazonas(ArrayList<Sector> sectores) {
		this.sectores = sectores;
	}
	public Amazonas() {
		
	}
	public ArrayList<Sector> sectoresVulnerables(){
		ArrayList<Sector> sectoresDebiles = new ArrayList<>();
		
		for(Sector s: sectores) {
			if(s.esVulnerable()) {
				sectoresDebiles.add(s);
			}
		}
		
		return sectoresDebiles;
	}
	
	public Sector mayorEspecies() {
		Sector sectorMayor = sectores.get(0);
		for(Sector s: sectores) {
			if(s.cantidadEspeciesEnFauna() > sectorMayor.cantidadEspeciesEnFauna()) {
				sectorMayor = s;
			}
		}
		
		return sectorMayor;
	}
	
	public float valorMercadoIlegal() {
		float valor = 0f;
		
		for(Sector s: sectores) {
			valor += s.valorSector();
		}
		
		return valor;
	}

	public ArrayList<Sector> getSectores() {
		return sectores;
	}

	public void setSectores(ArrayList<Sector> sectores) {
		this.sectores = sectores;
	}
	
}
