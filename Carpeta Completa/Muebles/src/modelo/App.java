package modelo;

public class App {

	public static void main(String[] args) {
		//String nombre, int posicionX, int posicionY, int posicionZ, int capacidadPersonasActual, int gradoSuciedad,
		//String material, Calidad calidad, Estado estado, Zona zona
		
		Mueble mueble1 = new Mueble("Raul", 10,20,30,1,0,"Cuero", Calidad.BUENA, Estado.SANO,Zona.COCINA);
		Mueble mueble2 = new Mueble("Jhohan ", 600, 20, 1, 0, 40, "Madera", Calidad.MALA, Estado.ROTO, Zona.BAÑO);
		Mueble mueble3 = new Mueble("Thiago", 2, 60, 40, 2, 30, "Plastico", Calidad.MEDIA, Estado.SANO, Zona.COCINA);
		


	}

}
