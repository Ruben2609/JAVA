package condicionales;
import java.util.Scanner;

public class Tarea16 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero ");
		int num1 = input.nextInt();
		
		System.out.println("Ingrese el segundo numero ");
		int num2 = input.nextInt();
		
		System.out.println("Ingrese el tercer numero ");
		int num3 = input.nextInt();
		
		int mayor = Math.max(num1, Math.max(num2, num3));
		int mayor2;
		
		int menor = Math.min(num1, Math.min(num2, num3));
		
		if(mayor == num1) {
			mayor2 = Math.max(num2, num3);
		}else if(mayor == num2) {
			mayor2 = Math.max(num1, num3);
 		}else
 			mayor2 = Math.max(num1, num2);
		
		int result = mayor % mayor2;
			
		if(result == 0) {
			System.out.println("El residuo es cero");
			
		}
		
		else {
			System.out.println("Los numeros mayores son " + mayor + " y " + mayor2);
			System.out.println("La suma del residuo y numero menor es " + (result + menor));
		}
		
	}
	
		
	
}
