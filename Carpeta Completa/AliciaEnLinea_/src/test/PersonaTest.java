package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Persona;

class PersonaTest {

	@Test
	void estaEnMaravillaTest_true() {
		Persona p1 = new Persona();
		p1.setUbicacion(-50);
		//Es el valor esperado vs lo que me esta devolviendo el metodo
		
		boolean valorEsperado = true;
		boolean valorObtenido = p1.estaMundoMaravilla();
		
		assertEquals(valorEsperado , valorObtenido);
	}
	@Test
	void estaEnMaravillaTest_false() {
		Persona p1 = new Persona(9);
		
		assertEquals(false, p1.estaMundoMaravilla());
	
	}
	
	@Test
	//Comparacion de ints
	void ubicacion9Test() {
		Persona p1 = new Persona(9);
		
		assertEquals(9, p1.getUbicacion());
	
	}
	
	@Test
	//Para testear voids se checkean todas las variables que modifica
	void embellecerTest() {
		Persona p1 = new Persona();
		p1.setLocura(50);
		p1.setSecreto(100);
		
		p1.embellecer(20);
		
		//Corta si encuentra un falso, no te enumera todos, solo el primero que falla
		assertEquals(70,p1.getLocura());
		assertEquals(90,p1.getSecreto());
		
	}
	@Test
	void esLindoTest_true() {
		Persona p1 = new Persona();
		p1.setLocura(80);
		p1.setUbicacion(-1);
		
		assertEquals(true,p1.esLindo());
		
		
	}
	@Test
	void esLindoTest_false() {
		Persona p1 = new Persona();
		p1.setLocura(80);
		p1.setUbicacion(31);
		
		assertEquals(false,p1.esLindo());
		
		
	}
	
	@Test
	void esNormalTest_true() {
		Persona p1 = new Persona();
		p1.setLocura(2);
		p1.setSecreto(700);
		
		assertEquals(true,p1.esNormal());
	}
	
	@Test
	void esNormalTest_false() {
		Persona p1 = new Persona();
		p1.setLocura(80);
		p1.setSecreto(0);
		
		assertEquals(false,p1.esNormal());
	}
	
	
}
