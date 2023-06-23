package cursoJAVA;
import java.util.Scanner;

public class Promedio {
	 
	 
	public static float promedio(float num1,float num2,float num3) {
		float result = (num1 + num2 + num3)/3;				
		return result;
	}
	
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		float num1;
		float num2;
		float num3;
		
		System.out.println("Ingresa el primer valor ");
			num1 = input.nextFloat();
			

		System.out.println("Ingresa el segundo valor ");
			num2 = input.nextFloat();
			

		System.out.println("Ingresa el tercer valor ");
			num3 = input.nextFloat();
			
		float fresult = promedio(num1,num2,num3);
		System.out.println("Promedio igual a "+fresult);
	}
}
