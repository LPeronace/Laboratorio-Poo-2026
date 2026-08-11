package modelo;

public class App {

	public static void main(String[] args) {
		//String nombre, int posicionX, int posicionY, int posicionZ, int capacidadPersonasActual, int gradoSuciedad,
		//String material, Calidad calidad, Estado estado, Zona zona
		
		Silla silla = new Silla("Raul", 10,20,30,1,0,"Cuero", Calidad.BUENA, Estado.SANO,Zona.COCINA, 60, 1, 50);
		Cama cama = new Cama("Jhohan ", 600, 20, 1, 0, 40, "Madera", Calidad.MALA, Estado.ROTO, Zona.BAÑO, 30, 1, 2);
		Sillon sillon = new Sillon("Thiago", 2, 60, 40, 2, 30, "Plastico", Calidad.MEDIA, Estado.SANO, Zona.COCINA, 2, 1, 0);
		
		Heladera heladera = new Heladera("Rubi", 10,20,30,1,0,"Cuero", Calidad.BUENA, Estado.SANO,Zona.COCINA, 20, 1);
		Microondas microondas = new Microondas("Yamile", 10,20,30,1,0,"Plastico", Calidad.BUENA, Estado.SANO,Zona.COCINA, 200, 1);
		Horno horno = new Horno("Lautaro", 10,20,30,1,0,"Metal", Calidad.BUENA, Estado.SANO,Zona.COCINA, 700, 21);
	}

}
