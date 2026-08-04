package modelo;

public class Sector {
	private int metros;
	private Fauna fauna;
	
	public Sector(int metros, Fauna fauna) {
		this.metros = metros;
		this.fauna = fauna;
	}
	public Sector(Fauna fauna) {
		this.fauna = fauna;
	}
	
	public boolean esVulnerable() {
		return fauna.enPeligro();
	}
	public float valorSector() {
		return ( (metros*300) + fauna.getValorPromedio());
	}
	
	public int cantidadEspeciesEnFauna() {
		return fauna.getCantEspecies();
	}
	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public Fauna getFauna() {
		return fauna;
	}

	public void setFauna(Fauna fauna) {
		this.fauna = fauna;
	}
}
