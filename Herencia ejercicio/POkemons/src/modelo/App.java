package modelo;

public class App {

	public static void main(String[] args) {
		Acuatico magikarp = new Acuatico(10,20,30);
		Volador pidgeoto = new Volador(10,20,30);
		pidgeoto.evolucionar();
		magikarp.evolucionar();
		
	}

}
