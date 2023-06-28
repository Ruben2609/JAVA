package condicionales;
import java.util.Scanner;
public class Positivonegativo {

		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Ingresa el numero ");
			int numero = input.nextInt();
			
			if(numero > 0) {
				System.out.println("El numero es positivo");
			} else if(numero < 0){
				System.out.println("El numero es negativo");
			}  else {
				System.out.println("El numero es cero");  
			}
			
			}
		
}
