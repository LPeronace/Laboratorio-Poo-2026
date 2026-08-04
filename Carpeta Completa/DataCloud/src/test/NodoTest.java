package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Disco;
import modelo.Nodo;
import modelo.Disco;
class NodoTest {

	@Test
	void esNodoCriticoTest_true() {
		Disco disco = new Disco(20,7);
		Nodo nodo = new Nodo(disco);
		
		
		assertEquals(true,nodo.esNodoCritico());
	}
	
	@Test
	void esNodoCriticoTest_false() {
		Disco disco = new Disco(70,1);
		Nodo nodo = new Nodo(disco);
		
		
		assertEquals(false,nodo.esNodoCritico());
	}
	
	@Test
	void consumoElectricoNodoTest() {
		Disco disco = new Disco(500);
		Nodo nodo = new Nodo(250,disco);
		
		assertEquals(875,nodo.consumoElectricoNodo());
		
	}
}
