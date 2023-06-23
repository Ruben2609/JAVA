package cursoJAVA;
import java.util.Scanner;

public class Testcalculadora {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int opt; 
		
		float num1;
		float num2;
		
		Calculadoracompleta calculadora = null;
		
		do {
			System.out.println("[1]Suma");
			System.out.println("[2]Resta");
			System.out.println("[3]Division");
			System.out.println("[4]Multiplicacion");
			System.out.println("[5]Salir");
			System.out.println("Ingrese la opcion deseada");
			opt = input.nextInt();
			switch(opt) {
				case 1: 
					System.out.println("Ingresa el primer numero ");
					num1 = input.nextFloat();
					System.out.println("Ingresa el segundo numero ");
					num2 = input.nextFloat();
					calculadora = new Calculadoracompleta(num1, num2);
					calculadora.suma();
					break;
				case 2: 
					System.out.println("Ingresa el primer numero ");
					num1 = input.nextFloat();
					System.out.println("Ingresa el segundo numero ");
					num2 = input.nextFloat();
					calculadora = new Calculadoracompleta(num1, num2);
					calculadora.resta();
					break;
				case 3:
					System.out.println("Ingresa el primer numero ");
					num1 = input.nextFloat();
					System.out.println("Ingresa el segundo numero ");
					num2 = input.nextFloat();
					calculadora = new Calculadoracompleta(num1, num2);
					calculadora.division();
					break;
				case 4:
					System.out.println("Ingresa el primer numero ");
					num1 = input.nextFloat();
					System.out.println("Ingresa el segundo numero ");
					num2 = input.nextFloat();
					calculadora = new Calculadoracompleta(num1, num2);
					calculadora.multiplicacion();
					break;
					
			}
		} while (opt!= 5);
			
	}
}

