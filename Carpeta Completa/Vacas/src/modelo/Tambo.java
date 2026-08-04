package modelo;

public class Tambo {
	
	private int superficie;
	private int capacidad = superficie/2;
	private Vaca[] vacas = new Vaca[capacidad];
	
	
	public Tambo(int superficie) {
		this.superficie = superficie;
	}
	
	public int getSuperficie() {
		return superficie;
	}
	
	public int conseguirProduccionTotal() {
		int sumatoria = 0;
		for(Vaca v: vacas) {
			sumatoria += v.produccionLechePorVaca();
		}
		
		return sumatoria;
	}
	
	public Vaca vacaMasProductoraTambo() {
		Vaca vacaMayor = vacas[0];
		
		for(Vaca v: vacas) {
			if(v.produccionLechePorVaca() > vacaMayor.produccionLechePorVaca()) {
				vacaMayor = v;
			}
		}
		
		return vacaMayor;
	}
	public int vacaMasProductoraTamboLeche() {
		return vacaMasProductoraTambo().produccionLechePorVaca();
	}
	public Vaca[] getVacas() {
		return vacas;
	}
	
}
