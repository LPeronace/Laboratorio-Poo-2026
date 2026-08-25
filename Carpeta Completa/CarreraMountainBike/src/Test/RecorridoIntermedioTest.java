package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.RecorridoIntermedio;
class RecorridoIntermedioTest {

	@Test
	void calcularTiempoTest() {
		int distancia = 50;
		float indice = 1.5f;
		
		RecorridoIntermedio r = new RecorridoIntermedio(distancia,indice);
		
		assertEquals(3, r.calcularTiempo());
	}

}
