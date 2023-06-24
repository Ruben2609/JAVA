package clases;

public class AreaTriangulo {
	public double lado1;
	public double lado2;
	public double lado3;
	
	public void Datos(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	public double Area() {
		double areaTri = lado1 * lado2 * lado3;
		return areaTri;
	}
	public double Perimetro() {
		double perTri = lado1 + lado2 + lado3;
		return perTri;
	}
	
	
}
