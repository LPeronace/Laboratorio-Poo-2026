package modelo;

public class VueloPrivado extends Vuelo {
	boolean tieneVip;
	
	
	public VueloPrivado(int consumoCombustible, int capacidadPasajeros, boolean tieneVip) {
		super(consumoCombustible, 10);
		this.tieneVip = tieneVip;		
	}
	@Override
	public float sumaTotal() {
		if(tienePasajeroVip()) {
			return sumaPasajes();
		}
		else {
			return (sumaPasajes() * 1.21f)- getConsumoCombustible(); 
		}
	}
	
	public boolean tienePasajeroVip() {
		boolean encontre = false;
		
		for(Pasajero p: getPasajeros()) {
			if(p.pasajeroVip()) {
				encontre = true;
			}
		}
		
		return encontre;
	}
	
}
