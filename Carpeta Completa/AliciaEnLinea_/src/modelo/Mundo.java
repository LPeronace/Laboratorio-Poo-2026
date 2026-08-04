   package modelo;
import java.util.ArrayList;

public class Mundo {
	private ArrayList<Persona> lasPersonas= new ArrayList<>();
	
	public Mundo() {
	}
	
	public boolean determinarNormal() {
		for(Persona p: lasPersonas) {
			if(p.esNormal()) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Persona> personajesLindos() {
		ArrayList<Persona> lasPersonasLindas = new ArrayList<>();
		
		for(Persona p: lasPersonas) {
			if(p.esLindo()) {
				lasPersonasLindas.add(p);
			}
		}
		return lasPersonasLindas;
	}
	
	public ArrayList<Persona> personajesNormales() {
		ArrayList<Persona> lasPersonasNormales = new ArrayList<>();
		
		for(Persona p: lasPersonas) {
			if(p.esNormal()) {
				lasPersonasNormales.add(p);
			}
		}
		return lasPersonasNormales;
	}
	
	
	public int cuantosMaravilla() {
		int contador = 0;
		
		for(Persona p: lasPersonas) {
			
			if(p.estaMundoMaravilla()) {
				contador++;
			}
		}
		return contador;
	}
	
	public Persona mayorLocura() {
		//Agarra el primer objeto del ArrayList
		
		Persona mayorLocura =this.lasPersonas.get(0);
		
		
		for(Persona p: lasPersonas) {
			//compara el array actual con el auxiliar 
			if(p.getLocura() >= mayorLocura.getLocura() ) {
				mayorLocura = p;
			}
		}
		return mayorLocura;
		
	}
	
	public int CuantosLindos() {
		int contador = 0;
		for(Persona p: lasPersonas) {
			if(p.esLindo()) {
				contador++;
			}
		}
		return contador;
	}
	
	public int CuantosNormales() {
		int contador = 0;
		for(Persona p: lasPersonas) {
			if(p.esNormal()) {
				contador++;
			}
		}
		return contador;
	}
	
	public boolean determinarMasLindosQueNormales() {
		int auxiliar = (personajesLindos()).size();
		return(auxiliar > CuantosNormales());
		
	}
	public ArrayList<Persona> getLasPersonas(){
		return lasPersonas;
	}
	public void setLasPersonas(ArrayList<Persona> lasPersonas) {
		this.lasPersonas = lasPersonas;
	}
	
}
