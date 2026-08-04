package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Enumeradores.Clases;
import modelo.Jugador;
import modelo.Equipamiento;
class JugadorTest {
	
	@Test
	void jugadorTanqueTest_true() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		armadura.setDefensa(10000);
		Jugador j1 = new Jugador(armadura);
		assertEquals(true,j1.jugadorTanque());
	}
	@Test
	void jugadorTanqueTest_false() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		armadura.setDefensa(10);
		Jugador j1 = new Jugador(armadura);
		assertEquals(false,j1.jugadorTanque());
	}
	
	@Test
	void esGlassCanonTest_true() {
		Equipamiento armadura = new Equipamiento();
		armadura.setDefensa(12);
		Jugador j = new Jugador(armadura);
		
		assertEquals(true,j.esGlassCanon());
	}
	@Test
	void esGlassCanonTest_false() {
		Equipamiento armadura = new Equipamiento();
		armadura.setDefensa(120);
		Jugador j = new Jugador(armadura);
		
		assertEquals(false,j.esGlassCanon());
	}
	
	@Test
	void esAsesinoTest_true() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		Jugador j = new Jugador(Clases.NINJA, 130,armadura);
		assertEquals(true,j.esAsesino());
	}
	
	@Test
	void esAsesinoTest_false() {
		Equipamiento armadura = new Equipamiento(2,8000000);
		Jugador j = new Jugador(Clases.NINGUNO, 130,armadura);
		assertEquals(false,j.esAsesino());
	}
	@Test
	void estaPreparadoTest_true() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		Jugador j = new Jugador(130,armadura);
		
		assertEquals(true, j.estaPreparado());
	}
	@Test
	void estaPreparadoTest_false() {
		Equipamiento armadura = new Equipamiento(2,8000000);
		Jugador j = new Jugador(10,armadura);
		
		assertEquals(false, j.estaPreparado());
	}
	
	@Test
	void estaComplicadoTest_true() {
		Equipamiento armadura = new Equipamiento(2);
		armadura.setDurabilidad(-1);
		Jugador j = new Jugador(armadura);
		j.setBalance(10);
		
		assertEquals(true, j.estaComplicado());
	}

	@Test
	void estaComplicadoTest_false() {
		Equipamiento armadura = new Equipamiento(2);
		armadura.setDurabilidad(1);
		Jugador j = new Jugador(armadura);
		j.setBalance(10000000);
		
		assertEquals(false, j.estaComplicado());
	}
	
	@Test
	void tieneMuchaPlataTest_true() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		Jugador j = new Jugador(armadura,1);
		assertEquals(true, j.tieneMuchaPlata());
	}
	
	@Test
	void tieneMuchaPlataTest_false() {
		Equipamiento armadura = new Equipamiento(1,8000000);
		Jugador j = new Jugador(armadura,10);
		assertEquals(false, j.tieneMuchaPlata());
	}
	
	@Test
	void esNovatoTest_true() {
		Jugador j = new Jugador(20,0);
		assertEquals(true,j.esNovato());
	}
	@Test
	void esNovatoTest_false() {
		Jugador j = new Jugador(10,20);
		assertEquals(false,j.esNovato());
	}
	
	@Test
	void esVeteranoTest_true() {
		Jugador j = new Jugador(10,120);
		assertEquals(true, j.esVeterano());
	}
	@Test
	void esVeteranoTest_false() {
		Jugador j = new Jugador(1,120);
		assertEquals(false,j.esVeterano());
	}
}
