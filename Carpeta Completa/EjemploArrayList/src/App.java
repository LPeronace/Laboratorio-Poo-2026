import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.remove(1);
		
		System.out.println(numeros);
		
		for(int i = 0; i<numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		for(Integer i : numeros) {
			System.out.println(numeros.get(i));
		}
	}

}
