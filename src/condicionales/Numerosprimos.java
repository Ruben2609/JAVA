package condicionales;
import java.util.Scanner;

public class Numerosprimos {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el numero ");
		int numero = input.nextInt();
		
		
		if(numero % 2 == 0) {
			System.out.println("El numero es par");
		} else{
			if(numero / numero == 1)  {
				System.out.println("El numero es impar y primo");
			}   
		}
		
	}
}
