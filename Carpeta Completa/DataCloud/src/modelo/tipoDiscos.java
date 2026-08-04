package modelo;

public enum tipoDiscos {
	
	//Aca le asigne a cada tipo de disco el multiplicador que tiene cada uno
	SATAHDD(1),
	SATASSD(4),
	M2(20);

	
	int multiplicador;
	
	tipoDiscos(int multiplicador){
		this.multiplicador = multiplicador;
	}
	
	
	
}
