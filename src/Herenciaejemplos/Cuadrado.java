package Herenciaejemplos;

public class Cuadrado extends Figura{
	int lado;

	public Cuadrado(String nombre, String color, int lado) {
		super(nombre, color);
		this.lado = lado;
	}

	@Override
	public void modelarFiguras() {
		System.out.println("La figura es: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Su lado es " + lado);
        System.out.println("Su area es: " + calcularArea());
        System.out.println("Su perimetro es: " + calcularPerimetro());
		
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}
	@Override
	public double calcularPerimetro() {
		return lado*4;
	}
	
	
	

	}


