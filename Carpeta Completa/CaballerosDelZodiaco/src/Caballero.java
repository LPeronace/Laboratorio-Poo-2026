public class Caballero {
	private String nombre;
	private int edadCaballero;
	private int maldadEncubierta;
	private Constelacion constelacion;
	
	public Caballero(String nombre, int edadCaballero, int maldadEncubierta, Constelacion constelacion) {
		this.nombre = nombre;
		this.edadCaballero = edadCaballero;
		this.maldadEncubierta = maldadEncubierta;
		this.constelacion = constelacion;
	}

	
	public boolean esPrecoz() {
		return edadCaballero < 12;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int getEdadCaballero() {
		return edadCaballero;
	}
	public int getMaldadEncubierta() {
		return maldadEncubierta;
	}
	public Constelacion getConstelacion() {
		return constelacion;
	}
	public boolean getBandaCeleste() {
		return constelacion.getBandaCeleste();
	}
	
	public boolean siEsCercanoAlSol() {
		return constelacion.cercanoAlSol();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdadCaballero(int edadCaballero) {
		this.edadCaballero = edadCaballero;
	}
	public void setMaldadEncubierta(int maldadEncubierta) {
		this.maldadEncubierta = maldadEncubierta;
	}
	public void setConstelacion(Constelacion constelacion) {
		this.constelacion = constelacion;
	}
	
	
	
	
}
