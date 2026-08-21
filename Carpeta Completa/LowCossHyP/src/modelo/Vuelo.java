package modelo;

public class Vuelo {
	private int consumoCombustible;
	private int capacidadPasajeros;
	private Pasajero[] pasajeros;
	
	public Vuelo(int consumoCombustible, int capacidadPasajeros) {
		this.consumoCombustible = consumoCombustible;
		this.capacidadPasajeros = capacidadPasajeros;
		pasajeros = new Pasajero[capacidadPasajeros];
	}
	
	public int sumaPasajes() {
		int sumatoria = 0;
		
		for(Pasajero p: pasajeros) {
			sumatoria += p.getPrecioPasaje();
		}
		
		return sumatoria;
	}
	
	public float sumaTotal() {
		return (sumaPasajes() * 1.21f)- consumoCombustible;
	}
	public boolean vueloMayor60() {
		boolean encontre = false;
		
		for(Pasajero p: pasajeros) {
			if(p.pasajeroMasDe60()) {
				encontre = true;
			}
		}
		
		return encontre;
	}
	
	public boolean esLowCost() {
		return ((capacidadPasajeros < 100) && (vueloMayor60()));
	}
	
	public Pasajero masFuriosoDelVuelo() {
		Pasajero pasajeroFurioso = pasajeros[0];
		
		for(Pasajero p: pasajeros) {
			if(p.tieneCompromiso() && p.getMinutosEsperando() > pasajeroFurioso.getMinutosEsperando()) {
				pasajeroFurioso = p;
			}
		}
		
		return pasajeroFurioso;
	}
	
	
	public int getConsumoCombustible() {
		return consumoCombustible;
	}

	public void setConsumoCombustible(int consumoCombustible) {
		this.consumoCombustible = consumoCombustible;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public Pasajero[] getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Pasajero[] pasajeros) {
		this.pasajeros = pasajeros;
	}
	
}	
