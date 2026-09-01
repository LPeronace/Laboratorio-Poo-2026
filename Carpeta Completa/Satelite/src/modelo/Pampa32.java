package modelo;

public class Pampa32 extends Comunicaciones{

	public Pampa32(int x, int y, int z, Propulsor propulsor, Paneles panel, int antena, long capacidadCarga,
			float cargaActual, Identificador identificador) {
		super(35, 56, 200, propulsor.RP, panel.DEA, 7, 4246861544l, cargaActual, identificador.COMUNICACION);
	}
	//Lautaro Peronace 5°3
}
