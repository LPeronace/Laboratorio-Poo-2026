package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.Persona;


class PersonaTest {

	@Test
	void mayorASesentaMinutosTest_true() {
		Persona p1 = new Persona(100);
		
		assertEquals(true, p1.mayorASesentaMinutos());
	}
	@Test
	void mayorASesentaMinutosTest_false() {
		Persona p1 = new Persona(0);
		
		assertEquals(false, p1.mayorASesentaMinutos());
		
	}
	
	
}
