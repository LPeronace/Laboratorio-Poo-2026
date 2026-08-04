public class Persona {
	private String nombre;
	private int tareaPendiente;
	private static final int maximoTarea = 100;
	
	//////
	//Sobrecarga, mas de 1 constructor 
	public Persona() {
		
	}
	
	public Persona(int tareaPendiente) {
		this.tareaPendiente = tareaPendiente;
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, int tareaPendiente) {
		this.nombre = nombre;
		this.tareaPendiente = tareaPendiente;
	}
	
	/////
	
	//Sobrecarga de cumplidora
	public boolean cumplidora(int cantidadTareaPendiente) {
		return cantidadTareaPendiente == 0;
	}
	
	public boolean cumplidora() {
		return tareaPendiente == 0;
	}
	
	
	//
	public boolean procrastinador() {
		if(tareaPendiente >= maximoTarea*0.8) {
			return true;
		}
		else {
			return false;
		}
	}
	public void agendarTarea(int entradaDeTarea) {
		if( (tareaPendiente + entradaDeTarea) <= maximoTarea){
			tareaPendiente += entradaDeTarea;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getTareaPendiente() {
		return tareaPendiente;
	}
	
	public final int getMaximoTarea() {
		return maximoTarea;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTareaPendiente(int tareaPendiente) {
		this.tareaPendiente = tareaPendiente;
	}
	
	//No se puede usar el setMaximoTareas, ya que es constante y no tiene sentido
	
}
