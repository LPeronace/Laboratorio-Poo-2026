import java.util.Scanner;

public class App {
	
	public static int sumatoria(int valor1,int valor2) {
		int suma;
		suma = valor1 + valor2;
		return(suma);
	}
	public static int hacerResta(int valor1, int valor2) {
		int resta;
		resta = valor1-valor2;
		return(resta);
	}
	public static int hacerMultiplicacion(int valor1, int valor2) {
		int multiplicado = valor1*valor2;
		return(multiplicado);
	}
	public static double divisiones(int valor1, int valor2) {
		double division;
		division = valor1/valor2;
		return(division);
	}
	public static int hacerModulado(int valor1, int valor2) {
		int modulado;
		modulado = valor1%valor2;
		return(modulado);
	}
	
	/**
	 * Esta funcion sirve para evitar la repetición de codigo del sysout, queda mas limpio
	 * @param resultado
	 */
	public static void mostrar(double resultado) {
		
		System.out.println("El resultado es:"+resultado);
	}
	
	public static void main(String[] args) {
		
		int valor1;
		Scanner lectura = new Scanner(System.in);
		valor1 = lectura.nextInt();
				
		int valor2;
		valor2 = lectura.nextInt();
		
		
		mostrar(sumatoria(valor1,valor2));
		mostrar(hacerResta(valor1,valor2));
		mostrar(hacerMultiplicacion(valor1,valor2));
		mostrar(divisiones(valor1,valor2));
		mostrar(hacerModulado(valor1,valor2));		
	}
}