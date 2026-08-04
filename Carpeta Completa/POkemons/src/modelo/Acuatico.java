package modelo;

public class Acuatico extends Pokemon{

	
	public Acuatico(int vida, int def, int nivel) {
		super(vida, def, nivel);
	}
	
	public void nadar() {
		System.out.println("nado");
	}
	
	public void atacar() {
		System.out.println("bu ataco");
	}
	
}
