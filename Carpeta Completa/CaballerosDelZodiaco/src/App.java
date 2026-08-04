import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Constelacion aries = new Constelacion(50000000,true);
		Constelacion tauro = new Constelacion(50000000,false);
		Constelacion geminis = new Constelacion(50000000,true);
		Constelacion cancer = new Constelacion(50000000,false);
		Constelacion leo = new Constelacion(50000000,true);
		Constelacion virgo = new Constelacion(50000000,false);
		Constelacion libra = new Constelacion(50000000,true);
		Constelacion escorpio = new Constelacion(50000000,false);
		Constelacion sagitario = new Constelacion(1,true);
		Constelacion capricornio = new Constelacion(50000000,false);
		Constelacion acuario = new Constelacion(50000000,true);
		Constelacion piscis = new Constelacion(50000000,false);
		
		Caballero mu = new Caballero("mu",12,50,aries);
		Caballero barbatos = new Caballero("barbatos",80,10,tauro);
		Caballero saga = new Caballero("saga",20,90,geminis);
		Caballero thiago = new Caballero("thiago",32,20,cancer);
		Caballero aloria = new Caballero("aloria",19,30,leo);
		Caballero shakira = new Caballero("shakira",10,40,virgo);
		Caballero shadowSanty = new Caballero("dohko",22,70,libra);
		Caballero miloJ = new Caballero("milo j",21,60,escorpio);
		Caballero aioros = new Caballero("aioros",11,9,sagitario);
		Caballero aloeVera = new Caballero("aloeVera",9,5,capricornio);
		Caballero camus = new Caballero("camus",5,0,acuario);
		Caballero afrodito = new Caballero("afrodito",3,1250,piscis);
		
		ArrayList<Caballero> liga = new ArrayList<>();
		liga.add(mu);
		liga.add(barbatos);
		liga.add(saga);
		liga.add(thiago);
		liga.add(aloria);
		liga.add(shakira);
		liga.add(shadowSanty);
		liga.add(miloJ);
		liga.add(aioros);
		liga.add(aloeVera);
		liga.add(camus);
		liga.add(afrodito);
		
		LigaAtenea ligaAtenea = new LigaAtenea(liga);
		
		System.out.println(afrodito.esPrecoz());
		
		System.out.println(ligaAtenea.porcentajePrecoz()+"%");
	}

}
