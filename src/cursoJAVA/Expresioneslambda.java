package cursoJAVA;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Scanner;

public class Expresioneslambda {
	
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		Function <String, String> convertir = (texto) -> texto.toLowerCase(); 
		
		String Mayusculas = input.next();
		String Minusculas = convertir.apply(Mayusculas);
		
		System.out.println(Minusculas);
	}
		
}
