package modelo;
import java.util.Random;
public abstract class Personaje {
	private int vida;
	private int energia;
	private int dañoB;
	private Random prob = new Random();
	
	public Personaje(int vida, int energia, int dañoB) {
		this.vida = vida;
		this.energia = energia;
		this.dañoB = dañoB;
	}
	
	public int generarRandom() {
		return prob
	}
	
	public void cargarEnergia() {
		
	}
	
}
