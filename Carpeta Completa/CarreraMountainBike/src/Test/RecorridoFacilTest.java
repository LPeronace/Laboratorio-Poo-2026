package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.RecorridoFacil;
class RecorridoFacilTest {

	@Test
	void calcularTiempoTest() {
		int distancia = 90;
		RecorridoFacil r = new RecorridoFacil(distancia);
		
		assertEquals(3,r.calcularTiempo());
	}

}
