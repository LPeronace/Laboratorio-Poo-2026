package modelo;
public class Equipamiento {
	private int defensa;
	private int rareza; //no tiene que ser menor a 1 y mayor a 10
	private int precioMercado;
	private int durabilidad;
	
	public Equipamiento(int defensa, int rareza, int precioMercado, int durabilidad) {
		this.defensa = defensa;
		this.rareza = ajustarRareza(rareza);
		this.precioMercado = precioMercado;
		this.durabilidad = ajustarDurabilidad(durabilidad);
	}
	
	public Equipamiento(int rareza, int precioMercado) {
		this.rareza = ajustarRareza(rareza);
		this.precioMercado = precioMercado;
	}
	public Equipamiento(int rareza) {
		this.rareza = ajustarRareza(rareza);
	}
	public Equipamiento() {
		
	}
	
	
	public int ajustarDurabilidad(int durabilidad) {
		if(durabilidad < 0) {
			durabilidad = 0;
		}
		return durabilidad;
	}
	
	public int ajustarRareza(int rareza) {
		if(rareza > 10) {
			rareza = 10;
		}
		else if(rareza < 0) {
			rareza = 0;
		}
		return rareza;
	}
	
	public boolean esLegendario() {
		return (rareza == 10 && precioMercado > 5000000);
	}
	public boolean esBajaCalidad() {
		return (rareza < 3 && durabilidad == 0);
		
	}
	public boolean esOfensivo() {
		return defensa < 50;
	}
	public boolean esDefensivo() {
		return defensa > 1000;
	}
	public boolean esEquipamientoTanque() {
		return (esDefensivo() && esLegendario());
	}
	
	public int getDefensa() {
		return defensa;
	}
	public int getRareza() {
		return rareza;
	}
	public int getPrecioMercado() {
		return precioMercado;
	}
	public int getDurabilidad() {
		return durabilidad;
	}
	
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public void setRareza(int rareza) {
		this.rareza = ajustarRareza(rareza);
	}
	public void setPrecioMercado(int precioMercado) {
		this.precioMercado = precioMercado;
	}
	public void setDurabilidad(int durabilidad) {
		this.durabilidad = ajustarDurabilidad(durabilidad);
	}
	
	
}
