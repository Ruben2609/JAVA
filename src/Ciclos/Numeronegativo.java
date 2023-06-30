package Ciclos;
import java.util.Scanner;
public class Numeronegativo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Ingresa un numero positivo o negativo ");
			numero = input.nextInt();
			
		}while (numero > -5 && numero <= 0);
		System.out.println("El numero es mayor a -5");
	}
		
}
