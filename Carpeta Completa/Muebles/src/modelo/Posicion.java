package modelo;

public class Posicion {
	protected int posicionX;
	protected int posicionY;
	protected int posicionZ;
	public Posicion(int posicionX, int posicionY, int posicionZ) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.posicionZ = posicionZ;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public int getPosicionZ() {
		return posicionZ;
	}
	public void setPosicionZ(int posicionZ) {
		this.posicionZ = posicionZ;
	}
}
