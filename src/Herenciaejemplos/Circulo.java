package Herenciaejemplos;

public class Circulo extends Figura {
	double radio;
	
			
	   	public Circulo(String nombre, String color, double radio) {
			super(nombre, color);
			this.radio = radio;
	   	}
			
			@Override
			public double calcularArea() {
				return  Math.PI * Math.pow(radio, 2);
				
			}
			@Override
			public double calcularPerimetro() {
				return (2 * Math.PI) * radio;
				
			}
	    
		@Override
		public void modelarFiguras() {
			System.out.println("La figura es: " + nombre);
	        System.out.println("Color: " + color);
	        System.out.println("Su radio es: " + radio);
	        System.out.println("Su area es: " + calcularArea());
	        System.out.println("Su perimetro es: " + calcularPerimetro());
}
		
		
}
		