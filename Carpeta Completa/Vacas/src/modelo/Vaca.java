package modelo;

public class Vaca {
	private int capacidadIntrinseca;
	private Raza raza;
	
	
	public Vaca(int capacidadIntrinseca, Raza raza) {
		this.capacidadIntrinseca = capacidadIntrinseca;
		this.raza = raza;
	}
	
	public int produccionLechePorVaca() {
		return capacidadIntrinseca * raza.multiplicador;
	}
	public void mugir() {
		System.out.println("mu");
	}
	
}
