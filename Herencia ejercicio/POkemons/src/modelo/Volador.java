package modelo;

public class Volador extends Pokemon{ 
	public Volador(int vida, int def, int nivel) {
		super(vida, def, nivel);
		super.vida = 3;
		this.vida = 0;
	}
	public void sysout() {
		// TODO Auto-generated method stub

	}
	
	public void volar() {
		System.out.println("bu vuelo");
	}
	
	public void atacar() {
		System.out.println("bu ataco");
	}
	public void evolucionar() {
		System.out.println("bu evolucione");
	}
}
