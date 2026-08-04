package modelo;

import Enumeradores.Clases;

public class Jugador {
	private Clases clase;
	private int nivel;
	private int añoExperiencia;
	private int balance;
	private Equipamiento armadura;
	
	public Jugador(int nivel, int añoExperiencia, int balance, Equipamiento armadura, Clases clase) {
		this.nivel = nivel;
		this.añoExperiencia = añoExperiencia;
		this.balance = balance;
		this.armadura = armadura;
		this.clase = clase;
	}
	public Jugador() {
		
	}
	public Jugador(Clases clase, int nivel, Equipamiento armadura) {
		this.clase = clase;
		this.nivel = nivel;
		this.armadura = armadura;
	}
	public Jugador(int nivel, Equipamiento armadura) {
		this.nivel = nivel;
		this.armadura = armadura;
	}
	public Jugador(Equipamiento armadura) {
		this.armadura = armadura;
	}
	public Jugador(Equipamiento armadura, int añoExperiencia) {
		this.añoExperiencia = añoExperiencia;
		this.armadura = armadura;
	}
	public Jugador(int añoExperiencia, int nivel) {
		this.nivel = nivel;
		this.añoExperiencia = añoExperiencia;
	}
	public boolean esAsesino() {
		return (clase == Clases.NINJA || clase == Clases.STRIKER) && estaPreparado();
	}
	
	public boolean estaPreparado() {
		return (nivel >= 120 && armadura.esLegendario());
	}
	
	public boolean estaComplicado() {
		return (balance <10000 && armadura.esBajaCalidad());
	}
	public boolean esGlassCanon() {
		return armadura.esOfensivo();
	}
	
	public boolean tieneMuchaPlata() {
		return (añoExperiencia < 2 && armadura.esLegendario());
	}
	public boolean esNovato() {
		return (añoExperiencia < 1 || nivel < 15);
	}
	public boolean esVeterano() {
		return (añoExperiencia > 5 && nivel > 90);
	}
	
	public boolean jugadorTanque() {
		return armadura.esEquipamientoTanque();
	}
	
	public int getNivel() {
		return nivel;
	}
	public int getAñoExperiencia() {
		return añoExperiencia;
	}
	public int getBalance() {
		return balance;
	}
	public Equipamiento getArmadura() {
		return armadura;
	}
	public Clases getClase() {
		return clase;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public void setAñoExperiencia(int añoExperiencia) {
		this.añoExperiencia = añoExperiencia;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setArmadura(Equipamiento armadura) {
		this.armadura = armadura;
	}
	public void setClase(Clases clase) {
		this.clase = clase;
	}
}
