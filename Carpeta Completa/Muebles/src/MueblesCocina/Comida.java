package MueblesCocina;

import Utilidades.EstadoComida;

public class Comida {
	private EstadoComida estadoComida;
	private String nombre;
	
	public Comida(EstadoComida estadoComida, String nombre) {
		this.estadoComida = estadoComida;
		this.nombre = nombre;
	}
	
	
	
	
	public EstadoComida getEstadoComida() {
		return estadoComida;
	}

	public void setEstadoComida(EstadoComida estadoComida) {
		this.estadoComida = estadoComida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
