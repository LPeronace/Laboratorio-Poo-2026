package modelo;

public enum Raza {
	DE_PROPAGANDA(1),
	PASTOREO_LIGERO(2),
	PURA_LECHE(5);
	
	int multiplicador;

	Raza(int multiplicador){
		this.multiplicador = multiplicador;
	}
}
