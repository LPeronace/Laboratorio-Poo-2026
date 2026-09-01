package modelo;
//Lautaro Peronace 5°3
public abstract class Satelite {
	private int x;
	private int y;
	private int z;
	private Propulsor propulsor;
	private Paneles panel;
	private int antena;
	private Long capacidadCarga;
	private int masa;
	private float cargaActual;
	private Identificador identificador;
	
	public Satelite(int x, int y, int z, Propulsor propulsor,Paneles panel, int antena, long capacidadCarga, float cargaActual, Identificador identificador) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.propulsor = propulsor;
		this.panel = panel;
		this.antena = antena;
		this.capacidadCarga = capacidadCarga;
		this.masa = calcularMasa();
		this.cargaActual = cargaActual;
		this.identificador = identificador;
	}
	
	//Hago la cuenta para calcular la masa y le hago retorno al constructor asi se actualiza el valor cuando se crea
	public int calcularMasa() {
		return 500 + (20*antena) + 600;
	}
	//Dejo abstracto para que se pueda modificar en las clases hijas
	public abstract void cargarCelula();
	
	
	public int conseguirDistancia() {
		return z + 6378;
	}
	//Hago delegacion de si hiberna o no, para que sea mas facil despues
	public boolean estaHibernando() {
		return (cargaActual < capacidadCarga * 0.1);
	}
	public int getZ() {
		return z;
	}
	//Lautaro Peronace 5°3
	public Propulsor getPropulsor() {
		return propulsor;
	}
	public Paneles getPanel() {
		return panel;
	}

	public void setPanel(Paneles panel) {
		this.panel = panel;
	}

	public int getAntena() {
		return antena;
	}

	public void setAntena(int antena) {
		this.antena = antena;
	}

	public long getCapacidadCarga() {
		return capacidadCarga;
	}
	//Lautaro Peronace 5°3
	public void setCapacidadCarga(long capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getMasa() {
		return masa;
	}

	public void setMasa(int masa) {
		this.masa = masa;
	}

	public float getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(float cargaActual) {
		this.cargaActual = cargaActual;
	}

	public Identificador getIdentificador() {
		return identificador;
	}
	//Lautaro Peronace 5°3
	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public void setCapacidadCarga(Long capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	
	
}
