package Herenciaejemplos;

public class Triangulo extends Figura{
	int lado;
	
	public Triangulo(String nombre, String color, int lado) {
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
		return (lado*lado)/2;
	}

	@Override
	public double calcularPerimetro() {
		return lado*3;
	}

	

}
