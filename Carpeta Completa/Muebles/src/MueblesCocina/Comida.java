package MueblesCocina;

import Utilidades.EstadoComida;

public class Comida {
	
	private EstadoComida estado;
	private String nombre;
	
	public Comida(EstadoComida estado, String nombre) {
		this.estado = estado;
		this.nombre = nombre;
	}

	public EstadoComida getEstado() {
		return estado;
	}

	public void setEstado(EstadoComida estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
