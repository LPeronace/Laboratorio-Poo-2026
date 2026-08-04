import java.util.ArrayList;

public class LigaAtenea {
	private ArrayList<Caballero> ligaAtenea= new ArrayList<>();
	
	public LigaAtenea(ArrayList<Caballero> ligaAtenea) {
		this.ligaAtenea = ligaAtenea;
	}
	
	public Caballero posibleHades() {
		Caballero caballeroConMenorMaldad = this.ligaAtenea.get(0);
		
		for(Caballero c: ligaAtenea) {
		
			if(c.getMaldadEncubierta() <= caballeroConMenorMaldad.getMaldadEncubierta()) {
				caballeroConMenorMaldad = c;
			}
		}
		return caballeroConMenorMaldad;
	}
	
	public ArrayList<Constelacion> constelacionesCercanasAlSol(){
		ArrayList<Constelacion> temporal = new ArrayList<Constelacion>();
		
		for(Caballero c:ligaAtenea) {
			if(c.siEsCercanoAlSol()) {
				temporal.add(c.getConstelacion());
			}
		}
		
		return temporal;
	}
	
	public ArrayList<Caballero> caballerosMasPoderos(){
		ArrayList<Caballero> dorados = new ArrayList<>();
		
		for(Caballero c: ligaAtenea) {
			if(c.esPrecoz() && c.getBandaCeleste()){
				dorados.add(c);
			}
		}
		return dorados;
	}
	
	public int cantidadPrecoces() {
		int contador = 0;
		for(Caballero c: ligaAtenea) {
			if(c.esPrecoz()) {
				contador++;
			}
		}
		return contador;
	}
	
	
	public float porcentajePrecoz() {
		return (cantidadPrecoces()/ligaAtenea.size())*100;
	}
	
}
