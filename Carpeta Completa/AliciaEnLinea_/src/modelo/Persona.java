package modelo;
public class Persona {
	private int locura;
	private int secreto;
	private int ubicacion;
	private static final int maximoLocura = 100;
	
	public Persona(int locura, int secreto, int ubicacion) {
		this.locura = locura;
		this.secreto = secreto;
		this.ubicacion = ubicacion;
	}
	public Persona(int ubicacion) {
		this.ubicacion = ubicacion;
		}
	
	public Persona() {
		}
	
	public Persona(int locura, int ubicacion) {
		this.locura = locura;
		this.ubicacion = ubicacion;
	}
	
	
	public void embellecer(int locuraVariable) {
		if(((locura + locuraVariable) <= maximoLocura)&&((secreto - 10) > 0)) {
			// No puede tener mas del maximo de locura ni puede tener secretos negativos
			locura += locuraVariable;
			secreto -= 10;
		}
	}
	
	public boolean estaMundoMaravilla() {
		return ubicacion<0;
		
	}
	
	public boolean esLindo() {
		return (locura> maximoLocura*0.75 && estaMundoMaravilla());
	}
	
	public boolean esNormal() {
		return ((locura<10) && secreto > 500);
	}
	
	public int getLocura() {
		return locura;
	}
	
	public int getSecreto() {
		return secreto;
	}
	
	public int getUbicacion() {
		return ubicacion;
	}
	
	public final int getMaximoLocura() {
		return maximoLocura;
	}
	
	public void setLocura(int locura) {
		this.locura = locura;
	}
	
	public void setSecreto(int secreto) {
		this.secreto = secreto;
	}
	
	public void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion;
	}
}
