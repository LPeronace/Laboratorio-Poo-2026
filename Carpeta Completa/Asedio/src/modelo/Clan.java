package modelo;
import java.util.ArrayList;

public class Clan {
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	
	public Clan(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public ArrayList<Jugador> losVeteranos(){
		ArrayList<Jugador> losVeteranos = new ArrayList<>();
		
		for(Jugador j: jugadores) {
			if(j.esVeterano()) {
				losVeteranos.add(j);
			}
		
		}
		
		return losVeteranos;
	}
	public ArrayList<Jugador> muchaPlata(){
		ArrayList<Jugador> payToWin = new ArrayList<>();
		
		for(Jugador j: jugadores) {
			if(j.tieneMuchaPlata()) {
				payToWin.add(j);
			}
		}
		
		return payToWin;
	}
	public boolean siHayGlassCanon() {
		boolean hay = false;
		int i = 0;
		do {
			if(jugadores.get(i).esGlassCanon()) {
				hay = true;
			}
			i++;
			
		}while(!hay && i < jugadores.size());
		
		return hay;
		
	}
	public int cantidadDeNovatos() {
		int cantidadNovatos = 0;
		
		for(Jugador j: jugadores) {
			if(j.esNovato()) {
				cantidadNovatos++;
			}
		}
		return cantidadNovatos;
	}
	
	public ArrayList<Jugador> losAsesinos(){
		ArrayList<Jugador> losAsesinos = new ArrayList<>();
		
		for(Jugador j: jugadores) {
			if(j.esAsesino()) {
				losAsesinos.add(j);
			}
		}
		
		return losAsesinos;
	}
	
	public ArrayList<Jugador> losTanques(){
		ArrayList<Jugador> losTanques = new ArrayList<>();
		
		for(Jugador j: jugadores) {
			if(j.jugadorTanque()) {
				losTanques.add(j);
			}
		}
		
		return losTanques;
	}
	
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public ArrayList<Jugador> getJugadores(){
		return jugadores;
	}
}
