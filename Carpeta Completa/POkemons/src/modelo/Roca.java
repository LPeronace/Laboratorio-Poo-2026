package modelo;

public class Roca extends Pokemon {
	
	
	public Roca(int vida, int def, int nivel) {
		super(vida, def, nivel);
	}
	
	public void excavar() {
		System.out.println("estoy excavando");
	}
	
	public void atacar() {
		System.out.println("bu ataco");
	}
	public void evolucionar() {
		System.out.println("bu evolucione");
	}
}
