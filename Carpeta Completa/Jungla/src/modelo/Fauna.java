package modelo;

public class Fauna {
	private int cantEspecies;
	private float valorPromedio;
	
	public Fauna(int cantEspecies, float valorPromedio) {
		this.cantEspecies = cantEspecies;
		this.valorPromedio = valorPromedio;
	}
	public Fauna(float valorPromedio) {
		this.valorPromedio = valorPromedio;
	}
	public boolean enPeligro() {
		return((cantEspecies < 2) && (valorPromedio > 3000000));
	}

	public int getCantEspecies() {
		return cantEspecies;
	}

	public void setCantEspecies(int cantEspecies) {
		this.cantEspecies = cantEspecies;
	}

	public float getValorPromedio() {
		return valorPromedio;
	}

	public void setValorPromedio(float valorPromedio) {
		this.valorPromedio = valorPromedio;
	}
}
