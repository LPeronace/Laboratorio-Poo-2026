package modelo;

public class Vuelo {
	private int capacidadPasajeros;
	private int costoCombustible;
	private Persona[] vueloConPasajeros = new Persona[capacidadPasajeros];
	
	
	public Vuelo(int capacidadPasajeros, int costoCombustible) {
		this.capacidadPasajeros = capacidadPasajeros;
		this.costoCombustible = costoCombustible;
	}
	public Vuelo(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	public Vuelo(Persona[] vueloConPasajeros, int capacidadPasajeros) {
		this.vueloConPasajeros = vueloConPasajeros;
		this.capacidadPasajeros = capacidadPasajeros;
	}
	public Vuelo() {
		
	}
	
	public boolean estaDemorado() {
		return masDe60Minutos() && tieneMenosDe100();
	}
	
	public boolean masDe60Minutos() {
		boolean encontre = false;
		int i = 0;
		do {
			Persona p = vueloConPasajeros[i];
			if(p.mayorASesentaMinutos()) {
				encontre = true;
			}
			i++;
			
		}while(!encontre && i<capacidadPasajeros);
		return encontre;
	}
	
	public boolean esLowCost() {
		return capacidadMenorACien() && vueloConPersonaMasSesentaMinutos();
	}
	
	public int conseguirPersonaMayorTiempo() {
		return mayorTiempoEsperadoPersona().getMinutosEsperando();
	}
	
	public boolean tieneMenosDe100() {
		return (capacidadPasajeros <100);
	}
	
	public Persona mayorTiempoEsperadoPersona() {
		Persona furioso = vueloConPasajeros[0];
		for(Persona p:vueloConPasajeros) {
			if(p.getMinutosEsperando() >= furioso.getMinutosEsperando()) {
				furioso = p;
			}
		}
		return furioso; 
	}
	
	public boolean vueloConPersonaMasSesentaMinutos() {
		for(Persona p:vueloConPasajeros) {
			if(p.mayorASesentaMinutos()) {
				return true;
			}
		}
		return false;
	}
	
	public int sumatoriaPasajesVuelo() {
		int total = 0;
		for(Persona p:vueloConPasajeros) {
			total += p.getPrecioPasaje();
		}
		
		return total;
	}
	
	public float gananciaTotal() {
		float total = sumatoriaPasajesVuelo();
		
		return (total *= 1.21) - costoCombustible;
	}
	
	public boolean capacidadMenorACien() {
		return capacidadPasajeros < 100;
	}
	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}
	public int getCostoCombustible() {
		return costoCombustible;
	}
	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	public void setCostoCombustible(int costoCombustible) {
		this.costoCombustible = costoCombustible;
	}
	public Persona[] getVuelosConPasajeros() {
		return vueloConPasajeros;
	}
	public void setVuelosConPasajeros(Persona[] vueloConPasajeros) {
		this.vueloConPasajeros = vueloConPasajeros;
	}
	
	
}
