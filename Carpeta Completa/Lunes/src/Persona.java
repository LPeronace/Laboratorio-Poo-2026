public class Persona {
	private int minutoDormido;
	private int probabilidadLluvia;
	
	public Persona(int minutoDormido, int probabilidadLluvia) {
		this.minutoDormido = minutoDormido;
		this.probabilidadLluvia = probabilidadLluvia;
	}
	
	public boolean sigoDurmiendo() {
		return probabilidadLluvia>=90;
	}	
	
	public void aplazarAlarma(int minutoMasDurmiendo) {
		minutoDormido += minutoMasDurmiendo;
	}
	
	public boolean masLunesImposible() {
		return (sigoDurmiendo() && minutoDormido < 120);
	}
	
	public int getMinutoDormido() {
		return minutoDormido;
	}
}
