package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Mundo;
import modelo.Persona;
class MundoTest {

	@Test
	void CuantosPersonajesLindosTest() {
		Persona p1 = new Persona();
		p1.setLocura(90);
		p1.setUbicacion(-10);
		Persona p2 = new Persona();
		p2.setLocura(5);
		p2.setUbicacion(50);
		Persona p3 = new Persona();
		p3.setLocura(80);
		p3.setUbicacion(-1);
		Persona p4 = new Persona();
		p4.setLocura(6);
		p4.setUbicacion(700);
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		Mundo mundito = new Mundo();
		mundito.setLasPersonas(personas);
		
		assertEquals(2,mundito.CuantosLindos());	
	}
	
	@Test
	void personajesNormalesTest() {
		
		Persona p1 = new Persona(90, -10, 0);
		Persona p2 = new Persona(5, 600, 0);
		Persona p3 = new Persona(80, -1, 10);
		Persona p4 = new Persona(6, 700, 20);
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		Mundo mundito = new Mundo();
		mundito.setLasPersonas(personas);
		ArrayList<Persona> personasNormales = new ArrayList<>();
		personasNormales.add(p2);
		personasNormales.add(p4);
		
		assertEquals(personasNormales, mundito.personajesNormales());
	}
}
