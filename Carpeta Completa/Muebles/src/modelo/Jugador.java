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
	
	public void mostrarTodo() {
		System.out.println("Nivel de felicidad:"+felicidad+"/100");
		System.out.println("Nivel de energia:"+energia+"/100");
		System.out.println("Nivel de hambre:"+hambre+"/100");
		System.out.println("Nivel de higiene:"+higiene+"/100");
	}
	
	public void cambiarMenosFelicidad(int felicidadCambiada) {
		felicidad -= verificarRangos(felicidadCambiada);
	}
	public void cambiarMenosEnergia(int energiaCambiada) {
		energia -= verificarRangos(energiaCambiada);
	}
	public void cambiarMenosHambre(int hambreCambiada) {
		hambre -= verificarRangos(hambreCambiada);
	}
	public void cambiarMenosHigiene(int higieneCambiada) {
		higiene -= verificarRangos(higieneCambiada);
	}
	public void cambiarMasFelicidad(int felicidadCambiada) {
		felicidad += verificarRangos(felicidadCambiada);
	}
	public void cambiarMasEnergia(int energiaCambiada) {
		energia += verificarRangos(energiaCambiada);
	}
	public void cambiarMasHambre(int hambreCambiada) {
		hambre += verificarRangos(hambreCambiada);
	}
	public void cambiarMasHigiene(int higieneCambiada) {
		higiene += verificarRangos(higieneCambiada);
	}
	
	public int getFelicidad() {
		return felicidad;
	}
	public int getEnergia() {
		return energia;
	}
	public int getHambre() {
		return hambre;
	}
	public int getHigiene() {
		return higiene;
	}
	
	
	
}
