package Herenciaejemplos;

public class Precio {
	private String articulos, tienda;
	private int precio;
	public Precio(String articulos, String tienda, int precio) {
		
		this.articulos = articulos;
		this.tienda = tienda;
		this.precio = precio;
	}
	public String getArticulos() {
		return articulos;
	}
	public void setArticulos(String articulos) {
		this.articulos = articulos;
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
