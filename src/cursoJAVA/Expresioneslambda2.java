package cursoJAVA;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Expresioneslambda2 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<>();
	
		numeros.add(10);
		numeros.add(5);
		numeros.add(30);
		numeros.add(14);
		numeros.add(8);
	
		Function <Integer, Integer> calcular = (num) -> num * (2);
		
		int numero = input.nextInt();
		int resultado = calcular.apply(numero);
		
		System.out.println("El resultado del numero es " + resultado);
		
	}
}
