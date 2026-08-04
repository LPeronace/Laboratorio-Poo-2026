package modelo;

public class App {
	public static void main(String[] args) {
		
		//relleno
		int[][] matriz = new int[3][3];
		int contador = 1;
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				matriz[i][j] = contador;
				contador++;
			}
		}
		
		//diagonal principal
		int suma = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j< 3; j++) {
				if(i == j) {
					suma += matriz[i][j];
				}
			}
		}
		
		System.out.println(suma);
		
		//diagonal secundaria
		
		
		//ver matriz
		/*
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				System.out.print(matriz[i][j]);
				
			}
			System.out.println("");
		}
		*/
		
		
}
}
