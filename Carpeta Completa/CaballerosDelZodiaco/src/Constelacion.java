public class Constelacion {
	private int distanciaAlSol;
	private boolean bandaCeleste;
	
	public Constelacion(int distanciaAlSol, boolean bandaCeleste) {
		this.distanciaAlSol = distanciaAlSol;
		this.bandaCeleste = bandaCeleste;
	}
	
	public boolean cercanoAlSol() {
		return(distanciaAlSol < 1000000000);
	}
	
	public int getDistanciaAlSol() {
		return distanciaAlSol;                  
	}
	public boolean getBandaCeleste() {
		return bandaCeleste;
	}
	public void setDistanciaAlSol(int distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}
	public void setBandaCeleste(boolean bandaCeleste) {
		this.bandaCeleste = bandaCeleste;
	}
}
