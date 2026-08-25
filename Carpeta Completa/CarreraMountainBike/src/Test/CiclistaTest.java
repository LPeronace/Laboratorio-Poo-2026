package Test;

import static org.junit.jupiter.api.Assertions.*;
import modelo.RecorridoFacil;
import org.junit.jupiter.api.Test;
import modelo.Ciclista;
class CiclistaTest {

	@Test
	void mayorA30PuntosTest_true() {
		Ciclista ciclista = new Ciclista(30);
		RecorridoFacil r = new RecorridoFacil(10);
		r.setPuntaje(31);
		
		ciclista.agregarRecorridos(r);
		
		assertEquals(true, ciclista.mayorA30Puntos());
	}
	
	@Test
	void mayorA30PuntosTest_false() {
		Ciclista ciclista = new Ciclista(30);
		RecorridoFacil r = new RecorridoFacil(10);
		r.setPuntaje(10);
		
		ciclista.agregarRecorridos(r);
		
		assertEquals(false, ciclista.mayorA30Puntos());
	}
	@Test
	void calcularTiempoEstimadoTotalTest() {
		Ciclista ciclista = new Ciclista(30);
		RecorridoFacil r = new RecorridoFacil(30);
		ciclista.agregarRecorridos(r);
				
		assertEquals(1,ciclista.calcularTiempoEstimadoTotal());
		
	}
	@Test
	void rendimientoMenorA2HorasTest_true() {
		Ciclista ciclista = new Ciclista(1);
		RecorridoFacil r = new RecorridoFacil(1);
		ciclista.agregarRecorridos(r);
				
		assertEquals(true,ciclista.rendimientoMenorA2Horas());
		
	}
	@Test
	void rendimientoMenorA2HorasTest_false() {
		Ciclista ciclista = new Ciclista(1);
		RecorridoFacil r = new RecorridoFacil(3);
		ciclista.agregarRecorridos(r);
				
		assertEquals(false,ciclista.rendimientoMenorA2Horas());
		
	}
}
