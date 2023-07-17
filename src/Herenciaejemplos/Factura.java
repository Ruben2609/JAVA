package Herenciaejemplos;

public class Factura extends Precio{
	private String forma_pago, nombre;
	private int plazo_meses;
	public Factura(String articulos, String tienda, int precio, String forma_pago, String nombre, int plazo_meses) {
		super(articulos, tienda, precio);
		this.forma_pago = forma_pago;
		this.nombre = nombre;
		this.plazo_meses = plazo_meses;
	}
	public String getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPlazo_meses() {
		return plazo_meses;
	}
	public void setPlazo_meses(int plazo_meses) {
		this.plazo_meses = plazo_meses;
	}
	
	public void mostrar() {
		System.out.println(getArticulos() + "  " + getTienda() + " " + getPrecio() + " " + getForma_pago() + " " + getNombre() + " " +getPlazo_meses());
	}
}
