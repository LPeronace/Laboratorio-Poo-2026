import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
	private Scanner s = new Scanner(System.in);

	public Utilidades() {
		
	}
	
	public int pedirNumero(String textoMostrar) {
		System.out.println(textoMostrar);
		int numeroPedido = s.nextInt();
		
		return numeroPedido;
	}
	public String pedirString(String textoMostrar) {
		System.out.println(textoMostrar);
		String textoPedido = s.next();
		
		return textoPedido;
	}

	
	
	public int mostrarMenu(ArrayList<String> parametros) {
		
		for(int i = 0; i < parametros.size() ; i++) {
			
			System.out.println(parametros.get(i));
		}
		int opcion = s.nextInt();
		return opcion;
	}
	
	//Var args, se pasan una cantidad x de argumentos String, sirve para no tener que estar cargando un arraylist
	public int mostrarMenu(String ...parametros) {
		
		for(int i = 0; i < parametros.length ; i++) {
			
			System.out.println(parametros[i]);
		}
		int opcion = s.nextInt();
		return opcion;
	}

}
