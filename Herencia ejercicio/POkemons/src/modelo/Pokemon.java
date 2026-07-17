package modelo;

public class Pokemon {
	protected int vida;
	private int def;
	private int nivel;
	
	public Pokemon(int vida, int def,int nivel) {
		this.vida = vida;
		this.def = def;
		this.nivel = nivel;
	}
	
	public void atacar() {
		System.out.println("bu ataco");
	}
	public void evolucionar() {
		System.out.println("bu evolucioné ya");
	}
}
