package modelo;

public class App {

	public static void main(String[] args) {
		//String nombre, Posicion posicion, int cantidadPersonasActual, int gradoSuciedad,
		//String material, Calidad calidad, Estado estado, Zona zona, int cargaMaxima, int comodidad, int proteccionContraFrio
		Posicion pos = new Posicion(1,2,3);
		Posicion pos1 = new Posicion(1,2,3);
		Posicion pos2 = new Posicion(1,2,3);
		
		Silla silla = new Silla("Raul", pos,"Cuero", Calidad.BUENA, Estado.SANO,Zona.COCINA, 60, 1, 50);
		Cama cama = new Cama("Jhohan ", pos1, "Madera", Calidad.MALA, Estado.ROTO, Zona.BAÑO, 30, 1, 2);
		Sillon sillon = new Sillon("Thiago", pos2, "Plastico", Calidad.MEDIA, Estado.SANO, Zona.COCINA, 2, 1, 0);
		
		Heladera heladera = new Heladera("Rubi", 10,20,30,1,0,"Cuero", Calidad.BUENA, Estado.SANO,Zona.COCINA, 20, 1);
		Microondas microondas = new Microondas("Yamile", 10,20,30,1,0,"Plastico", Calidad.BUENA, Estado.SANO,Zona.COCINA, 200, 1);
		Horno horno = new Horno("Lautaro", 10,20,30,1,0,"Metal", Calidad.BUENA, Estado.SANO,Zona.COCINA, 700, 21);
		
		Menu menu = new Menu();
		
		//menu.hacerMenu();
		//Anotaciones;hacer un telefono con agenda, dormir en funcion de su energia y hambre, la persona tiene felicidad, la persona tiene atributos
		//basicos, menu ir a(zona de la casa), interactuar con un objeto de la zona, mostrar su estado, etc
	}

}