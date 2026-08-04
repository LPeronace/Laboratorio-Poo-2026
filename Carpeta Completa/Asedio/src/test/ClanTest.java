package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Enumeradores.Clases;
import modelo.Clan;
import modelo.Jugador;
import modelo.Equipamiento;
import java.util.ArrayList;

class ClanTest {

	@Test
	void losAsesinosTest() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		Jugador j1 = new Jugador(Clases.NINJA, 130,armadura);
		Jugador j2 = new Jugador(Clases.STRIKER, 150,armadura);
		Jugador j3 = new Jugador(Clases.NINGUNO, 10, armadura);
		ArrayList<Jugador> jugadores= new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		Clan clan = new Clan(jugadores);
		ArrayList<Jugador> jugadoresAsesinos = new ArrayList<>();
		jugadoresAsesinos.add(j1);
		jugadoresAsesinos.add(j2);
		
		assertEquals(jugadoresAsesinos,clan.losAsesinos());
	}
	@Test
	void muchaPlata() {
		Equipamiento armadura = new Equipamiento(12,8000000);
		Jugador j1 = new Jugador(armadura,10);
		Jugador j2 = new Jugador(armadura,1);
		Jugador j3 = new Jugador(armadura,0);
		ArrayList<Jugador> jugadores= new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		Clan clan = new Clan(jugadores);
		ArrayList<Jugador> jugadoresConMuchaPlata = new ArrayList<>();
		jugadoresConMuchaPlata.add(j2);
		jugadoresConMuchaPlata.add(j3);
		
		assertEquals(jugadoresConMuchaPlata,clan.muchaPlata());
	}
	@Test
	void siHayGlassCanon() {
		Equipamiento armadura1 = new Equipamiento();
		Equipamiento armadura2 = new Equipamiento();
		armadura2.setDefensa(120);
		armadura1.setDefensa(12);
		Jugador j1 = new Jugador(armadura2);
		Jugador j2 = new Jugador(armadura1);
		Jugador j3 = new Jugador(armadura2);
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		Clan clan = new Clan(jugadores);
		assertEquals(true, clan.siHayGlassCanon());
	}
	
	@Test
	void cuantosNovatosHay() {
		Jugador j1 = new Jugador(20,1);
		Jugador j2 = new Jugador(50, 1);
		Jugador j3 = new Jugador(70,20);
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		Clan clan = new Clan(jugadores);
		
		assertEquals(2,clan.cantidadDeNovatos());
		
		
	}
	@Test
	void losVeteranos() {
		Jugador j1 = new Jugador(7,120);
		Jugador j2 = new Jugador(80,8000);
		Jugador j3 = new Jugador(1,500);
		
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		Clan clan = new Clan(jugadores);
		ArrayList<Jugador> jugadoresVeteranos = new ArrayList<>();
		jugadoresVeteranos.add(j1);
		jugadoresVeteranos.add(j2);
		
		
		assertEquals(jugadoresVeteranos,clan.losVeteranos());
	}
	@Test
	void losTanques() {
		Equipamiento armadura1 = new Equipamiento(12,8000000);
		Equipamiento armadura2 = new Equipamiento(5,80);
		armadura1.setDefensa(10000);
		armadura2.setDefensa(200);
		Jugador j1 = new Jugador(armadura1);
		Jugador j2 = new Jugador(armadura1);
		Jugador j3 = new Jugador(armadura2);
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		ArrayList<Jugador> jugadoresTanques = new ArrayList<>();
		jugadoresTanques.add(j1);
		jugadoresTanques.add(j2);
		
		Clan clan = new Clan(jugadores);
		
		assertEquals(jugadoresTanques,clan.losTanques());
	}
	

}
