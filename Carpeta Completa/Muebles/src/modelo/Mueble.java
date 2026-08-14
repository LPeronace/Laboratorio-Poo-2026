package modelo;

import Utilidades.Calidad;
import Utilidades.Estado;
import Utilidades.Posicion;
import Utilidades.Zona;

public abstract class Mueble {
	protected String nombre;
	protected Posicion posicion;
	protected int cantidadPersonasActual;
	protected String material;
	protected Calidad calidad;
	protected Estado estado;
	protected Zona zona;
	protected int gradoSuciedad;
	
	public Mueble(String nombre, Posicion posicion, int cantidadPersonasActual, int gradoSuciedad,
			String material, Calidad calidad, Estado estado, Zona zona) {
		this.nombre = nombre;
		this.posicion = posicion;
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
	
	public void mover(Posicion posicionNueva) {
		posicion = posicionNueva;
		
		System.out.println("Me movieron a:" + posicion.getPosicionX() + " " + posicion.getPosicionY() + " " + posicion.getPosicionZ());
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
	public Posicion getPosicionX() {
		return posicion;
	}
	public void setPosicionX(Posicion posicion) {
		this.posicion = posicion;
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
