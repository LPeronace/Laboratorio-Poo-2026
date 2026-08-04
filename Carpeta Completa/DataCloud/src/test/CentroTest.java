package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.Disco;
import modelo.Centro;
import modelo.Nodo;
import java.util.ArrayList;
class CentroTest {

	@Test
	void consumoTotalTodosLosNodosTest() {
		ArrayList<Nodo> nodos = new ArrayList<>();
		Disco disco = new Disco(500);  //875
		Nodo nodo = new Nodo(250,disco);
		Disco disco2 = new Disco(10); // 25
		Nodo nodo2 = new Nodo(10,disco2);
		
		nodos.add(nodo);
		nodos.add(nodo2);
		
		Centro centro = new Centro(nodos);
		
		
		assertEquals(900, centro.consumoTotalTodosLosNodos());
	}
	@Test
	void nodosMasRapidoTest() {
		Disco disco = new Disco(800);
		Disco disco2 = new Disco(1);
		Disco disco3 = new Disco(1203121);
		String s = "hola";
		
		s.equals(s);
		
		Nodo nodo = new Nodo(disco);
		Nodo nodo2 = new Nodo(disco2);
		Nodo nodo3 = new Nodo(disco3);
		
		ArrayList<Nodo> nodos = new ArrayList<>();
		nodos.add(nodo);
		nodos.add(nodo2);
		nodos.add(nodo3);
		
		Centro centro = new Centro(nodos);
		
		assertEquals(nodo3, centro.nodoMasRapido());
		
	}
	@Test
	void nodosCriticosTest() {
		
		Disco disco = new Disco(20,7);
		Nodo nodo = new Nodo(disco);
		
		
		Disco disco2 = new Disco(70,1);
		Nodo nodo2 = new Nodo(disco2);
		
		
		
		ArrayList<Nodo> nodos = new ArrayList<>();
		nodos.add(nodo2);
		nodos.add(nodo);

		Centro centro = new Centro(nodos);
		
		if(nodos == centro.getNodos()) {
			System.out.println("igual");
		}
		
		ArrayList<Nodo> nodosCriticos = new ArrayList<>();
		nodosCriticos.add(nodo);

		System.out.println(nodosCriticos);
		System.out.println(centro.nodosCriticos());
		
		
		
		assertEquals(nodosCriticos,centro.nodosCriticos());
		
		
	}
	

}
