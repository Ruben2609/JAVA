package Herenciaejemplos;

public class Mainabstracto {
	public static void main(String[]args) {
		Circulo circulo = new Circulo("Circulo", "Morado", 20.0);
		
		circulo.calcularArea();
		circulo.calcularArea();
		circulo.modelarFiguras();
		
		System.out.println("------------------------------");
		
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Verde", 15);
		
		cuadrado.calcularArea();
		cuadrado.calcularArea();
		cuadrado.modelarFiguras();
		
System.out.println("------------------------------");
		
		Triangulo triangulo = new Triangulo("Triangulo equilatero", "Amarillo", 42);
		
		triangulo.calcularArea();
		triangulo.calcularArea();
		triangulo.modelarFiguras();
		
	}
}
