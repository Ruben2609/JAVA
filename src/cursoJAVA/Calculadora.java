package cursoJAVA;
import java.util.Scanner;

public class Calculadora {

	public static double interesSimple(double principal, double tasaInteres, double tiempo) {
		double interes = (principal * tasaInteres * tiempo)/100;
		return interes;
	}
	public static double interesCompuesto(double principal, double tasaInteres, double tiempo) {
		double interes = principal * Math.pow(1 + (tasaInteres /100), tiempo)- principal;
		return interes;
	}

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double principal;
		double tasaInteres;
		double tiempo;
		
		System.out.println("Ingresa el monto principal ");
		principal = input.nextDouble();
		
		System.out.println("Ingresa la tasa de interes ");
		tasaInteres = input.nextDouble();
		
		if(tasaInteres>5) {
			tiempo = 10;
		}
		else {
			System.out.println("Ingresa el tiempo ");
			tiempo = input.nextDouble();
		}
		
		double calIntSimp = interesSimple(principal, tasaInteres, tiempo);
		System.out.println("Interes Simple "+ calIntSimp);
		
		double calIntCom = interesCompuesto(principal, tasaInteres, tiempo);
		System.out.println("Interes Compuesto "+ calIntCom);
				
	}
	
}
