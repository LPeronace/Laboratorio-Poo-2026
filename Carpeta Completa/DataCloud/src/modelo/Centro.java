package modelo;

import java.util.ArrayList;

public class Centro {
	private ArrayList<Nodo> nodos = new ArrayList<>();
	
	public Centro(ArrayList<Nodo> nodos) {
		this.nodos = nodos;
		//System.out.println(nodos);
	}
	
	
	//Aca recorro al ArrayList y le voy sumando a una variable float el consumo electrico de cada nodo 
	public float consumoTotalTodosLosNodos() {
		float total = 0f;
		
		for(Nodo n : nodos) {
			total += n.consumoElectricoNodo();
		}
		
		return total;
	}
	
	
	//Aca voy buscando el nodo mas rapido
	public Nodo nodoMasRapido() {
		//Agarro el primer elemento del arraylist asi puedo ir comparando
		Nodo nodoMasVeloz = nodos.get(0);
		
		for(Nodo n: nodos) {//Recorro el arraylist con un foreach para ir buscandolo
			if(n.conseguirVelocidadDisco() > nodoMasVeloz.conseguirVelocidadDisco()) {
				//Aca veo si el nodo que esta actual en el foreach 
				//tiene mayor velocidad que el nodo mas veloz, y si lo es, lo reemplaza y sigue la busqueda hasta terminar el arraylist
				nodoMasVeloz = n;
			}
		}
		
		
		return nodoMasVeloz;
	}
	
	//Aca lo que hago es buscar mediante un metodo que me da un valor booleano si el nodo en si es critico
	//y si lo es lo guarda en el arrayList
	
	public ArrayList<Nodo> nodosCriticos(){
		ArrayList<Nodo> nodosCriticos = new ArrayList<>();
		
		
		if(nodos == nodosCriticos) {
			System.out.println("igual2");
		}
			
		for(Nodo n: nodos) {
			if(n.esNodoCritico()) {
				nodosCriticos.add(n);
			}
		}
		
		
		if(nodos == nodosCriticos) {
			System.out.println("igual22");
		}
			
		return nodosCriticos;
	}

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}

	public void setNodos(ArrayList<Nodo> nodos) {
		this.nodos = nodos;
	}
	
	
}
