package condicionales;
import java.util.Scanner;
public class Añobisiesto {
	
 public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Ingrese el año");
	int year = input.nextInt();
	
	
	
	if(year % 4 == 0 && year % 100 != 0) {
		System.out.println("El año es bisiesto ");
	}
	else {
		System.out.println("El año no es bisiesto ");
	}
 }
}
