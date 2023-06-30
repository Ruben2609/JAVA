package Ciclos;
import java.util.Scanner;
public class Diassemana {
		
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int dias;
		
		System.out.println("Ingresa un numero del 1 al 7");
		dias = input.nextInt();
		
		switch(dias) {
		case 1: 
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Lunes");
			break;
		case 3: 
			System.out.println("Martes");
			break;
		case 4: 
			System.out.println("Miercoles");
			break;
		case 5: 
			System.out.println("Jueves");
			break;
		case 6: 
			System.out.println("Viernes");
			break;
		case 7: 
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Numero incorrecto");
			break;
		}
	}
}
