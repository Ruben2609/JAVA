package cursoJAVA;
import java.util.Scanner;

public class Test14 {

	public static void main(String[]args) {
		Scanner datos = new Scanner(System.in);
		byte dividendo;
		byte divisor;
		
		System.out.println("Ingresa el primer dato "); 
		dividendo = datos.nextByte();
		
		System.out.println("Ingresa el segundo dato "); 
		divisor = datos.nextByte();
		
		practica14 test = new practica14(dividendo, divisor);
		
		System.out.println("--------------------");
		test.datos();
		
		
	}
	
}
