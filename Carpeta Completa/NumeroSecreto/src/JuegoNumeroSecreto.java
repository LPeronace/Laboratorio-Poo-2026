import java.util.Random;



public class JuegoNumeroSecreto {

	public static void main(String[] args) {
		Random numeroAleatorio = new Random();
		numeroAleatorio.nextInt(1,100);
		
		System.out.println(numeroAleatorio);  
	}

}
