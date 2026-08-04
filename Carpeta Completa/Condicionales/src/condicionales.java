import java.util.Scanner;

public class condicionales {
	
	public static String decidirCategoria(int edad) {
		String decision;
		if(edad>= 18 && edad<65) {
			decision = ("Sos mayor de edad!");
		}
		else if(edad<18){
			decision =("Sos menor!");
		}
		else {
			decision =("Sos jubilado!");
		}
		return decision;
	}

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Decime tu edad:");
		int edad = lectura.nextInt();
		
		System.out.println(decidirCategoria(edad));
		
	}

}
