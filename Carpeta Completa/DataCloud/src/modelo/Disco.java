package modelo;

public class Disco {
	
	private int cantSectoresCorruptos;
	private int tasaTransferencia;
	private tipoDiscos tipo;
	
	public Disco(int cantSectoresCorruptos, int tasaTransferencia, tipoDiscos tipo) {
		this.cantSectoresCorruptos = cantSectoresCorruptos;
		this.tasaTransferencia = ajustarAlTipoDeDisco(tasaTransferencia);
		this.tipo = tipo;
	}
	
	public Disco() {
		
	}
	public Disco(int tasaTransferencia) {
		this.tasaTransferencia = tasaTransferencia;
	}
	
	public Disco(int tasaTransferencia, int cantSectoresCorruptos) {
		this.tasaTransferencia = tasaTransferencia;
		this.cantSectoresCorruptos = cantSectoresCorruptos;
	}
	
	//Aca ajusto en si el valor de transferencia con el tipo de disco que sea
	public int ajustarAlTipoDeDisco(int tasaTransferencia) {
		return tasaTransferencia * tipo.multiplicador;
	}
	
	
	//Aca evaluo si el disco esta en riesgo con las dos condiciones antes delegadas para dejar el codigo mas limpio
	public boolean estaEnRiesgo() {
		return masDe5Corruptos() && tasaMenor50();
	}
	
	//Aca veo si hay mas de 5 sectores corruptos en el disco
	public boolean masDe5Corruptos() {
		return cantSectoresCorruptos>5;
	}
	
	//Y aca veo si la tasa de transferencia es menor a 50
	public boolean tasaMenor50() {
		return tasaTransferencia < 50;
	}
	
	//todos los get y sets necesarios
	public int getTasaTransferencia() {
		return tasaTransferencia;
	}

	public int getCantSectoresCorruptos() {
		return cantSectoresCorruptos;
	}
	public void setCantSectoresCorruptos(int cantSectoresCorruptos) {
		this.cantSectoresCorruptos = cantSectoresCorruptos;
	}
	
	public void setTasaTransferencia(int tasaTransferencia) {
		this.tasaTransferencia = tasaTransferencia;
	}
	
}
