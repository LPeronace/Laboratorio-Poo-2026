package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.Fauna;
import modelo.Sector;
class SectorTest {

	@Test
	void esVulnerableTest_true() {
		Fauna fauna = new Fauna(1,60000000);
		
		Sector sector = new Sector(fauna);
		
		assertEquals(true,sector.esVulnerable());
	}
	
	@Test
	void esVulnerableTest_false() {
		Fauna fauna = new Fauna(7,60000000);
		Sector sector = new Sector(fauna);
		assertEquals(false,sector.esVulnerable());
	}
	
	@Test
	void valorSectorTest() {
		Fauna fauna = new Fauna(1,500);
		Sector sector = new Sector(1, fauna);
		
		assertEquals(800,sector.valorSector());
	}
}
