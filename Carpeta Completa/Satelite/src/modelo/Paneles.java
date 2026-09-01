package modelo;

public enum Paneles {
	DEA(1),
	CB(1.4f),
	RIPT(1.8f),
	PVMT(0.7f);
	
	float multi;

	Paneles(float multi){
		this.multi = multi;
	}
}
