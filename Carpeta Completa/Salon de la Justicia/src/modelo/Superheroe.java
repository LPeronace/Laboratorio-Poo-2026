package modelo;
import java.util.ArrayList;
public class Superheroe {
	private ArrayList<Asistente> asistentes = new ArrayList<>();
	private String nombre;
	private int presupuestoMensual;
	
	public float calculoFinalAsistentes() {
		return presupuestoMensual - sumatoriaSueldoTotalAsistentes();
	}
	
	public float plataParaVaquita() {
		if(llegaAFinDeMes()) {
			return calculoFinalAsistentes();
		}
		return 0;
	}
	
	public boolean llegaAFinDeMes() {
		if(calculoFinalAsistentes() >= 0) {
			return true;
		}
		return false;
	}
	public float sumatoriaSueldoTotalAsistentes(){
		float total = 0;
		
		for(Asistente a: asistentes) {
			total += a.getSalario();
		}
		
		return total;
	}
	
	public int contadorAsistentesMayorA60000PorHeroe() {
		int contador = 0;
		for(Asistente a: asistentes) {
			if(a.sueldoMayorA60000()) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public boolean masDe3Asistentes() {
		return asistentes.size() > 3;
	}
	public ArrayList<Asistente> getAsistentes() {
		return asistentes;
	}
	public void setAsistentes(ArrayList<Asistente> asistentes) {
		this.asistentes = asistentes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPresupuestoMensual() {
		return presupuestoMensual;
	}
	public void setPresupuestoMensual(int presupuestoMensual) {
		this.presupuestoMensual = presupuestoMensual;
	}
	
	
	
}
