package modelo;
//Lautaro Peronace 5°3
public class App {

	public static void main(String[] args) {
		
		Satelite s;
		CMPA pruebita = new CMPA();
		
		for(int c = 0; c<6 ;c++) {
			ChacraProfunda chacra = new ChacraProfunda(0, 0, 0, null, null, 0, 0, 2147483649l, null);
			s = chacra;
			pruebita.cargarSatelites(s);
		}
		

		for(int a = 0; a < 17 ; a++) {
			AuroraAstral aurora = new AuroraAstral(0, 0, 0, null, null, 0, 0, 300000000l, null);
			s = aurora;
			
			pruebita.cargarSatelites(s);
		}
		
		for(int p = 0; p < 17 ; p++) {
			Pampa32 pampa = new Pampa32(0, 0, 0, null, null, 0, 0, 4246861544l, null);
			s = pampa;
			pruebita.cargarSatelites(s);
		}
		
		System.out.println(pruebita.calcularEnergia());
		System.out.println(pruebita.cuantosComunicadoresHibernan());
		System.out.println(pruebita.calcularCienciaAcumulada());
		//Lautaro Peronace 5°3
	}

}
