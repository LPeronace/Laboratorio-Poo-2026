package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.RecorridoDificil;
class RecorridoDificilTest {

	@Test
	void calcularTiempoTest() {
		int distancia = 40;
		int cantObstaculos = 5;
		
		RecorridoDificil r = new RecorridoDificil(distancia,cantObstaculos);
		
		assertEquals(10, r.calcularTiempo());
	}

}
