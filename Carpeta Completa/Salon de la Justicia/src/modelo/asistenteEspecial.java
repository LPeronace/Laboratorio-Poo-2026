package modelo;

public class asistenteEspecial extends Asistente{

	public asistenteEspecial(String nombre, float salario) {
		super(nombre,salario);		
	}
	public float sueldo() {
		return getSalario()*1.2f;
	}
}
