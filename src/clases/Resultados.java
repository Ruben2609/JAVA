package clases;
import java.util.Scanner;

public class Resultados {
	
  public static void main(String[]args) {
	  Scanner input = new Scanner(System.in);
	  
	  AreaRectangulo rectangulo = new AreaRectangulo();
	  rectangulo.Area();
	  rectangulo.Perimetro();
	  
	  System.out.println("Ingresa base del rectangulo");
	  rectangulo.base = input.nextDouble();
	  
	  System.out.println("Ingresa altura del rectangulo");
	  rectangulo.altura = input.nextDouble();
	  
	  System.out.println("El area del rectangulo es "+rectangulo.Area());
	  
	  System.out.println("El perimetro del rectangulo es "+rectangulo.Perimetro());
	  
	  System.out.println("---------------------------");
	  
	  AreaTriangulo triangulo = new AreaTriangulo();
	  triangulo.Area();
	  triangulo.Perimetro();
	  
	  System.out.println("Ingresa el primer lado del triangulo");
	  triangulo.lado1 = input.nextDouble();
	  
	  System.out.println("Ingresa el segundo lado del triangulo");
	  triangulo.lado2 = input.nextDouble();
	  
	  System.out.println("Ingresa el tercer lado del triangulo");
	  triangulo.lado3 = input.nextDouble();
	  
	  System.out.println("El area del triangulo es "+triangulo.Area());
	  
	  System.out.println("El perimetro del rectangulo es "+triangulo.Perimetro());
	  
  }
	

	
}
