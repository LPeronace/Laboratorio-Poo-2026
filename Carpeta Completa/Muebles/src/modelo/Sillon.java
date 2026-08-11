package modelo;

public final class Sillon extends Descanso{
	public Sillon(String nombre, Posicion posicion,String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima, 
			int comodidad, int proteccionContraFrio) 
	
	{
		super(nombre, posicion,material, calidad, estado, zona, cargaMaxima, comodidad, proteccionContraFrio);
	}
}
