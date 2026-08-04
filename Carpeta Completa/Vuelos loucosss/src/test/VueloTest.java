package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Persona;
import modelo.Vuelo;

class VueloTest {

	@Test
	void capacidadMenorACienTest_true() {
		Vuelo vuelo = new Vuelo(50);
		
		assertEquals(true, vuelo.capacidadMenorACien());
		
	}
	@Test
	void capacidadMenorACienTest_false() {
		Vuelo vuelo = new Vuelo(150);
		
		assertEquals(false, vuelo.capacidadMenorACien());
		
	}
	
	@Test
	void masDe60MinutosTest_true() {
		Persona gustavo = new Persona(20);
		Persona enrique = new Persona(80);
		Persona bolchevique = new Persona(30);
		
		Persona[] vueloConPasajeros = new Persona[3];
		
		vueloConPasajeros[0] = gustavo;
		vueloConPasajeros[1] = enrique;
		vueloConPasajeros[2] = bolchevique;
		Vuelo vuelos = new Vuelo();
		vuelos.setVuelosConPasajeros(vueloConPasajeros);
		vuelos.setCapacidadPasajeros(3);
		assertEquals(true, vuelos.masDe60Minutos());
		
	}
	
	@Test
	void masDe60MinutosTest_false() {
		Persona gustavo = new Persona(20);
		Persona enrique = new Persona(10);
		Persona bolchevique = new Persona(30);
		
		Persona[] vueloConPasajeros = new Persona[3];
		
		vueloConPasajeros[0] = gustavo;
		vueloConPasajeros[1] = enrique;
		vueloConPasajeros[2] = bolchevique;
		Vuelo vuelo = new Vuelo();
		vuelo.setVuelosConPasajeros(vueloConPasajeros);
		vuelo.setCapacidadPasajeros(3);
		
		assertEquals(false, vuelo.masDe60Minutos());
	}
	
	@Test
	void tieneMenosDe100Test_true() {
		Vuelo vuelo = new Vuelo();
		vuelo.setCapacidadPasajeros(10);
		
		assertEquals(true, vuelo.tieneMenosDe100());
	}
	
	@Test
	void tieneMenosDe100Test_false(){
		Vuelo vuelo = new Vuelo();
		vuelo.setCapacidadPasajeros(120);
		
		assertEquals(false, vuelo.tieneMenosDe100());
	}
	

}
