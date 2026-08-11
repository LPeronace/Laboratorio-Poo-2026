package modelo;

public class Mueble {
	private String nombre;
	private int posicionX;
	private int posicionY;
	private int posicionZ;
	private int cantidadPersonasActual;
	private String material;
	private Calidad calidad;
	private Estado estado;
	private Zona zona;
	private int gradoSuciedad;
	
	public Mueble(String nombre, int posicionX, int posicionY, int posicionZ, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona) {
		this.nombre = nombre;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.posicionZ = posicionZ;
		this.cantidadPersonasActual = cantidadPersonasActual;
		this.gradoSuciedad = gradoSuciedad;
		this.material = material;
		this.calidad = calidad;
		this.estado = estado;
		this.zona = zona;
	}
	
	public void usar() {
		gradoSuciedad += 5;
		System.out.println("Me estan usando");
	}
	
	public void mover(int posicionXNueva, int posicionYNueva, int posicionZNueva) {
		posicionX = posicionXNueva;
		posicionY = posicionYNueva;
		posicionZ = posicionZNueva;
		
		System.out.println("Me movieron a:" + posicionX + " " + posicionY + " " + posicionZ);
	}
	public void ensuciarse() {
		gradoSuciedad += 30;
	}
	
	public void limpiarse() {
		gradoSuciedad -= 20;
	}
	
	public void romperse() {
		if(estado == Estado.SANO) {
			estado = Estado.ROTO;
		}
		else {
			System.out.println("Ya estoy roto");
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public int getPosicionZ() {
		return posicionZ;
	}
	public void setPosicionZ(int posicionZ) {
		this.posicionZ = posicionZ;
	}
	public int getCapacidadPersonasActual() {
		return cantidadPersonasActual;
	}
	public void setCapacidadPersonasActual(int capacidadPersonasActual) {
		this.cantidadPersonasActual = capacidadPersonasActual;
	}
	public int getGradoSuciedad() {
		return gradoSuciedad;
	}
	public void setGradoSuciedad(int gradoSuciedad) {
		this.gradoSuciedad = gradoSuciedad;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Calidad getCalidad() {
		return calidad;
	}
	public void setCalidad(Calidad calidad) {
		this.calidad = calidad;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	
}
