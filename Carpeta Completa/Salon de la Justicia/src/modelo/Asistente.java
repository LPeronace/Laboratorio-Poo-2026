package modelo;

public class Asistente {
	private String nombre;
	private float salario;
	
	public Asistente(String nombre, float salario) {
		this.nombre = nombre;
		this.salario = salario;
		
	}
	
	public float sueldo() {
		return salario;
	}
	
	public boolean sueldoMayorA60000() {
		return salario>60000;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
}
