public class Persona {
	
	public static void comer(int capacidadEstomago, int cantidadIngerida) {
		if(estaLleno(cantidadIngerida,capacidadEstomago)) {
			cantidadIngerida +=40;
			if(cantidadIngerida > capacidadEstomago) {
				cantidadIngerida = capacidadEstomago;
			}
		}
	}
	
	public static void crecer(int capacidadEstomago) {
		capacidadEstomago += 10;
	}
	
	public static void digerir(int cantidadIngerida) {
		cantidadIngerida = 0;
	}
	
	public static void aprender(int capacidadEstomago, int cantidadIngerida) {
		if(estaLleno(cantidadIngerida,capacidadEstomago)) {
			System.out.println("Aprendiste!");
		}
	}
	
	public static boolean estaLleno(int cantidadIngerida, int capacidadEstomago) {
		if(cantidadIngerida>= (capacidadEstomago*0.9)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int capacidadEstomago = 50;
		int cantidadIngerida = 0;
		
		comer(capacidadEstomago, cantidadIngerida);
		crecer(capacidadEstomago);
		digerir(cantidadIngerida);
		aprender(capacidadEstomago,cantidadIngerida);
		estaLleno(cantidadIngerida,capacidadEstomago);
		
	}

}
