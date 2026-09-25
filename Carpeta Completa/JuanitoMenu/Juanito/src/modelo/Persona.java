package modelo;
public class Persona {
	int cantidadIngerida = 0;
	int capacidadEstomago = 400;
	public void comer(int cantidadIngerida) {
		if(!estaLleno()){
			this.cantidadIngerida += cantidadIngerida;
			if(this.cantidadIngerida > capacidadEstomago) {
				this.cantidadIngerida = capacidadEstomago;
			}
		}
	}
	
	public void crecer() {
		capacidadEstomago += 10;
	}
	
	public void digerir() {
		cantidadIngerida = 0;
	}
	
	public void aprender() {
		if(estaLleno()) {
			System.out.println("Aprendiste!");
		}
	}
	
	public boolean estaLleno() {
		if(cantidadIngerida>= (capacidadEstomago*0.9)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getCapacidadEstomago() {
		return capacidadEstomago;
	}
	public int getCantidadIngerida() {
		return cantidadIngerida;
	}
	public static void main(String[] args) {
		
		/*
		int capacidadEstomago = 50;
		int cantidadIngerida = 0;
		
		comer(capacidadEstomago, cantidadIngerida);
		crecer(capacidadEstomago);
		digerir(cantidadIngerida);
		aprender(capacidadEstomago,cantidadIngerida);
		estaLleno(cantidadIngerida,capacidadEstomago);
		*/
	}

}
