package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import modelo.Fauna;
import modelo.Sector;
import modelo.Amazonas;
import java.util.ArrayList;
class AmazonasTest {

	@Test
	void sectoresDebilesTest() {
		Fauna fauna = new Fauna(1,60000000);
		Fauna fauna2 = new Fauna(1,60000000);
		Fauna fauna3 = new Fauna(1,60000000);
		Fauna fauna4 = new Fauna(8,60000000);
		
		Sector s = new Sector(fauna);
		Sector s2 = new Sector(fauna2);
		Sector s3 = new Sector(fauna3);
		Sector s4 = new Sector(fauna4);
		
		ArrayList<Sector> sectores = new ArrayList<>();
		Amazonas jungla = new Amazonas(sectores);
		sectores.add(s);
		sectores.add(s2);
		sectores.add(s3);
		sectores.add(s4);
		
		ArrayList<Sector> sectoresDebiles = new ArrayList<>();
		sectoresDebiles.add(s);
		sectoresDebiles.add(s2);
		sectoresDebiles.add(s3);
		
		assertEquals(sectoresDebiles, jungla.sectoresVulnerables());
	}
	
	@Test
	void mayorEspeciesTest() {
		Fauna fauna = new Fauna(1,60000000);
		Fauna fauna2 = new Fauna(7,60000000);
		Fauna fauna3 = new Fauna(4,60000000);
		Fauna fauna4 = new Fauna(8,60000000);
		
		Sector s = new Sector(fauna);
		Sector s2 = new Sector(fauna2);
		Sector s3 = new Sector(fauna3);
		Sector s4 = new Sector(fauna4);
		
		ArrayList<Sector> sectores = new ArrayList<>();
		Amazonas jungla = new Amazonas(sectores);
		sectores.add(s);
		sectores.add(s2);
		sectores.add(s3);
		sectores.add(s4);
		
		assertEquals(s4, jungla.mayorEspecies());
	}
	
	
	@Test
	void valorMercadoIlegalTest() {
		Fauna fauna = new Fauna(500);
		Fauna fauna2 = new Fauna(800);
		Fauna fauna3 = new Fauna(1800);
		Fauna fauna4 = new Fauna(2800);
		
		Sector sector = new Sector(1, fauna);
		Sector sector2 = new Sector(1, fauna2);
		Sector sector3 = new Sector(1, fauna3);
		Sector sector4 = new Sector(1, fauna4);
		
		ArrayList<Sector> sectores = new ArrayList<>();
		sectores.add(sector);
		sectores.add(sector2);
		sectores.add(sector3);
		sectores.add(sector4);
		Amazonas jungla = new Amazonas(sectores);
		
		assertEquals(7100,jungla.valorMercadoIlegal());
		
		
	}
}
