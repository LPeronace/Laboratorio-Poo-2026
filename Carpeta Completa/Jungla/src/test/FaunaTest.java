package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.Fauna;
class FaunaTest {

	@Test
	void enPeligroTest_true() {
		Fauna fauna = new Fauna(1,60000000);
		
		assertEquals(true,fauna.enPeligro());
	}

	@Test
	void enPeligroTest_false() {
		Fauna fauna = new Fauna(7,60000000);
		
		assertEquals(false,fauna.enPeligro());
	}
	
}
