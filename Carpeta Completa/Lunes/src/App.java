
public class App {

	public static void main(String[] args) {
		
		Persona juanito = new Persona(100,90);
		
		juanito.aplazarAlarma(20);
		
		System.out.println(juanito.getMinutoDormido());
	}

}
