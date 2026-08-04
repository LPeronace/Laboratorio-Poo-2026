public class Producto {
	private String indice;
	private String nombre;
	private String leyenda;
	private int precio;
	private int cantidad;
	private TipoProducto tipo;
	
	public Producto(String indice, String nombre, String leyenda, String precio, String cantidad) {
		this.indice = indice;
		this.nombre = nombre;
		this.leyenda = leyenda;
		this.precio = Integer.valueOf(precio);
		this.cantidad = Integer.valueOf(cantidad);
		this.tipo = determinarTipo(indice);
	}
	public Producto(String indice, String nombre, String leyenda, int precio, int cantidad) {
		this.indice = indice;
		this.nombre = nombre;
		this.leyenda = leyenda;
		this.precio = precio;
		this.cantidad = cantidad;
		this.tipo = determinarTipo(indice);
	}
	
	private TipoProducto determinarTipo(String id) {
		char inicial = id.charAt(0);
		TipoProducto tipoAux = null;
		
		switch(inicial) {
		case 'A':
			tipoAux = TipoProducto.SANGUCHES;
			break;
		case 'B':
			tipoAux = TipoProducto.BEBIDAS;
			break;
		case 'C':
			tipoAux = TipoProducto.GOLOSINAS;
			break;
		case 'D':
			tipoAux = TipoProducto.SALUDABLES;
			break;
		}
		
		
		return tipoAux;
	}
	
	public TipoProducto getTipo() {
		return tipo;
	}
	public String getIndice() {
		return indice;
	}
	public String getNombre() {
		return nombre;
	}
	public String getLeyenda() {
		return leyenda;
	}
	public int getPrecio() {
		return precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setIndice(String indice) {
		this.indice = indice;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
