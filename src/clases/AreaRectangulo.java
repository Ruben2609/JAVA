package clases;

public class AreaRectangulo {
	public double base;
	public double altura;
	public double setDatos;
	
	public void setDatos(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public double Area() {
		double areaRect = base * altura;
		return areaRect;
		
	}
	public double Perimetro() {
		double perRect = 2 * (base + altura);
		return perRect;
	}
}
