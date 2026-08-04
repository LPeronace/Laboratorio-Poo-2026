package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.Disco;
class DiscoTest {

	@Test
	void tasaMenorA50Test_true() {
		Disco disco = new Disco(20);
		
		
		assertEquals(true,disco.tasaMenor50());
	}
	
	@Test
	void tasaMenorA50Test_false() {
		Disco disco = new Disco(8010);
		
		
		assertEquals(false,disco.tasaMenor50());
	}
	
	
	@Test
	void masDe5CorruptosTest_true() {
		Disco disco = new Disco();
		disco.setCantSectoresCorruptos(50);
		
		assertEquals(true,disco.masDe5Corruptos());
	}
	
	@Test
	void masDe5CorruptosTest_false() {
		Disco disco = new Disco();
		
		disco.setCantSectoresCorruptos(1);
		
		assertEquals(false,disco.masDe5Corruptos());
	}
	
	@Test
	void estaEnRiesgoTest_true() {
		Disco disco = new Disco(20,7);
		
		assertEquals(true,disco.estaEnRiesgo());
	}
	
	@Test
	void estaEnRiesgoTest_false() {
		Disco disco = new Disco(70,1);
		
		assertEquals(false,disco.estaEnRiesgo());
	}
}
