package cursoJAVA;
import java.util.Scanner;

public class Saludo {
	
	private String nombre1;
	private String nombre2;
	private byte edad1;
	private byte edad2;
 
	public void Info() {
		Scanner dato = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre ");
		nombre1 = dato.nextLine();
		
		System.out.print("Ingresa tu nombre ");
		nombre2 = dato.nextLine();
		
		System.out.print("Ingresa tu edad ");
		edad1 = dato.nextByte();
		
		System.out.print("Ingresa tu edad ");
		edad2 = dato.nextByte();
		
		if (edad1>edad2) {
			System.out.println("El mayor es "+nombre1);
			System.out.println("El menor es "+nombre2);
			 
		} 
		else {
			System.out.println("El mayor es "+nombre2);
			System.out.println("El menor es "+nombre1);
		}
		
		
	}
	
	public static void main(String[]args) {
		Saludo hola = new Saludo();
		hola.Info();
		
	
		
	}
}
