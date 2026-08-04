import java.util.Scanner;

public class Maquina {
	private String estado;
	private Scanner s = new Scanner(System.in);
	
	public Maquina(String estado){
		this.estado = estado.toUpperCase();
	}
	
	public void prender() {
		estado = "ENCENDIDO";
	}
	
	public void apagar() {
		estado = "APAGADO";
	}
	public void standBy() {
		estado = "STAND BY";
	}
	
	public void calculadora() {
		
		System.out.println("Ingrese el primer numero:");
		int num1 = checkeoNumero();
		
		System.out.println("Ingrese el segundo numero");
		int num2 = checkeoNumero();
		
		
		String opcion;
		boolean quedarse = false;
		System.out.println("Bienvenido al menu de la calculadora");
		do {
			quedarse = true;
			opcion = s.next();
			System.out.println("1 para sumar");
			System.out.println("2 para restar");
			System.out.println("3 para multiplicar");
			System.out.println("4 para dividir");
			System.out.println("5 para salir");
			switch(opcion) {
				case "1": System.out.println("El resultado de la suma es:"+ sumar(num1,num2));			
					break;
				case "2": System.out.println("El resultado de la resta es:"+ restar(num1,num2));
					break;
				case "3": System.out.println("El resultado de la multiplicacion es:"+ multiplicar(num1,num2));
					break;
				case "4": System.out.println("El resultado de la division es:"+ dividir(num1,num2));
					break;
				case "5": quedarse = false;
					break;
				default: System.out.println("Error");
			}
		}while(quedarse);
		
		
	}
	private float dividir(int num1,int num2) {
		return num1/num2;
	}
	
	private int multiplicar(int num1,int num2) {
		return num1*num2;
	}
	
	private int restar(int num1,int num2) {
		return num1-num2;
	}
	
	private int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	private int checkeoNumero() {
		int num;
		boolean quedarse = false;
		do {
			quedarse = true;
			num = s.nextInt();
			if(num / num  == 1) {
				quedarse = false;
			}
			if(!quedarse) {
				System.out.println("Ingrese el numero devuelta:");
			}
		}while(quedarse);
		return num;
	}
	
	
}
