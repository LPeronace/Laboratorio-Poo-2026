package modelo;

public class Jugador {
	private int hambre;
	private int felicidad;
	private int energia;
	private int higiene;
	
	public Jugador(int hambre, int felicidad, int energia, int higiene) {
		this.hambre = hambre;
		this.felicidad = felicidad;
		this.energia = energia;
		this.higiene = higiene;
	}
	
	private int verificarRangos(int valor) {
		
		if(valor > 100 ) {
			valor = 100;
		}
		if(valor < 0) {
			valor = 0;
		}
		return valor;
	}
	
	
	public void cambiarFelicidad(int felicidadCambiada) {
		felicidad -= verificarRangos(felicidadCambiada);
	}
	public void cambiarEnergia(int energiaCambiada) {
		energia -= verificarRangos(energiaCambiada);
	}
	public void cambiarHambre(int hambreCambiada) {
		hambre -= verificarRangos(hambreCambiada);
	}
	public void cambiarHigiene(int higieneCambiada) {
		higiene -= verificarRangos(higieneCambiada);
	}
}
