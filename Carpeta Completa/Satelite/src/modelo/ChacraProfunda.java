package modelo;

public class ChacraProfunda extends Comunicaciones{
	
	public ChacraProfunda(int x, int y, int z, Propulsor propulsor, Paneles panel, int antena, long capacidadCarga,
			float cargaActual,Identificador identificador) {
		super(1080, 1068, 500, propulsor.COE, panel.PVMT, 9, 2147483649l, cargaActual,identificador.COMUNICACION);
	}
	//Lautaro Peronace 5°3

}
