package tarea15;
import java.util.Scanner;

	public class CalculadoraIva {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el precio del producto: ");
	        double precio = scanner.nextDouble();

	        double precioConIVA = agregarIVA(precio);
	        System.out.println("Precio con IVA: " + precioConIVA);

	        double precioFinal = aplicarDescuento(precioConIVA);
	        System.out.println("Precio final con descuento: " + precioFinal);

	        scanner.close();
	    }

	    public static double agregarIVA(double precio) {
	        double iva = precio * 0.12; 
	        return precio + iva;
	    }

	    public static double aplicarDescuento(double precio) {
	        double descuento;

	        if (precio > 50) {
	            descuento = precio * 0.1;
	        } else {
	            descuento = precio * 0.05;
	        }

	        return precio - descuento;
	    }
	}


