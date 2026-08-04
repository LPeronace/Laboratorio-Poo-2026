package modelo;
public class Persona {
	private int minutosEsperando;
	private int precioPasaje;
	private boolean tieneCompromiso;
	
	public Persona(int minutosEsperando, int precioPasaje, boolean tieneCompromiso) {
		this.minutosEsperando = minutosEsperando;
		this.precioPasaje = precioPasaje;
		this.tieneCompromiso = tieneCompromiso;
	}
	public Persona(int minutosEsperando) {
		this.minutosEsperando = minutosEsperando;
	}
	
	public boolean mayorASesentaMinutos() {
		return minutosEsperando >= 60;
	}
	
	public int getMinutosEsperando() {
		return minutosEsperando;
	}
	
	public int getPrecioPasaje() {
		return precioPasaje;
	}
	public boolean getTieneCompromiso() {
		return tieneCompromiso;
	}
	public void setMinutosEsperando(int minutosEsperando) {
		this.minutosEsperando = minutosEsperando;
	}
	
	public void setPrecioPasaje(int precioPasaje) {
		this.precioPasaje = precioPasaje;
	}
	public void setTieneCompromiso(boolean tieneCompromiso) {
		this.tieneCompromiso = tieneCompromiso;
	}
}
