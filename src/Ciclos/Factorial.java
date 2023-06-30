package Ciclos;
import java.util.Scanner;
public class Factorial {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int numero;
		int factorial =1;
		
		System.out.println("Ingrese un numero positivo");
		numero = input.nextInt();
		
		do {
			factorial *= numero;
			numero--;
		} while (numero > 0);
		
		System.out.println("El factorial es "+ factorial);
			
		
		
	}
}
