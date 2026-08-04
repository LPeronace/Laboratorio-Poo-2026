import java.util.ArrayList;
import java.util.Scanner;

public class Maquina {
	private ArrayList<Producto> productos = new ArrayList<>();
	private Scanner s = new Scanner(System.in);
	private GuardadoMatrices guardadoMatrices = new GuardadoMatrices();
	private Utilidades utilidad = new Utilidades();
	private ArrayList<String> menusito = new ArrayList<String>();
	
	public Maquina() {
		this.productos = guardadoMatrices.crearArrayList();
		
	}
	
	public void menuPrincipal() {
		menusito.add("1:Ver Sanguches");
		menusito.add("2:Ver Bebidas");
		menusito.add("3:Ver Golosinas");
		menusito.add("4:Ver Saludables");
		menusito.add("5:Comprar");
		menusito.add("6:Ver para que te alcanza");
		menusito.add("7:Salir");
		boolean salir = false;
		int opcion;
		do {
			System.out.println("Bienvenido a la maquinita expendedora, usted tiene muchas opciones, elija");
			opcion = utilidad.mostrarMenu("1:Ver sanguches","2:Ver Bebidas");
			
			
			switch(opcion) {
			case 1:
				verCosas(TipoProducto.SANGUCHES);
				break;
			case 2:
				verCosas(TipoProducto.BEBIDAS);
				break;
			case 3: 
				verCosas(TipoProducto.GOLOSINAS);
				break;
			case 4: 
				verCosas(TipoProducto.SALUDABLES);
				break;
			case 5:
				comprar();
				break;
			case 6:
				verParaQueMeAlcanza();
				break;
			case 7: salir = true;
				break;
			}
		}while(!salir);
		
	}
	private void verParaQueMeAlcanza() {
		ArrayList<Producto> productosAlPresupuesto = new ArrayList<>();
		
		int plataDisponible = utilidad.pedirNumero("Ingrese la cantidad que quiere gastar:");
		
		int contador = 0;
		if(plataDisponible > 0 ) {
			
			for(Producto p: productos) {
				if(plataDisponible >p.getPrecio()) {
					productosAlPresupuesto.add(p);
					contador++;
				}
			}
			
			verTodo(productosAlPresupuesto);
			if(contador > 0) {
				int opcion = utilidad.pedirNumero("Queres comprar alguno? (1 si 2 no) ");
				
				if(opcion == 1) {
					String opcionString = utilidad.pedirString("Cual item queres comprar?, ingrese el indice:");
					
					for(Producto p: productosAlPresupuesto) {
					
						if(p.getIndice().equals(opcionString)) {
							System.out.println("Gracias por comprar");
							p.setCantidad((p.getCantidad()-1));
						}
					}
					
				}
				else {
					System.out.println("Volviendo al menu.");
				}
			}
			else {
				System.out.println("No existe ningun producto en ese precio");
			}
			
		}
		else {
			System.out.println("No se puede poner plata menor a 0");
		}
		
		
		
	}
	private void comprar() {
		String elegido = utilidad.pedirString("Ingrese el id del item:").toUpperCase();
		boolean esta = false;
		Producto productoElegido = productos.get(0);
		
		for(Producto p: productos) {
			if(p.getIndice().toUpperCase().equals(elegido)) {
				System.out.println(p.getLeyenda());
				esta = true;
				productoElegido = p;
			}
		}
		if(!esta) {
			System.out.println("ID incorrecto, volviendo al menu");
		}
		
		if(esta && productoElegido.getCantidad() > 0) {
			elegido = utilidad.pedirString("Lo queres comprar o te arrepentis? (1 o 2):");
			
			if( elegido.equals("1")) {
				System.out.println("El precio es: " + productoElegido.getPrecio()+ " ,gracias por comprar");
				productoElegido.setCantidad((productoElegido.getCantidad()-1));
			}
			else {
				System.out.println("Volviendo al menu.");
			}
		}
		
	}
	
	private void verTodo(ArrayList<Producto> productosParaVer) {
		for(Producto p: productosParaVer) {
			System.out.println(p.getIndice() + " " + p.getNombre() + " " + p.getLeyenda() + " " + p.getPrecio() +" " + p.getCantidad());
		}
	}
	private void verCosas(TipoProducto tipito) {
		ArrayList<Producto> temporal = new ArrayList<>();
		for(Producto p: productos) {
			switch(tipito) {
			case SANGUCHES:
				temporal.add(p);
				break;
			case BEBIDAS:
				temporal.add(p);
				break;
			case GOLOSINAS:
				temporal.add(p);
				break;
			case SALUDABLES:
				temporal.add(p);
				break;
			}
		}
		verTodo(temporal);
	}
/*
	private void verSanguches() {
		ArrayList<Producto> temporal = new ArrayList<>();
		for(Producto p: productos) {
			if(p.getTipo() == TipoProducto.SANGUCHES){
				temporal.add(p);
			}
		}
		verTodo(temporal);
		
	}
	private void verBebidas() {
		ArrayList<Producto> temporal = new ArrayList<>();
		for(Producto p: productos) {
			if(p.getTipo() == TipoProducto.BEBIDAS) {
				temporal.add(p);
			}
		}
		verTodo(temporal);
	}
	private void verGolosinas() {
		ArrayList<Producto> temporal = new ArrayList<>();
		for(Producto p: productos) {
			if(p.getTipo() == TipoProducto.GOLOSINAS) {
				temporal.add(p);
			}
		}
		verTodo(temporal);
	}
	private void verSaludables() {
		ArrayList<Producto> temporal = new ArrayList<>();
		for(Producto p: productos) {
			if(p.getTipo() == TipoProducto.SALUDABLES) {
				temporal.add(p);
			}
		}
		verTodo(temporal);
	}
	*/
	
}
