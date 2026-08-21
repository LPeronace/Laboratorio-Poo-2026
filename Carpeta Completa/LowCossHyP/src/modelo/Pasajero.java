package modelo;

public class Pasajero {
	private int precioPasaje;
	private boolean compromiso;
	private int minutosEsperando;
	private boolean esVip;
	
	public Pasajero(int precioPasaje, boolean compromiso, int minutosEsperando, boolean esVip) {
		this.precioPasaje = precioPasaje;
		this.compromiso = compromiso;
		this.minutosEsperando = minutosEsperando;
		this.esVip = esVip;
	}
	public boolean pasajeroVip() {
		return esVip;
	}
	public int getPrecioPasaje() {
		return precioPasaje;
	}

	public void setPrecioPasaje(int precioPasaje) {
		this.precioPasaje = precioPasaje;
	}

	public boolean getCompromiso() {
		return compromiso;
	}

	public void setCompromiso(boolean compromiso) {
		this.compromiso = compromiso;
	}

	public int getMinutosEsperando() {
		return minutosEsperando;
	}

	public void setMinutosEsperando(int minutosEsperando) {
		this.minutosEsperando = minutosEsperando;
	}

	public boolean tieneCompromiso() {
		return compromiso;
	}
	
	public boolean pasajeroMasDe60() {
		return minutosEsperando > 60;
	}
	
}
