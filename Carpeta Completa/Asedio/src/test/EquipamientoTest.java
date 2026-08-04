package test;

import static org.junit.jupiter.api.Assertions.*;
import modelo.Equipamiento;

import org.junit.jupiter.api.Test;

class EquipamientoTest {

	@Test
	void esLegendarioTest_true() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		assertEquals(true, armadura.esLegendario());
		
	}
	@Test
	void esLegendarioTest_false() {
		Equipamiento armadura = new Equipamiento(7,800000);
		assertEquals(false, armadura.esLegendario());
		
	}
	@Test
	void esBajaCalidadTest_true() {
		Equipamiento armadura = new Equipamiento(2);
		armadura.setDurabilidad(-1);
		assertEquals(true, armadura.esBajaCalidad());
	}
	
	@Test
	void esBajaCalidadTest_false() {
		Equipamiento armadura = new Equipamiento(10);
		armadura.setDurabilidad(10);
		assertEquals(false, armadura.esBajaCalidad());
	}
	
	@Test
	void esDefensivoTest_true() {
		Equipamiento armadura = new Equipamiento();
		armadura.setDefensa(123000);
		
		assertEquals(true,armadura.esDefensivo());
	}
	@Test
	void esDefensivoTest_false() {
		Equipamiento armadura = new Equipamiento();
		armadura.setDefensa(12);
		
		assertEquals(false,	armadura.esDefensivo());
	}
	
	@Test
	void esOfensivoTest_true() {
		Equipamiento armadura = new Equipamiento();
		armadura.setDefensa(12);
		
		assertEquals(true,	armadura.esOfensivo());
	}
	
	@Test
	void esOfensivoTest_false() {
		Equipamiento armadura = new Equipamiento();
		armadura.setDefensa(123000);
		
		assertEquals(false,armadura.esOfensivo());
	}
	
	@Test
	void esEquipamientoTanqueTest_true() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		armadura.setDefensa(10000);
		assertEquals(true,armadura.esEquipamientoTanque());
	}
	
	@Test
	void esEquipamientoTanqueTest_false() {
		Equipamiento armadura = new Equipamiento(1,8000000);
		armadura.setDefensa(7);
		assertEquals(false,armadura.esEquipamientoTanque());
	}

}
