package modelo;
//Lautaro Peronace 5°3
public class CMPA {
	private Satelite[] satelites = new Satelite[1000];
	private int contadorDeSatelites = 0;
	
	
	public CMPA() {
		
	}
	//Metodo para cargar cada satelite
	public void cargarSatelites(Satelite satelite) {
			satelites[contadorDeSatelites] = satelite;
			contadorDeSatelites += 1;
	}
	//Calculo la energia total de todos los satelites y despues la devuelvo
	public double calcularEnergia() {
		double cargaTotal = 0;
		for(int i = 0; i< contadorDeSatelites ; i++) {
			
			cargaTotal += satelites[i].getCargaActual();
		}
		return cargaTotal;
	}
	
	
	//aca veo mediante un enumerador si es un satelite de comunicacion, y despues si se encuentra hibernando, lo sumo a un
	//contador para luego regresarlo
	public int cuantosComunicadoresHibernan() {
		int contador = 0;
		for(int i = 0; i< contadorDeSatelites ; i++) {
			Satelite s = satelites[i];
			if(s.getIdentificador() == Identificador.COMUNICACION) {
				if(s.estaHibernando()) {
					contador += 1;
				}
			}
		}
		return contador;
	}
	//Aca checkeo si es un satelite de ciencia, para luego 
	public long calcularCienciaAcumulada() {
		long cienciaAcumulada = 0l;
		
		for(int i = 0; i < contadorDeSatelites; i++) {
			Satelite s = satelites[i];
			
			AuroraAstral a = (AuroraAstral) s;
			
			if(s.getIdentificador() == Identificador.CIENCIA) {
				
				cienciaAcumulada += a.getMedidorCiencia();
				
			}
		}
		
		return cienciaAcumulada;
	}
	
	//Lautaro Peronace 5°3
}

