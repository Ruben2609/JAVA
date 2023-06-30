package Ciclos;
import java.util.Scanner;
public class Menu {
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		byte opt;
		
		
		
		System.out.println("1. Pan duro");
		System.out.println("2. Chamoyadas");
		System.out.println("3. Huevo con chorizo");
		System.out.println("4. Sopa du maccaco");
		System.out.println("5. Tacos de sal");
		System.out.println("                 ");
		System.out.println("Elija una opcion del 1 al 5");
		opt = input.nextByte();
		switch(opt) {
		case 1:
			System.out.println("Has elegido pan duro");
			break;
		case 2:
			System.out.println("Has elegido chamoyadas");
			break;
		case 3:
			System.out.println("Has elegido huevo con chorizo");
			break;
		case 4:
			System.out.println("Has elegido sopa du maccaco");
			break;
		case 5:
			System.out.println("Has elegido tacos de sal");
			break;
		default:
			System.out.println("Opcion incorrecta");
			
		}
	}
}
