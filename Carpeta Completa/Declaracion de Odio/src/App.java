
public class App {

	public static void main(String[] args) {
		ArrayListTrucho vec = new ArrayListTrucho();
		
		System.out.println(vec.longitud());
		
		vec.agregar(10);
		
		System.out.println(vec.longitud());
		
		int a = vec.sacarPromedio();
		
		System.out.println(a);
		
		vec.sacar(1);
		System.out.println(vec.longitud());
	}

}
