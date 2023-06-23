package cursoJAVA;
import java.util.Scanner;
public class Circulo {

	public static double areaCirculo(double radio,double pi) {
		double area = pi * Math.pow(radio,2);
		return area;
		
	}
	
	public static void main(String[]arg) {
		Scanner input = new Scanner(System.in);
		
		double radio;
		double pi =  3.1416;
		
		System.out.println("Radio del circulo ");
		radio = input.nextDouble();
		
		double farea = areaCirculo(radio, pi);
		System.out.println("El area del circulo es "+ farea);
		
		
		
	}
} 
